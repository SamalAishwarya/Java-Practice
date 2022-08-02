package inheritance;
//  multilevel ineritance
public class Animal {
         void eat(){                               ///here we call methods
        System.out.println("Animal can eat anything");
    }
}
class Dog extends Animal{

    void run(){
        System.out.println("Dog runs anywhwere");
    }
}
class BabyDog extends Dog {
     void sleep(){
        System.out.println("Dog sleep everywhere");
    }
}
class AnimalImpl{
    public static void main(String[] args) {
        BabyDog babyDog = new BabyDog();
        babyDog.sleep();
        babyDog.eat();
        babyDog.run();

    }
}