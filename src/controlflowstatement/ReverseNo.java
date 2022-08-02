package controlflowstatement;

import java.util.Scanner;

public class ReverseNo {
    public static void main(String[] args) {
        int n,rev=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no to find reverse");
        n = sc.nextInt();
        while(n>0){
            rev= (rev*10) + n%10;
            n=n/10;
        }
        System.out.println("Reverse" +rev);

    }
}
