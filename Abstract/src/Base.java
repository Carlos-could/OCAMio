interface interparte{
    void metodoInterface();
}

class Abuelo implements interparte{


    @Override
    public void metodoInterface() {

    }
}

abstract class Papa extends Abuelo{

    abstract void metodoPapa();

}



public class Base extends Papa {
    public static void main(String[] args) {

        Base prueba = new Base();

        prueba.metodoInterface();



    }


    void metodoPapa() {

    }
}
