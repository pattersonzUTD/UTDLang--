class Pair<T1,T2>
  {
    T1 key;
    T2 value;
    public Pair(T1 a, T2 b)
    {
      key = a;
      value = b;
    }
    public T1 getKey()
    {
      return key;
    }
    public T2 getValue()
    {
      return value;
    }
  }
