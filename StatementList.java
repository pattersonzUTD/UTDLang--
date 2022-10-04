import java.util.List;
import java.util.LinkedList;

class StatementList extends Token {
  private List<Statement> statements;
  
  public StatementList() {
    statements = new LinkedList<Statement>();
  }

  public StatementList prependStatement(Statement s) {
    statements.add(0,s);
    return this;
  }

  public String toString(int t) {
    String ret = "";
    for (Statement s : statements) {
      ret += s.toString(t);
    }
    return ret;
  }
}
