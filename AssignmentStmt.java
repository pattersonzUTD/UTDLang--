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

  public String typeCheck() throws UTDLangException { 
    String type = symbolTable.get(assignee);
    String toAssign = rhs.typeCheck();
    if (!type.equals(toAssign)) {
      throw new UTDLangException("Error: tried to assign " + toAssign + " to type " + type + " : " + toString(0));
    }
    return "";
  }

}
