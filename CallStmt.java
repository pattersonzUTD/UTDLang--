class CallStmt extends Statement {
  String callee;
  IDList ids;
  
  public CallStmt(String c, IDList i) {
    callee = c;
    ids = i;
  }

  public String toString(int t) {
    return getTabs(t) + "call " + callee + "(" + ids.toString(0) + ") :)\n";
  }
  public String typeCheck() throws UTDLangException {
    String paramReqs = symbolTable.get(callee);
    String idTypes = ids.typeCheck();
    if (!paramReqs.equals(idTypes)) {
      throw new UTDLangException("Error: incompatible parameters" + " : " + toString(0));
    }
    return "";
  }

}
