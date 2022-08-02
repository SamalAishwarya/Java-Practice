package Static;

public class Test {
    static int a= 10;     // if we don't write  the static keyword then it will show the error

}

class TestDemo {
    public static void main(String[] args) {
        System.out.println(Test.a);     //static variable belongs to class.
    }
}



//    static  int a =10;
//    void m1(){
//         int b = 20;   here output is 20 , but if we write the static int  b= 20 then it will show the error.
//
//    }
