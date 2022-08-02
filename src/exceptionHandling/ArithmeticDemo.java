package exceptionHandling;

public class ArithmeticDemo extends Throwable {
    public static void main(String[] args) {
        System.out.println("hello");
        System.out.println("hello");
        System.out.println("hello");
        System.out.println(10/0);   //public class ArithmeticException extends RuntimeException {

    }
}
