import java.util.*;

class UTDLangException extends Exception
{
    String error;
    public UTDLangException(String s)
    {
        error = s;
    }

    public String toString()
    {
      return error;
    }
}
