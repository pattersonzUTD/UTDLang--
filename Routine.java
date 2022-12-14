class Routine extends Token {
  String id;
  InOutList params;
  Body body;
  
  public Routine (String i, InOutList p, Body b) {
    id = i;
    params = p;
    body = b;
  }

  public String toString(int t) {
    return getTabs(t) + id + " " + params.toString(0) + " start\n" +
      body.toString(t+1) + getTabs(t) + "end\n"; 
  }

  public String typeCheck() throws UTDLangException {
    symbolTable.addRoutine(id,params);
    symbolTable.startScope();
    String a = params.typeCheck();
    String b = body.typeCheck();
    symbolTable.endScope();
    return "";
  }
}
