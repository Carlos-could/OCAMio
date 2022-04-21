public class OtroScoope {
    static double area;
    int b=2, h=3;                       // b y h son variables de instancia
    public static void main(String[] args){
        double p =0, b=0, h = 0; //despues   p b y h son variables locales
        //double p, b, h; //antes line n1
        if(area==0){
            b=3;
            h=4;
            p=0.5;
        }
        area = p*b*h;   //line n2
        System.out.println("Area is " + area);
    }
}