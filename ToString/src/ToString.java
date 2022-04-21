public class ToString {
    public static void main(String[] args) {
        StringBuilder sb=new StringBuilder(5);
        String s="";
        if(sb.equals(s)){
            System.out.println("Match 1");
        }
        else if (sb.toString().equals(s.toString())){ // como no contienen nada...es verdadero
            System.out.println("Match 2");
        }
        else{
            System.out.println("No Match");
        }

        System.out.println(sb.getClass());
        System.out.println(s.getClass());
        System.out.println(sb.hashCode());
        System.out.println(s.hashCode());
        System.out.println(sb.toString()); // no hay nada
        System.out.println(s.toString() ); // no hay nada
    }
}
