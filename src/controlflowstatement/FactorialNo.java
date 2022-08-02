package controlflowstatement;

import java.util.Scanner;

public class FactorialNo {
    public static void main(String[] args) {
        int i,fact=1;
        Scanner ab = new Scanner(System.in);
        System.out.println("enter the number");
        i= ab.nextInt();
        while(i>0){
            fact = fact*i;
            i--;
        }
        System.out.println("factorial"+fact);
        //dry run of factorial number
        //n=5
        //fact= fact*i;
        //      1*5
        //5
        //i=i-1 5-1=4
        // i=4
        //fact=5*4=20   4-1=3   i=3 fact=20*3=60   i=2 fact=60*2=120   i=1 fact=120*1=120 ans =120
    }
}
