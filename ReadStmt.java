class ReadStmt extends Statement {
  String assignee;
  
  public ReadStmt(String a) {
    assignee = a;
  }

  public String toString(int t) {
    return getTabs(t) + "read(" + assignee + ") :)\n";
  }
}
