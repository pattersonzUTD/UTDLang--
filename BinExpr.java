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
  
  public String typeCheck() throws UTDLangException {
    String lhsType = lhs.typeCheck();
    String rhsType = rhs.typeCheck();
      
    if (!lhsType.equals(rhsType)) {
      throw new UTDLangException("Error: tried to operate on different types" + " : " + toString(0));
    }
    
    if (lhsType.equals("number")) {
      if (operator.equals("?")) {
        return "flag";
      }
      return "number";
    }
    else if (lhsType.equals("flag")) {
      if (operator.equals("+") || operator.equals("*")) {
        return "flag";
      }
      throw new UTDLangException("Error: tried to use " + operator + " on a flag " + " : " + toString(0));
    }
    else { //String
      if (operator.equals("+")) {
        return "string";
      }
      throw new UTDLangException("Error: tried to use " + operator + " on a String " + " : " + toString(0));
    }
  }
}
