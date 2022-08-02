package inheritance;

public class P {
    void showP()
        {
        System.out.println("P class method");
    }
}

class Q extends P
{
    void showQ(){
        System.out.println(" Q class method");
    }
}
class R extends  Q{
    void showR(){
        System.out.println("R class method");
    }

    public static void main(String[] args) {

        P ob1 = new P();
        ob1.showP();
        System.out.println("--------------");

        Q ob2 = new Q();
        ob2.showP();
        ob2.showQ();
        System.out.println("-------------");

        R ob3 = new R();
        ob3.showP();
        ob3.showQ();
        ob3.showR();
        System.out.println("-------------");

    }

}
