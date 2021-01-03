grammar tpCGS;
//PARSER
@header{
    import java.util.HashMap;
    import java.util.ArrayList;

}

sistema
@init {
    ArrayList<String> concepts = new ArrayList<>();
    HashMap<Integer, Entity> students =  new HashMap<>();
    HashMap<Integer, Entity> resources =  new HashMap<>();
}
:
    conc ':' c1=list[concepts]
    stu':'  a1=entityList[students]
    res ':' r1=entityList[resources] {   View v = new View($c1.conceptsOUT,$a1.genOUT,$r1.genOUT);  }
    ;

entityList[HashMap<Integer, Entity> genIN] returns [HashMap<Integer, Entity> genOUT]
@init {
    Entity ent = new Entity();
    ent.data = new HashMap<>();
    Integer i = 0;
}

    : '[' g1=entityObject {ent.data = $g1.ret; genIN.put(i,ent); $genOUT=$genIN; i=1;}
    (',' g2=entityObject { Entity ent2 =  new Entity();
                        ent2.data = $g2.ret; $genOUT.put(i,ent2);$genOUT=$genIN;i=i+1;})* ']'

    |
    ;

entityObject returns [HashMap<String, JsonValue> ret]
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
: key=word ':' vv=entityValue
{$kIN.put($key.text, $vv.val);$kOUT = $kIN; }
;

entityValue returns [JsonValue val]
@init{
ArrayList<String> concepts = new ArrayList<>();
}
:

          num {$val = new JsonNum(Integer.parseInt($num.text));}
        | quotedWord {String p = $quotedWord.text.toString(); $val = new JsonString(p);}
        | ret=entityObject {$val = new Json($ret.ret);}
        | c2=list[concepts] {$val = new JsonList($c2.conceptsOUT);}
        ;


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
QWORD : ["][A-Za-z][A-Za-z0-9_\-:/.%,#!]*([ ]*[A-Za-z][A-Za-z0-9_\-:/.%,#!]*)*["];
WS: ('\r'? '\n' | ' ' | '\t')+ -> skip;



