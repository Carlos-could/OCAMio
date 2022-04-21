class A{
    public A(){
        System.out.print("A ");
    }
}
class B extends A{
    public B(){ //line n1
        System.out.print("B ");
    }
}
class C extends B{
    public C(){  //line n2
        System.out.println("C ");
    }
    public C (int x) {
        System.out.println(" contructor con 1 parametro");
    }
    public static void main(String[] args){
        C c = new C(5);      //llamar al contructor vacio del mas arriba
                            // C extends B extends A
    }                       // imprime contructor vacio de A, luego de B y luego de C
}