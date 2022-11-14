class WhenStmt extends Statement {
  Expr cond;
  VarStmtList statements;
  
  public WhenStmt(Expr c, VarStmtList s) {
    cond = c;
    statements = s;
  }

  public String toString(int t) {
    return getTabs(t) + "when " + cond.toString(0) + " do\n" +
      statements.toString(t+1) + getTabs(t) + "done :)\n";
  }

  public String typeCheck() throws UTDLangException {
    String condType = cond.typeCheck();
    if (!condType.equals("flag")) {
      throw new UTDLangException("Error: tried to evaluate when condition which isn't a flag" + " : when " + cond.toString(0) + " do");
    }
    statements.typeCheck();
    return "";
  }
}
