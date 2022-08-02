package exceptionHandling;

public class FinallyDemo {
    public static void main(String[] args) {
        try{
            System.out.println(7/0);
        }
        catch(NullPointerException e){
            System.out.println(e.getMessage());

        }
//        catch (ArithmeticException e){
//            System.out.println(e.getMessage());
//        }
        finally {
            System.out.println("In finally block ");
        }
        System.out.println("Rest of the code");
    }
}

//finally block always excute if the error occur or not in try block.