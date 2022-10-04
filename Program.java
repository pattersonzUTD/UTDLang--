//Program.java

class Program extends Token {
  private Body body;
  //Constructor
  public Program(Body b) {
    body = b;
  }

  public String toString(int t) {
    return "Program:\n" + body.toString(t+1) + "\n";
  }
}
