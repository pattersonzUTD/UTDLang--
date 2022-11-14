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

  public String typeCheck()  throws UTDLangException  {
    symbolTable.addVar(id,type.toLowerCase());
    return "";
  }
  public String getType() {
    return type;
  }

}
