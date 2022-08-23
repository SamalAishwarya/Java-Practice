package string;

public class Lengthmethod {

    public static void main(String[] args) {
       // String name =""; // output is name is empty
        String name = "Aishwarya ";               // output is valid name
       // String name = null;                         // output is exception  Nullpointerexception
       // String name = "      ";                   // output also valid name because it count spaces also
        String email = "abc@gmail.com";
        System.out.println(name.length()); //9
        System.out.println(email.length()); //13
        int i =  name.length();
        if( i== 0){
            System.out.println("name is empty");
        }
        else {
            System.out.println("valid name");
        }

    }
}
