class FlagExpr extends Expr {
  bool isConst;
  bool isID;
  bool isUnary;
  bool isMulti;
  bool status;
  String value;
  Expr lhs;
  String operator;
  Expr rhs;
  private turnOff() {
    isConst = false;
    isID = false;
    isUnary = false;
    isMulti = false;
  }
  //Constructor
  public FlagExpr(String i) {
    turnOff();
    value = i;
    isID = true;
  }
  public FlagExpr(bool s) {
    turnOff();
    status = s;
    isconst = true;
  }
  public FlagExpr(FlagExpr f) {
    turnOff();
    rhs = f;
    isUnary = true;
  }
  public FlagExpr(Expr e1, String op, Expr e2) {
    turnOff();
    lhs = e1;
    operator = op;
    rhs = e2;
    isMulti = true;
  }

  public String toString(int t) {
    String res = getTabs(t);
    if (isConst) {
      res += status ? "up" : "down";
    } else if (isID) {
      res += value;
    } else if (isUnary) {
      res += "flip(" + rhs.toString(0) + ")";
    } else {
      res += "(" + lhs.toString(0) + " " + operator + " " + rhs.toString(0) + ")";
    }
    return res;
  }
}
