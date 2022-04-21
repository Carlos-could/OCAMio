import java.util.ArrayList;

public class RuntimeError {
    public static void main(String[] args) {
        ArrayList myList = new ArrayList();
        String[] myArray;
        try{
            while (true){  // bucle y lanza OutofMemoryError - thread main
                myList.add("My String");
            }
        }
        catch(RuntimeException re){
            System.out.println("Caught a RuntimeException");
        }
        catch(Exception e){
            System.out.println("Caught an Exception");
        }
        System.out.println("Ready to use");
    }
}
