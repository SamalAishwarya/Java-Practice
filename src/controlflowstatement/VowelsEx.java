package controlflowstatement;

import java.util.Locale;
import java.util.Scanner;

public class VowelsEx {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any character");
//        char ch = sc.next();
//        char ch = toLowerCase().charAt(0);
        //String ch1 = sc.next();
        char ch=sc.next().toLowerCase().charAt(0);

        switch (ch){
            case 'a':
                System.out.println("Vowel");
                break;
            case 'e':
                System.out.println("Vowel");
                break;
            case 'i':
                System.out.println("Vowel");
                break;
            case 'o':
                System.out.println("Vowel");
                break;
            case 'u':
                System.out.println("Vowel");
                break;
            default:
                System.out.println("Consonants");
        }



    }
}
