class Vehicle{
    String type;
    int maxSpeed;
    Vehicle(String type, int maxSpeed){
        this.type=type;
        this.maxSpeed=maxSpeed;     // imprimentar constructor vacio
    }

    public Vehicle() {

    }
}
class Car extends Vehicle{
    String trans;
    Car(String trans){
        super();      //line n1  - error, necesita constructor vacio, super()
        this.trans=trans;
    }
    Car(String type, int maxSpeed, String trans){
        super(type, maxSpeed);
        this.trans = trans;        //line n2   - error, this.trans=trans, en vez de... this(trans);
    }
}

public class Autos {
    public static void main(String[] args) {
        Car c1=new Car("Auto");
        Car c2=new Car("4W", 150, "Manual");
        System.out.println(c1.type + " " +c1.maxSpeed + " " + c1.trans);
        System.out.println(c2.type + " " +c2.maxSpeed + " " + c2.trans);
    }

}
