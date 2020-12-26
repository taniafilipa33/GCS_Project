import com.sun.deploy.util.StringUtils;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Stream;

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
        averages[1] = ((JsonNum) ((Json) e1.data.get ("characteristics")).val.get ("selflearning")).val / characs [1];
        averages[2] = ((JsonNum) ((Json) e1.data.get ("characteristics")).val.get ("resolve")).val / characs [2];
        averages[3] = ((JsonNum) ((Json) e1.data.get ("characteristics")).val.get ("deduction")).val / characs [3];
        averages[4] = ((JsonNum) ((Json) e1.data.get ("characteristics")).val.get ("motivation")).val / characs [4];
        averages[5] = ((JsonNum) ((Json) e1.data.get ("characteristics")).val.get ("time_management")).val / characs [5];
        return (averages[0] + averages[1] + averages[2] + averages[3] + averages[4] + averages[5])/6;
    }
    public void query1(List<Integer> studentsList, int conceptIndex, int n) {
        int[] characs = new int[6];
        Entity[] best_resources = new Entity[n];
        for (int student_index : studentsList) {
            Entity student = new Entity ();
            student = students.get (student_index);

            characs[0] += ((JsonNum) ((Json) student.data.get("characteristics")).val.get ("attention")).val;
            characs[1] += ((JsonNum) ((Json) student.data.get("characteristics")).val.get ("selflearning")).val;
            characs[2] += ((JsonNum) ((Json) student.data.get("characteristics")).val.get ("resolve")).val;
            characs[3] += ((JsonNum) ((Json) student.data.get("characteristics")).val.get ("deduction")).val;
            characs[4] += ((JsonNum) ((Json) student.data.get("characteristics")).val.get ("motivation")).val;
            characs[5] += ((JsonNum) ((Json) student.data.get("characteristics")).val.get ("time_management")).val;

        }
        for (int i = 0; i < 6; i++) {
            characs[i] = characs[i] / studentsList.size ();
        }

        for (int key : resources.keySet ()) {
            Entity e = resources.get (key);
            String concep = concepts.get (conceptIndex);
            if (((JsonList) (e.data.get ("concepts"))).val.contains (concep)) {
                int lesser_index = 0;
                for (int i = 0; i < n; i++) {
                    if (compare (best_resources[i], characs) < compare (best_resources[lesser_index], characs)) {
                        lesser_index = i;
                    }
                }
                if (compare (e, characs) < compare (best_resources[lesser_index], characs)) {
                    best_resources[lesser_index] = e;
                }
            }
        }

        for(int i = 0; i < n; i++){
            System.out.println(i + " -> " + ((JsonString)(best_resources[i].data.get("name"))).val);
        }
    }

    public void query2(){

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
                    int n = scan.nextInt();
                    if(n!=0)
                        this.query1(studentsList,conceptIndex, n);

                    break;
                case 2:
                    break;
                default:
                    break;
            }

        }
    }
    public List<Integer> stuSelector(HashMap<Integer, Entity> st){
        int index = 1;
        int pag = 1;
        List<Integer> res = new ArrayList<>();
        Scanner scan;
        String pagina;
        int opt = 1;
        int i ;
        while(opt!= 0) {
            i = 0;
            opt = 1;
            System.out.println ("To add a student to a query write its number\n To jump to between pages write 'page' and then the number\n To end Student Selector write 0 ");
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
                        res.add (opt);
                    System.out.println ("Student added to query");
                } catch (NumberFormatException e) {
                    String oi = pagina.split (" ")[1];
                    pag = Integer.parseInt (oi);
                    opt = -1; // significa que muda de página e vai printar a proxima lista de alunos
                }

            }
        }
        return res;
    }

    public Integer concSelector(ArrayList<String> st){
        int index = 1;
        int pag = 1;
        int res = -1;
        Scanner scan;
        String pagina;
        int opt = 1;
        int i ;
        while(opt!= 0) {
            i = 0;
            System.out.println ("To add a concept to a query write its number\n To jump to between pages write 'page' and then the number\n To end Concept Selector write 0 ");
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
                    res = (opt);
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


