class StrExpr extends Expr {
  String value;
  StrExpr lhs;
  StrExpr rhs;
  //Constructor
  public StrExpr(String s) {
    value = s;
  }
  public StrExpr(StrExpr s1, StrExpr s2) {
    lhs = s1;
    rhs = s2;
    value = "";
  }

  public String toString(int t) {
    if (!value.equals("")) {
      return getTabs(t) + value;
    } else {
      return getTabs(t) + "(" + lhs.toString(0) + " + " + rhs.toString(0) + ")";
    }
  }
}
