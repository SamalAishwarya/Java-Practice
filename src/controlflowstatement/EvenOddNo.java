package controlflowstatement;

import java.util.Scanner;

public class EvenOddNo {
    public static void main(String[] args) {
        int no;
        Scanner ap = new Scanner(System.in);
        System.out.println("enter the number find even and odd");
         no = ap.nextInt();
         if(no%2==0){
             System.out.println("Even number");
         }
         else {
             System.out.println("Odd number");
         }
    }
}
