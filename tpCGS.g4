grammar tpCGS;
//PARSER
@header{
    import java.util.HashMap;
    import java.util.ArrayList;
}
@members{

  class Entity {
    HashMap<String, JsonValue> data;
  }

  interface JsonValue {}

  class JsonString implements JsonValue {
    String val = "";

    JsonString(String i){
        this.val = i;
       }
    @Override
    public String toString(){
        return this.val;
    }
   }
  class JsonNum implements JsonValue {
   Integer val = -1;

   JsonNum(Integer i){
    this.val = i;
   }
  }

  class Json implements JsonValue {
    HashMap<String, JsonValue> val;

    Json (HashMap<String, JsonValue> req){
        this.val = req;
    }
  }

  class JsonList implements JsonValue{
    ArrayList<String> val;

    JsonList (ArrayList<String> req){
        this.val = req;
    }
  }

}
main
@init {
    ArrayList<String> concepts = new ArrayList<>();
    HashMap<Integer, Entity> students =  new HashMap<>();
    HashMap<Integer, Entity> resources =  new HashMap<>();
}
:
    conc ':' c1=list[concepts]
    stu':'  a1=jsonList[students]
    res ':' r1=jsonList[resources] { for(Integer key : $a1.genOUT.keySet())
                                        System.out.println($a1.genOUT.get(key).data.get("name"));};

jsonList[HashMap<Integer, Entity> genIN] returns [HashMap<Integer, Entity> genOUT]
@init {
    Entity ent = new Entity();
    ent.data = new HashMap<>();
    Entity ent2 =  new Entity();
    ent2.data = new HashMap<>();
    Integer i = 0;
}

    : '[' g1=jsonObject {ent.data = $g1.ret; genIN.put(i++,ent); $genOUT=$genIN;}
    (',' g2=jsonObject { ent2.data = $g2.ret; $genOUT.put(i++,ent2);$genOUT=genIN;})* ']'
    
    |
    ;

jsonObject returns [HashMap<String, JsonValue> ret]
@init{
    HashMap<String, JsonValue> req = new HashMap<>();
}
:
 '{' pairKeyValue[req] (',' pairKeyValue[req])* '}' {$ret = req;}
 ;

list[ArrayList<String> conceptsIN] returns [ArrayList<String> conceptsOUT]
        : '[' qw1=quotedWord {conceptsIN.add($qw1.text);$conceptsOUT = $conceptsIN;}
         (cs2=resOfL[$conceptsOUT] {$conceptsOUT = $cs2.concOUT;} )* ']' ;

resOfL[ArrayList<String> concIN] returns [ArrayList<String>concOUT]:
        ',' qw2=quotedWord {$concIN.add($qw2.text);$concOUT = $concIN;} ; 

pairKeyValue[HashMap<String, JsonValue> kIN] returns [HashMap<String, JsonValue> kOUT]
: key=word ':' vv=jsonValue
{$kIN.put($key.text, $vv.val);$kOUT = $kIN; }
;

jsonValue returns [JsonValue val]
@init{
ArrayList<String> concepts = new ArrayList<>();
}
:

          num {$val = new JsonNum(Integer.parseInt($num.text));}
        | quotedWord {$val = new JsonString($quotedWord.text);}
        | ret=jsonObject {$val = new Json($ret.ret);}
        | c2=list[concepts] {$val = new JsonList($c2.conceptsOUT);}
        ;

//attention : ATTENTION;
//timeMan: TIMEMANAGEMENT;
//deduction : DEDUCTION;
//selfL: SELFLEARNING;
//resolve : RESOLVE;
//motivation : MOTIVATION;
quotedWord: QWORD;
word : WORD;
num : NUM;
conc : CONCEPTS;
stu : STUDENTS;
res : RESOURCES;
//LEXER

CONCEPTS: '|'[Cc][oO][nN][cC][eE][pP][tT][sS]'|' ;
STUDENTS: '|'[Ss][Tt][uU][dD][eE][nN][tT][sS]'|' ;
RESOURCES: '|'[rR][eE][sS][oO][uU][rR][cC][eE][sS]'|' ;


WORD : [A-Za-z][A-Za-z0-9_\-]*([ ]*[A-Za-z][A-Za-z0-9_\-]*)*;
NUM: [0-9]+;
QWORD : ["][A-Za-z][A-Za-z0-9_\-]*([ ]*[A-Za-z][A-Za-z0-9_\-]*)*["];
WS: ('\r'? '\n' | ' ' | '\t')+ -> skip;



//ATTENTION : ["][Aa][Tt][Ee][Nn][Tt][Ii][Oo][Nn]["];
//SELFLEARNING : ["][Ss][Ee][Ll][Ff][\-][Ll][Ee][Aa][Rr][Nn][Ii][Nn][Gg]["];
//TIMEMANAGEMENT: ["][Tt][Ii][Mm][Ee][\-][Mm][Aa][Nn][Aa][Gg][Ee][Mm][Ee][Nn][Tt]["];
//RESOLVE : ["][Rr][Ee][Ss][Oo][Ll][Vv][Ee]["];
//MOTIVATION : ["][Mm][Oo][Tt][Ii][Vv][Aa][Tt][Ii][Oo][Nn]["];
//DEDUCTION:["][Dd][Ee][Dd][Uu][Cc][Tt][Ii][Oo][Nn]["];
