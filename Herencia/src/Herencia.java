interface Downloadable{
    public void download();
}
interface Readable extends Downloadable{ //line n1
    public void readBook();
}
abstract class Book implements Readable{ //line n2
    public void readBook(){
        System.out.println("Read Book");
    }
}
class EBook extends Book{ //line n3
    public void readBook(){
        System.out.println("Read E-Book");
    }
    public void download() {       // faltaba imprementar este metodo en esta clase
                                    //  xq esta clase no es ni abstractac ni interface
    }
}

public class Herencia {
    public static void main(String[] args) {
        Book book1 = new EBook();
        book1.readBook();
    }
}
