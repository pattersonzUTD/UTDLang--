//Program.java

class Program extends Token {
  private RoutineList prog;
  //Constructor
  public Program(RoutineList r) {
    prog = r;
  }

  public String toString(int t) {
    return "Program:\n" + prog.toString(t+1) + "\n";
  }
}
