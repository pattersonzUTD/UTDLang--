class ReadStmt extends Statement {
  String assignee;
  
  public ReadStmt(String a) {
    assignee = a;
  }

  public String toString(int t) {
    return getTabs(t) + "read(" + assignee + ") :)\n";
  }

  public String typeCheck() throws UTDLangException {
    String var = symbolTable.get(assignee);
    if (var.equals("") || var.startsWith(":")) {
      throw new UTDLangException("Error: tried to assign value to undeclared variable" + " : " + toString(0));
    }
    return "";
  }
}
