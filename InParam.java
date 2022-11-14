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

  public String typeCheck() throws UTDLangException {
    symbolTable.addVar(id,type.toLowerCase());
    return "";
  }
  public String getType() {
    return type;
  }
}
