class OutParam extends InOut {
  String id;
  String type;
  
  public OutParam (String i, String t) {
    id = i;
    type = t;
  }

  public String toString(int t) {
    return "out:" + id + " (" + type + ")";
  }
}
