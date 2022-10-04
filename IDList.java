import java.util.List;
import java.util.LinkedList;

class IDList extends Token {
  private List<String> ids;
  
  public IDList() {
    ids = new LinkedList<String>();
  }

  public IDList prependID(String s) {
    ids.add(0,s);
    return this;
  }

  public String toString(int t) {
    String ret = "";
    for (String i : ids) {
      ret += i + " ";
    }
    return ret;
  }
}
