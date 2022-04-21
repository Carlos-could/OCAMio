import java.io.IOException;

class X{
     public void printFileContent() throws IOException { // throws para pasarlo a otro
                 /* code goes here */
                 throw new IOException();
             }
  }
 public class TestThrows{
    public static void main (String [] args ) throws IOException { //para que compile
                X xobj = new X();
                xobj.printFileContent();
            }
 }