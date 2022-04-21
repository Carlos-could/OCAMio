public class pasoReferencia {
    int a1;
    public static void doProduct(int a){
        a=a*a;
    }
    public static void doString(StringBuilder s){ //se pasa la referencia
        s.append(" " + s); // por eso s y sb es el mismo
    }
    public static void main(String[] args) {
        pasoReferencia item=new pasoReferencia();
        item.a1=11;
        StringBuilder sb=new StringBuilder("Hello");
        Integer i=10;
        doProduct(i);
        doString(sb); // hello hello
        doProduct(item.a1);
        System.out.println(i + " " + sb +" " + item.a1);
    }
}