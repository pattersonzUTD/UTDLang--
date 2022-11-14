import java.util.List;
import java.util.LinkedList;

class VarStmtList extends Token {
  private List<Statement> stmtVar;
  
  public VarStmtList() {
    stmtVar = new LinkedList<Statement>();
  }

  public VarStmtList prepend(Statement s) {
    stmtVar.add(0,s);
    return this;
  }

  public String toString(int t) {
    String ret = "";
    for (Statement s : stmtVar) {
      ret += s.toString(t);
    }
    return ret;
  }

  public String typeCheck() throws UTDLangException {
    for (Statement s : stmtVar) {
      String dummy = s.typeCheck();
    }
    return "";
  }

}
