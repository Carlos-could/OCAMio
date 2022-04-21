class MyException extends RuntimeException{}

public class ExConIf{
    public static void main(String args[]){
        try{
            method1();                  // 1ro va a method1 y lo resuelve sin problemas
        }
        catch(MyException ne){
            System.out.print("A");
        }
    }
    public static void method1(){   //line n1
        try{
            throw Math.random() > 0.5 ? new MyException(): new RuntimeException();
        }                               // da igual es resultado, coge la excepcion e imprime B
        catch(RuntimeException re){
            System.out.println("B");
        }
    }
}