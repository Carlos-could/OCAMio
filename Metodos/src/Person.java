public class Person{
    String name;
    int age=25;
    public Person(String name){
        //this(); //line n1       //error xq llama a un constructor vacio y no hay
        //setName(name);
    }
    public Person(String name, int age){
        //Person(name); //line n2     // error, deber ser this(name) para llamar al Persona(String name)
        //setAge(age);
    }
    //setter and getter methods go here
    public String show(){
        return name + " "+ age;
    }
    public static void main(String[] args){
        Person p1=new Person("Jeses");
        Person p2= new Person("Walter", 52);
        System.out.println(p1.show());
        System.out.println(p2.show());
    }
}