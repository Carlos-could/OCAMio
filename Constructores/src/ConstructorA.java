public class ConstructorA {

    ConstructorA() {
        System.out.println("Contructor clase B con 0 parametros");
    }

    ConstructorA(int x){
        System.out.println("Contructor clase A con 1 parametros");
    }

    private boolean vOf(){
        return false;
    }

    public static void main(String[] args) {
        ConstructorA nuevoA = new ConstructorB(5);
        System.out.println(nuevoA.vOf());
    }
}
class ConstructorB extends ConstructorA{
    public ConstructorB(int x) {
        System.out.println("Contructor clase B con 1 parametros");
    }
    private boolean vOf(){
        return true;
    }
}