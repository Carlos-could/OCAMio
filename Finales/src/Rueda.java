public interface Rueda {

    void teil1();

    static void teil2() {
        System.out.println("Teil 2");
    }

    default void teil3 (){
        System.out.println("Teil 3..Rueda");
    }
}
