class UnaryExpr extends Expr {
  String  operator;
  Expr rhs;
  
  public UnaryExpr(String op, Expr e2) {
    operator = op;
    rhs = e2;
  }

  public String toString(int t) {
    return getTabs(t) + operator + "(" + rhs.toString(0) + ")";
  }

  public String typeCheck() throws UTDLangException {
    String rhsType = rhs.typeCheck();
      
    if (!rhsType.equals("flag")) {
      throw new UTDLangException("Error: can't flip a " + rhsType + " : " + toString(0));
    }
    return "flag";
  }

}
