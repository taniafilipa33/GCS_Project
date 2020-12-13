grammar tpCGS;
//PARSER

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
   int val = null;

   JsonNum(int i){
    this.val = i;
   }
  }

  class Json implements JsonValue {
    HashMap<String, JsonValue> val;

    Json (HashMap<String, JsonValue> req){
        this.val = req.clone();
    }
  }

  class JsonList implements JsonValue{
    ArrayList<String> val;

    JsonList (ArrayList<String> req){
        this.val = req.clone();
    }
  }

}

main
@init {
    ArrayList<String> concepts = new ArrayList<>();
    ArrayList<HashMap<int, Entity>> students = new ArrayList<>();
    ArrayList<HashMap<int, Entity>> resources = new ArrayList<>();
}
:
    conc ':' c1=list[concepts]
    stu':'  a1=jsonList[students]
    res ':' r1=jsonList[resources] ;

jsonList[ArrayList<HashMap<int, Entity>> genIN] returns [ArrayList<HashMap<int, Entity>> genOUT]
@init {
    Entity ent = new Entity();
    ent.data = new HashMap<>();

    HashMap<int, Entity> ret = new HashMap<>();
}

    : '[' jsonObject (',' g2=jsonObject )* ']'
    {
        ret.put(ent.data.get("id"), ent);
        genOUT.add(ret);
    }
    |
    ;

jsonObject returns [HashMap<String, JsonValue> ret]
@init{
    HashMap<String, JsonValue> req = new HashMap<>();
}
:
 '{' pairKeyValue[req] (',' pairKeyValue[req])* '}' {ret = req}
 ;


list[ArrayList<String> conceptsIN] returns [ArrayList<String> conceptsOUT;]
        : '[' quotedWord {$conceptsIN.add($2);}
         (cs2=resOfL[conceptsIN] {$conceptsIN = cs2;} )* ']' {$conceptsOUT = $conceptsIN} ;

resOfL[ArrayList<String> concIN] returns [ArrayList<String>concOUT;]:
        ',' quotedWord {$concIN.add($2);$concOUT = $concIN} ;

pairKeyValue[HashMap<int,Entity> kIN;] returns [HashMap<int,Entity> kOUT] : key=quotedWord ':' val=jsonValue {kOUT = kIN.put(key.text, val)} ;

jsonValue returns [JsonValue val]:
          num {$val = new JsonNum($1.int);}
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