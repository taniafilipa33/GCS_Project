import java.util.HashMap;

class Json implements JsonValue {
    HashMap<String, JsonValue> val;

    Json (HashMap<String, JsonValue> req){
        this.val = req;
    }
}
