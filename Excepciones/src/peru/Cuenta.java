package peru;

public class Cuenta {

    private double saldo;

    public Cuenta(){
        saldo = 0;
    }

    public void depositar(double cantidad){
        saldo += cantidad;
    }

    public double retirar(double cantidad) throws Exception{
        if (cantidad > saldo){
            throw  new Exception("No hay fondos suficientes");
        }
        saldo -= cantidad;
        return cantidad;
    }

}
