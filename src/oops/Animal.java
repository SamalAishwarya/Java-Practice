package oops;

public class Animal {

    public void eat(){
        System.out.println("i am eating");
    }
    public static void main(String[] args) {
        System.out.println("1");
        Animal buzo = new Animal();
        buzo.eat();
        buzo.run();

        Animal aa = new Animal();
        aa.run();
        aa.eat();

        Birds sp = new Birds();
        sp.fly();
    }
    public void run(){
        System.out.println("Dog is running");
    }
}
class Birds{

    void fly(){
        System.out.println(" sp is flying");
    }
}
