class Variable extends Token {
  String id;
  String type;
  
  public Variable (String i, String t) {
    id = i;
    type = t;
  }

  public String toString(int t) {
    return getTabs(t) + id + " (" + type + ") :)\n";
  }
}
