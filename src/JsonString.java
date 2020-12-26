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