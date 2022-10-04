class BinExpr extends Expr {
  Expr lhs;
  String  operator;
  Expr rhs;
  
  public BinExpr(Expr e1, String op, Expr e2) {
    lhs = e1;
    operator = op;
    rhs = e2;
  }

  public String toString(int t) {
    return getTabs(t) + "(" + lhs.toString(0) + " " + operator + " " + rhs.toString(0) + ")";
  }
}
