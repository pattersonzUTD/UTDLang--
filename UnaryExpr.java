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
}
