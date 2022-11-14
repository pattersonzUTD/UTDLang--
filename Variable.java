class Variable extends Statement {
  String id;
  String type;
  
  public Variable (String i, String t) {
    id = i;
    type = t;
  }

  public String toString(int t) {
    return getTabs(t) + id + " (" + type + ") :)\n";
  }

  public String typeCheck() throws UTDLangException {
    symbolTable.addVar(id,type.toLowerCase());
    return "";
  }

}
