package peru;

public class Main {

    public static void main(String[] args) throws Exception{
        Cuenta c = new Cuenta();

        c.depositar(100);

        try {
            c.retirar(150);
        } catch ( Exception e){
            //e.printStackTrace();
            //System.out.println("No hay fondos suficientes");
        }
    }
}
