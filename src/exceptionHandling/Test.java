package exceptionHandling;

public class Test {
    public static void main(String[] args) {
        String n = null;
        try{
            System.out.println("I am in try block");
            System.out.println(n.length());

        }
        catch (Exception e ){
             try{

                 System.out.println(10/0);
             }catch (Exception a ){
                 System.out.println(a.getMessage());
             }
        }
     finally {
            try{
                String num ="121A";
                System.out.println(Integer.parseInt(num));
            }catch (java.lang.NumberFormatException e1){
                System.out.println("Given String contains alphabets");

            }
        }
//             String num ="121A";
//            System.out.println(Integer.parseInt(num));
//        }
        System.out.println("Rest of the code");
    }
}
