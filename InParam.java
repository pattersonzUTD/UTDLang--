class InParam extends InOut {
  String id;
  String type;
  
  public InParam (String i, String t) {
    id = i;
    type = t;
  }

  public String toString(int t) {
    return "in:" + id + " (" + type + ")";
  }
}
