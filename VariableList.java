import java.util.List;
import java.util.LinkedList;

class VariableList extends Token {
  private List<Variable> variables;
  
  public VariableList() {
    variables = new LinkedList<Variable>();
  }

  public VariableList prependVariable(Variable v) {
    variables.add(0,v);
    return this;
  }

  public String toString(int t) {
    String ret = "";
    for (Variable v : variables) {
      ret += v.toString(t);
    }
    return ret;
  }
}
