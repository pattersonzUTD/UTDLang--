class Body extends Token {
  private VarStmtList stmtVar;

  public Body(VarStmtList v) {
    stmtVar = v;
  }

  public String toString(int t) {
    return getTabs(t) + "Body:\n" + stmtVar.toString(t+1);
  }
}
