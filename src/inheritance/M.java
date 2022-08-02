package inheritance;

public class M {
    void showM(){
        System.out.println("M class method");
    }
}
class N extends M{
    void showN(){
        System.out.println("N class method");
    }
}
class o extends N{
    void showO(){
        System.out.println("o class method");
    }

    public static void main(String[] args) {
        M ob1 = new M();
        ob1.showM();
        System.out.println("-----------------");

        N ob2 = new N();
        ob2.showM();
        ob2.showN();
        System.out.println("-----------------");

        o ob3 = new o();
        ob3.showO();
        ob3.showM();
        ob3.showN();
        System.out.println("--------------------");


    }

}
