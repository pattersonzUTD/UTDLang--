//Program.java

class Program extends Token {
  private Body body;
  //Constructor
  public Program(String b) {
    //body = b;
  }

  public String toString(int t) {
    return "";//"Program:\n" + body.toString(t+1) + "\n";
  }
}
