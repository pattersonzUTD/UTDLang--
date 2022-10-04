class WhenStmt extends Statement {
  Expr cond;
  StatementList statements;
  
  public WhenStmt(Expr c, StatementList s) {
    cond = c;
    statements = s;
  }

  public String toString(int t) {
    return getTabs(t) + "when " + cond.toString(0) + " do\n" +
      statements.toString(t+1) + getTabs(t) + "done :)\n";
  }
}
