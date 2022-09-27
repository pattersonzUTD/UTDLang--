import java.io.*;
import java_cup.runtime.*;

/****
 *
 * This is a simple stand-alone testing program for the lexer defined in
 * tokens.jflex.  The main method accepts an input file as its first
 * command-line argument.  It then calls the lexer's next_token method with an
 * input reader for that file.  The value of each Symbol returned by next_token
 * is printed to stanard output.
 *                                                                     
 * The following command-line invocation will read in the test program in the
 * file "scanner-test.p" and print out each token found in that file:
 *
 *     java ScannerTest scanner-test.p
 *
 */
public class ScannerTest{

    public static void main(String[] args) {
        Reader reader = null;
        //If no file provided, take from the input stream
        if (args.length == 1) {
          File input = new File(args[0]);
          if (!input.canRead()) {
            System.out.println("Error: could not read ["+input+"]");
          }
          try {
            reader = new FileReader(input);
          } catch (Exception e) {
            e.printStackTrace();
          }
        }
        else {  
          reader = new InputStreamReader(System.in);
        }
        Lexer lexer = new Lexer(reader);
        parser parser = new parser(lexer);
        Program program = null;
        try {
          program = (Program) parser.parse().value;
          System.out.print(program.toString(0));
        }
        catch (Exception e) {
          e.printStackTrace();
        }
    }
}

