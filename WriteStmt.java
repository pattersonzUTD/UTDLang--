class WriteStmt extends Statement {
  String writee;
  
  public WriteStmt(String w) {
    writee = w;
  }

  public String toString(int t) {
    return getTabs(t) + "write(" + writee + ") :)\n";
  }
}
