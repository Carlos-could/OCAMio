package Casting_Herencia;

class Animal {
    void comer(){
        System.out.println("El animal come");
    }
    void dormir(){
        System.out.println("el animal duerme");
    }
}

class Mamifero extends Animal{
    void temperatura(){
        System.out.println("temperatura del mamifero");
    }
}

class Leon extends Mamifero{

    @Override
    void dormir() {
        System.out.println("El Leon duerme");
    }

    void rugir(){
        System.out.println("Grrr..!");
    }
}

public class Main{
    public static void main(String[] args) {

        Animal jason = new Leon();
        jason.dormir();
        // jayson.rugir -> no esta xq Animal no tiene rugir
        ((Leon) jason).rugir();
        Leon susi = ((Leon) jason);
        System.out.println("-------");
        susi.rugir();
        susi.dormir();
        susi.comer();

        System.out.println("--------------");


        Mamifero mamom = new Mamifero();
        mamom.comer();






    }
}
