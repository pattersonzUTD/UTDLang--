class Body extends Token {
  private VariableList variables;
  private StatementList statements;

  public Body(VariableList v, StatementList s) {
    varibles = v;
    statements = s;
  }

  public String toString(int t) {
    return getTabs(t) + "Body:\n" + variables.toString(t+1) + statements.toString(t+1);
  }
}
