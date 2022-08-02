package inheritance;


// Single inheritance
public class A {
    void showA() {
        System.out.println("a class method");
    }
}
    class B extends A
    {
        public static void main(String[] args) {
            A obj1 = new A();
            obj1.showA();
            System.out.println("---------------------");

            B obj2 = new B();
            obj2.showA();
            obj2.showB();


        }

        void showB() {
            System.out.println("B class method");
        }
    }

