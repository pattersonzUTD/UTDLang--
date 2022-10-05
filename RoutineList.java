import java.util.List;
import java.util.LinkedList;

class RoutineList extends Token {
  private List<Routine> routines;
  
  public RoutineList() {
    routines = new LinkedList<Routine>();
  }

  public RoutineList prepend(Routine r) {
    routines.add(0,r);
    return this;
  }

  public RoutineList append(Routine r) {
    routines.add(r);
    return this;
  }

  public String toString(int t) {
    String ret = "";
    for (Routine r : routines) {
      ret += r.toString(t);
    }
    return ret;
  }
}
