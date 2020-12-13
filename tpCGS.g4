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
  }

  class JsonNum implements JsonValue {
   int val = -1;

   JsonNum(int i){
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
    ArrayList<HashMap<Integer, Entity>> students = new ArrayList<>();
    ArrayList<HashMap<Integer, Entity>> resources = new ArrayList<>();
}
:
    conc ':' c1=list[concepts]
    stu':'  a1=jsonList[students]
    res ':' r1=jsonList[resources] ;

jsonList[ArrayList<HashMap<Integer, Entity>> genIN] returns [ArrayList<HashMap<Integer, Entity>> genOUT]
@init {
    Entity ent = new Entity();
    ent.data = new HashMap<>();
}

    : '[' g1=jsonObject {ent.data = $g1.ret; genOUT.add(ent);}(',' g2=jsonObject {Entity ent2 =  new Entity(); ent2.data = new HashMap<>(); ent2.data = $g2.ret; genOUT.add(ent2);})* ']'
    
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

pairKeyValue[HashMap<String, JsonValue> kIN] returns [HashMap<String, JsonValue> kOUT] : key=quotedWord ':' val=jsonValue {kOUT = kIN.put(key.text, val);} ;

jsonValue returns [JsonValue val]:
          num {$val = new JsonNum(Integer.parseInt($1.text));}
        | quotedWord {$val = new JsonString($1.text);}
        | ret=jsonObject {$val = new Json(ret);}
        | {ArrayList<String> concepts = new ArrayList<>();} c2=list[concepts] {$val = new JsonList(c2);}
        ;

//attention : ATTENTION;
//timeMan: TIMEMANAGEMENT;
//deduction : DEDUCTION;
//selfL: SELFLEARNING;
//resolve : RESOLVE;
//motivation : MOTIVATION;
quotedWord: QWORD;
num : NUM;
conc : CONCEPTS;
stu : STUDENTS;
res : RESOURCES;
//LEXER
CONCEPTS : [Cc][oO][nN][cC][eE][pP][tT][sS];
STUDENTS : [Ss][Tt][uU][dD][eE][nN][tT][sS];
RESOURCES : [rR][eE][sS][oO][uU][rR][cC][eE][sS];

//ATTENTION : ["][Aa][Tt][Ee][Nn][Tt][Ii][Oo][Nn]["];
//SELFLEARNING : ["][Ss][Ee][Ll][Ff][\-][Ll][Ee][Aa][Rr][Nn][Ii][Nn][Gg]["];
//TIMEMANAGEMENT: ["][Tt][Ii][Mm][Ee][\-][Mm][Aa][Nn][Aa][Gg][Ee][Mm][Ee][Nn][Tt]["];
//RESOLVE : ["][Rr][Ee][Ss][Oo][Ll][Vv][Ee]["];
//MOTIVATION : ["][Mm][Oo][Tt][Ii][Vv][Aa][Tt][Ii][Oo][Nn]["];
//DEDUCTION:["][Dd][Ee][Dd][Uu][Cc][Tt][Ii][Oo][Nn]["];

NUM: [0-9]+;
QWORD : ["][A-Za-z][A-Za-z0-9_\-]*([ ]*[A-Za-z][A-Za-z0-9_\-]*)*["];
WS: ('\r'? '\n' | ' ' | '\t')+ -> skip;