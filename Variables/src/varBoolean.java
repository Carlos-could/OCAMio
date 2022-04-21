public class varBoolean {
    public static void main(String[] args) { //pasar TRUE null como parametros

        boolean a = new Boolean(Boolean.valueOf(args[0]));
        System.out.println(a);

        boolean b = new Boolean(args[1]);
        System.out.println(b);

        System.out.println(a + " " + b);
        System.out.println("---------------");
        System.out.println(new Boolean("tru")); // cualquier cosa que no sea TruE, es false
    }
}
