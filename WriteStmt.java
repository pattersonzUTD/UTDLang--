class WriteStmt extends Statement {
  String writee;
  
  public WriteStmt(String w) {
    writee = w;
  }

  public String toString(int t) {
    return getTabs(t) + "write(" + writee + ") :)\n";
  }

  public String typeCheck() throws UTDLangException {
    String var = symbolTable.get(writee);
    if (var.equals("") || var.startsWith(":")) {
      throw new UTDLangException("Error: tried to write value of undeclared variable" + " : " + toString(0));
    }
    return "";
  }
}
