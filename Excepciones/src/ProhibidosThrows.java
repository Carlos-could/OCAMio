//En throws es prohibido:
//1. Exception
//2. IOException
//3. FileNotFoundException


public class ProhibidosThrows {
    void readCard(int cardNo)throws NullPointerException {  //aqui
        System.out.println("Reading Card");
    }

    void checkCard(int cardNo)throws RuntimeException { //line n1
        System.out.println("Checking Card");
    }

    public static void main(String[] args) {
        ProhibidosThrows ex=new ProhibidosThrows();
        int cardNo=1234;
        ex.checkCard(cardNo);   //line n2
        ex.readCard(cardNo);    //line n3
    }
}