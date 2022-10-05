import java.util.List;
import java.util.LinkedList;

class InOutList extends Token {
  private List<InOut> params;
  
  public InOutList() {
    params = new LinkedList<InOut>();
  }

  public InOutList prepend(InOut i) {
    params.add(0,i);
    return this;
  }

  public InOutList join(InOutList i) {
    params.addAll(i.params);
    return this;
  }
  
  public String toString(int t) {
    String ret = "";
    for (InOut s : params) {
      ret += s.toString(0) + " " ;
    }
    return ret;
  }
}
