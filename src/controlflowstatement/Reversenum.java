package controlflowstatement;

import java.util.Scanner;

public class Reversenum {
    public static void main(String[] args) {
        int no,rev=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        no = sc.nextInt();

        while(no>0){
            rev= (rev*10)+no%10;
            no=no/10;

        }
        System.out.println("reverse number"+rev);

    }
}
