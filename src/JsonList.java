import java.util.ArrayList;

class JsonList implements JsonValue{
    ArrayList<String> val;

    JsonList (ArrayList<String> req){
        this.val = req;
    }
}
