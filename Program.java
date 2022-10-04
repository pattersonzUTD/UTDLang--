//Program.java

class Program extends Token {
  private StatementList statements;
  //Constructor
  public Program(StatementList s) {
    statements = s;
  }

  public String toString(int t) {
    return "Program:\n" + statements.toString(t+1) + "\n";
  }
}
