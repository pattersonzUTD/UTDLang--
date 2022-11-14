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

  public String typeCheck() throws UTDLangException {
    if (!type.equals("var")) {
      return type;
    }
    String varType = symbolTable.get(value);
    if (varType.equals("") || varType.startsWith(":")) {
      throw new UTDLangException("Error: tried to reference undeclared variable" + " : " + toString(0));
    }
    return varType;
  }
  
}
