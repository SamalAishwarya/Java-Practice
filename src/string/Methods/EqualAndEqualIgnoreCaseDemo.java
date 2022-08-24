package string.Methods;


/**
 * equals() -this method compares the content of given two strings. if any character is not matched then output is false
 * . If all characters are match then the output is true.
 * <p>
 * eualsIgnoreCase() -: it ignore the case consideration i.e. lower case and upper case
 */
public class EqualAndEqualIgnoreCaseDemo {
    public static void main(String[] args) {
        String s1 = "Aishwarya";
        //  String s2 = "Samal";
        String s3 = "aishwarya";
        String s4 = "Aishwarya";
        System.out.println(s1.equals(s4));   //true
        //  System.out.println(s1.equals(s2)); //false
        System.out.println(s1.equals(s3));   //false

        String s5 = "Aish";
        //  String s5 = "";

        String s6 = "aish";
        System.out.println(s5.equalsIgnoreCase(s6));
        // System.out.println(s5.equals("")); //true if the string is empty



        String a = " ";
        String b = "pqr";
        if ((a.equals(" "))){
            System.out.println("name cannot be empty");
        }
        else {
            System.out.println("valid name");
        }


    }
}
