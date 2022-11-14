import java.util.ArrayList;

class SymbolTable
{
  ArrayList<ArrayList<Pair<String,String>>> table;
  public SymbolTable()
  {
    table = new ArrayList<ArrayList<Pair<String,String>>>();
    table.add(new ArrayList<Pair<String,String>>());
  }
  public String get(String s) throws UTDLangException
  {
    for (int i = table.size()-1; i >= 0; --i)
      for (Pair<String,String> p : table.get(i))
      {
        if (p.getKey().equals(s))
          return p.getValue();
      }
    throw new UTDLangException("Error: variable not declared " + s);
  }
  
  public void addVar(String id, String t) throws UTDLangException
  {
    for (Pair<String,String> p : table.get(table.size()-1))
      {
        if (p.getKey().equals(id))
          throw new UTDLangException("Error: tried to redeclare variable " + id);
      }
    table.get(table.size()-1).add(new Pair<String,String>(id,t));
    
    return;
  }
  
  public void addRoutine(String id, InOutList params) throws UTDLangException
  {
    String pType = params.getType();
    
    for (Pair<String,String> p : table.get(table.size()-1))
      {
        if (p.getKey().equals(id))
          throw new UTDLangException("Error: tried to redeclare routine " + id);
      }
    table.get(table.size()-1).add(new Pair<String,String>(id,pType));
    
    return;
  }
  
  public void startScope()
  {
    table.add( new ArrayList<Pair<String,String>>());
  }
  public void endScope()
  {
    table.remove(table.size()-1);
  }
  public String toString()
  {
    String ret = "";
    String t = "";
    for (ArrayList<Pair<String,String>> v : table)
      {
        for (Pair<String,String> p : v)
          ret += t + p.getKey() + " " + p.getValue().toString() + "\n";
        t += "\t";
      }
    return ret;
  }
}
