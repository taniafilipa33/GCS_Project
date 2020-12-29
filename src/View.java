import java.util.*;

public class View {
    private ArrayList<String> concepts;
    private HashMap<Integer, Entity> students;
    private HashMap<Integer, Entity> resources;

    public View(ArrayList<String> c,HashMap<Integer, Entity> s, HashMap<Integer, Entity> r){
        concepts = new ArrayList<>(c);
        students = new HashMap<>(s);
        resources = new HashMap<>(r);
        start();
    }

    public float compare(Entity e1, int [] characs) {
        float[] averages = new float[6];
        averages[0] = ((JsonNum) ((Json) e1.data.get ("characteristics")).val.get ("attention")).val / characs [0];
        averages[2] = ((JsonNum) ((Json) e1.data.get ("characteristics")).val.get ("resolve")).val / characs [2];
        averages[1] = ((JsonNum) ((Json) e1.data.get ("characteristics")).val.get ("self-learning")).val / characs [1];
        averages[3] = ((JsonNum) ((Json) e1.data.get ("characteristics")).val.get ("deduction")).val / characs [3];
        averages[4] = ((JsonNum) ((Json) e1.data.get ("characteristics")).val.get ("motivation")).val / characs [4];
        averages[5] = ((JsonNum) ((Json) e1.data.get ("characteristics")).val.get ("time_management")).val / characs [5];
        return (averages[0] + averages[1] + averages[2] + averages[3] + averages[4] + averages[5])/6;
    }

    public float percent(Entity e1, int [] characs) {
        float[] averages = new float[6];
        averages[0] = characs [0] / ((JsonNum) ((Json) e1.data.get ("characteristics")).val.get ("attention")).val;
        averages[2] = characs [2] / ((JsonNum) ((Json) e1.data.get ("characteristics")).val.get ("resolve")).val;
        averages[1] = characs [1] / ((JsonNum) ((Json) e1.data.get ("characteristics")).val.get ("self-learning")).val;
        averages[3] = characs [3] / ((JsonNum) ((Json) e1.data.get ("characteristics")).val.get ("deduction")).val;
        averages[4] = characs [4] / ((JsonNum) ((Json) e1.data.get ("characteristics")).val.get ("motivation")).val;
        averages[5] = characs [5] / ((JsonNum) ((Json) e1.data.get ("characteristics")).val.get ("time_management")).val;
        return ((averages[0] + averages[1] + averages[2] + averages[3] + averages[4] + averages[5])/6) * 100;
    }

    public float compare2(Entity e1, Entity e2) {
        float[] averages = new float[6];
        averages[0] = ((JsonNum) ((Json) e1.data.get ("characteristics")).val.get ("attention")).val / ((JsonNum) ((Json) e2.data.get ("characteristics")).val.get ("attention")).val;
        averages[1] = ((JsonNum) ((Json) e1.data.get ("characteristics")).val.get ("self-learning")).val / ((JsonNum) ((Json) e1.data.get ("characteristics")).val.get ("self-learning")).val;
        averages[2] = ((JsonNum) ((Json) e1.data.get ("characteristics")).val.get ("resolve")).val / ((JsonNum) ((Json) e1.data.get ("characteristics")).val.get ("resolve")).val;
        averages[3] = ((JsonNum) ((Json) e1.data.get ("characteristics")).val.get ("deduction")).val / ((JsonNum) ((Json) e1.data.get ("characteristics")).val.get ("deduction")).val;
        averages[4] = ((JsonNum) ((Json) e1.data.get ("characteristics")).val.get ("motivation")).val / ((JsonNum) ((Json) e1.data.get ("characteristics")).val.get ("motivation")).val;
        averages[5] = ((JsonNum) ((Json) e1.data.get ("characteristics")).val.get ("time_management")).val / ((JsonNum) ((Json) e1.data.get ("characteristics")).val.get ("time_management")).val;
        return (averages[0] + averages[1] + averages[2] + averages[3] + averages[4] + averages[5])/6;
    }

    public void query1(List<Integer> studentsList, int conceptIndex, int n) {
        int[] characs = new int[6];
        Arrays.fill(characs, 0);
        Entity[] best_resources = new Entity[n];

        Entity student;

        for (int student_index = 0; student_index < studentsList.size(); student_index++) {
            student = students.get (student_index);
            characs[0] += ((JsonNum) ((Json) student.data.get("characteristics")).val.get ("attention")).val;
            characs[1] += ((JsonNum) ((Json) student.data.get("characteristics")).val.get ("self-learning")).val;
            characs[2] += ((JsonNum) ((Json) student.data.get("characteristics")).val.get ("resolve")).val;
            characs[3] += ((JsonNum) ((Json) student.data.get("characteristics")).val.get ("deduction")).val;
            characs[4] += ((JsonNum) ((Json) student.data.get("characteristics")).val.get ("motivation")).val;
            characs[5] += ((JsonNum) ((Json) student.data.get("characteristics")).val.get ("time_management")).val;

        }
        for (int i = 0; i < 6; i++) {
            characs[i] = characs[i] / studentsList.size ();
        }

        for (int key : resources.keySet ()) {
            String concep = concepts.get (conceptIndex);
            Entity e;
            e = resources.get(key);

            if (((JsonList) (resources.get (key).data.get ("concepts"))).val.contains (concep)) {
                int lesser_index = 0;
                for (int i = 0; i < n; i++) {
                    if(best_resources[i] == null){
                        best_resources[i] = resources.get(i);
                    }

                    else if (compare (best_resources[i], characs) < 1) {
                        lesser_index = i;
                    }
                }
                if (compare (e, characs) < compare (best_resources[lesser_index], characs)) {
                    best_resources[lesser_index] = e;
                }
            }
        }

        for(int i = 0; i < n; i++){
            System.out.println(i + " -> " + ((JsonString)(best_resources[i].data.get("name"))).val + " with a match of " + percent(best_resources[i], characs) + " %");
        }

    }

