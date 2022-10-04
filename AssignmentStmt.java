class AssignmentStmt extends Statement {
  String assignee;
  Expr rhs;
  
  public AssignmentStmt(String a, Expr e) {
    assignee = a;
    rhs = e;
  }

  public String toString(int t) {
    return getTabs(t) + assignee + " <- " + rhs.toString(0) + " :)\n";
  }
}
