public class imprimitArrayDoble {

    public static void main(String[] args) {
        String shirts [][] =new String[2][2];
        shirts[0][0] = "red";
        shirts[0][1] = "blue";
        shirts[1][0] = "small";
        shirts[1][1] = "medium";


        for (String [] f : shirts)
            for (String c: f)
                System.out.println(c);
    }
}