    public void query2(int conceptIndex, int n){
        Entity [] best_resources = new Entity[n];
        for (int key : resources.keySet()) {
            String concep = concepts.get (conceptIndex);
            Entity e;
            e = resources.get(key);
            if (((JsonList) (e.data.get ("concepts"))).val.contains (concep)) {
                int lesser_index = 0;
                for (int i = 0; i < n; i++) {
                    if(best_resources[i] == null){
                        best_resources[i] = resources.get(i);
                    }
                    else if (compare2 (best_resources[i], best_resources[lesser_index]) < 1) {
                        lesser_index = i;
                    }
                }
                if (compare2 (e, best_resources[lesser_index]) < 1) {
                    best_resources[lesser_index] = resources.get (key);
                }
            }
        }
        for(int i = 0; i < n; i++){
                System.out.println(i + " -> " + ((JsonString)(best_resources[i].data.get("name"))).val);
        }

    }

    public void start(){
        Scanner scan ;
        int opt = 1;

        while(opt != 0) {
            System.out.println("Menu:\n1 -> match students and concept with respective resources\n2 -> most inclusive resources for a certain concept\n0 -> exit");
            scan = new Scanner(System.in);
            opt = scan.nextInt();
            switch (opt){
                case 1:
                    //students selector
                    List<Integer> studentsList;
                    studentsList = stuSelector(students);
                    //Stream.of(studentsList.toString()).forEach(System.out::println);
                    //concept selector
                    int conceptIndex = concSelector(concepts);
                    //System.out.println(conceptIndex);
                    System.out.println("Choose the number of resources you want:");
                    int n =getResourcesByConcept(conceptIndex);
                    if(n>0)
                        this.query1(studentsList,conceptIndex, n);
                    break;
                case 2:
                    int conceptIndex2 = concSelector(concepts);
                    System.out.println("Choose the number of resources you want:");
                    int count = getResourcesByConcept (conceptIndex2);
                    if(count>0)
                        this.query2 (conceptIndex2, count);
                    break;
                default:
                    break;
            }

        }
    }

    public int getResourcesByConcept(int conceptIndex2){
        System.out.println ("To choose all available resourses write 'all'");
        Scanner scan = new Scanner (System.in);
        int count =0;
        String valor = scan.nextLine ();
        try{
            int n2 = Integer.parseInt (valor);
            for(int i=0; i<resources.size ();i++){
                if(((JsonList) (resources.get (i).data.get ("concepts"))).val.contains (concepts.get(conceptIndex2)))
                    count++;
            }
            if(n2>count) {n2 = count; count = n2;}
            else{ count = n2;}
        }catch (NumberFormatException a){
            if(valor.equals ("all")) {
                for(int i=0; i<resources.size ();i++){
                    if(((JsonList) (resources.get (i).data.get ("concepts"))).val.contains (concepts.get(conceptIndex2)))
                        count++;
                }
            }
        }
        return count;
    }

    public List<Integer> stuSelector(HashMap<Integer, Entity> st){
        int index;
        int pag = 1;
        List<Integer> res = new ArrayList<>();
        Scanner scan;
        String pagina;
        int opt = 1;
        int i ;
        while(opt!= 0) {
            i = 0;
            opt = 1;
            System.out.println ("To add a student to a query write its number\n To jump to between pages write 'page' and then the number\n To add all students write 'all' \nTo end Student Selector write 0 ");
            for (index = 10 * (pag - 1); index < st.size (); i++) {
                if (i == 10) break;
                System.out.println (index + 1 + " -> " + st.get (index).data.get ("name"));
                index++;
            }
            System.out.println ("------------Pages " + pag + " to " + ((st.size () / 10)+1));
            scan = new Scanner (System.in);
            while (opt != 0 && opt != -1) {
                pagina = scan.nextLine ();
                try {
                    // checking valid integer using parseInt() method
                    opt = Integer.parseInt (pagina);
                    if (opt != 0)
                        res.add (opt-1);
                    System.out.println ("Student added to query");
                } catch (NumberFormatException e) {
                    if(pagina.equals ("all")) {
                        for(int h = 0; h<students.size ();h++) res.add(h);
                        System.out.println ("All students were selected");
                        opt = 0;
                    }
                    else {
                        String oi = pagina.split (" ")[1];
                        pag = Integer.parseInt (oi);
                        opt = -1; // significa que muda de página e vai printar a proxima lista de alunos
                    }
                }

            }
        }
        return res;
    }

    public Integer concSelector(ArrayList<String> st){
        int index;
        int pag = 1;
        int res = -1;
        Scanner scan;
        String pagina;
        int opt = 1;
        int i ;
        while(opt!= 0) {
            i = 0;
            System.out.println ("To add a concept to a query write its number\n To jump to between pages write 'page' and then the number\nTo end Concept Selector write 0 ");
            for (index = 10 * (pag - 1); index < st.size (); i++) {
                if (i == 10) break;
                System.out.println (index + 1 + " -> " + st.get(index));
                index++;
            }
            System.out.println ("------------Pages " + pag + " to " + ((st.size () / 10)+1));
            scan = new Scanner (System.in);
            pagina = scan.nextLine ();
            try {
               // checking valid integer using parseInt() method
                opt = Integer.parseInt (pagina);
                if (opt != 0)
                    res = (opt-1);
                System.out.println ("Concept added to query");
                opt = 0;
            } catch (NumberFormatException e) {
                String oi = pagina.split (" ")[1];
                pag = Integer.parseInt (oi);
            }

        }
        return res;
    }
}


