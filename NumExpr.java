//NumExpr.java

class NumExpr extends Expr {
  String value;
  NumExpr lhs;
  String  operator;
  NumExpr rhs;
  //Constructor
  public NumExpr(String i) {
    value = i;
    operator = "";
  }
  public NumExpr(int n) {
    value = String.valueOf(n);
    operator = "";
  }
  public NumExpr(NumExpr n1, String op, NumExpr n2) {
    lhs = n1;
    operator = op;
    rhs = n2;
  }

  public String toString(int t) {
    if (operator.equals("")) {
      return getTabs(t) + value;
    } else {
      return getTabs(t) + "(" + lhs.toString(0) + " " + operator + " " + rhs.toString(0) + ")";
    }
  }
}
