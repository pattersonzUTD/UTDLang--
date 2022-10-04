class OperandExpr extends Expr {
  String type;
  String value;
  
  public OperandExpr(int n) {
    value = String.valueOf(n);
    type = "number";
  }

  public OperandExpr(boolean f) {
    value = String.valueOf(f);
    type = "flag";
  }

  public OperandExpr(String s, String t) {
    value = s;
    type = t;
  }

  public String toString(int t) {
    return getTabs(t) + type + ":" + value;
  }
}
