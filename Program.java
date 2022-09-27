//Program.java

class Program extends Token {
  private Expr expr;
  //Constructor
  public Program(Expr e) {
    numexpr = e;
  }

  public String toString(int t) {
    return "Program:\n" + expr.toString(t+1);
  }
}
