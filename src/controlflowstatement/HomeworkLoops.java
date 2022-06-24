package controlflowstatement;

import java.util.Scanner;

public class HomeworkLoops {
    public static void main(String[] args) {
        // 1.int a = 30;
        //   int b = 45;
        //   int c = 10;
        //   find greatest & smallest number
        //3. Calculator program
        //4. Even & Odd no
        //5. Factorial of number
        //6. Reverse the no
        //7. Prime No
        //8. Fibbo series
        //9. Palindrome no
        //10. Armstrong no

        //6.Reverse number
//        int n,rev=0;
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the no to find reverse");
//        n = sc.nextInt();
//        while(n>0){
//            rev= (rev*10) + n%10;
//            n=n/10;
//        }
//        System.out.println("Reverse" +rev);
//
//
//        //5. Factorial Number
//        int i,fact=1;
//        Scanner ab = new Scanner(System.in);
//        System.out.println("enter the number");
//        i= ab.nextInt();
//        while(i>0){
//            fact = fact*i;
//            i--;
//        }
//        System.out.println("factorial"+fact);
//        //dry run of factorial number
//        //n=5
//        //fact= fact*i;
//        //      1*5
//        //5
//        //i=i-1 5-1=4
//        // i=4
//        //fact=5*4=20   4-1=3   i=3 fact=20*3=60   i=2 fact=60*2=120   i=1 fact=120*1=120 ans =120
//
//        //4.Even odd
//        int no;
//        Scanner ap = new Scanner(System.in);
//        System.out.println("enter the number find even and odd");
//         no = ap.nextInt();
//         if(no%2==0){
//             System.out.println("Even number");
//         }
//         else {
//             System.out.println("Odd number");
//         }
//
        //Prime Number
        int no;

        Scanner ap = new Scanner(System.in);
        System.out.println("enter the number");
        no = ap.nextInt();
        boolean flag = false;
        for (int i = 2; i < no / 2; i++) {
            if (no % i == 0) {

                flag = false;
                break;
            } else {
                flag = true;
            }
        }

        if (flag) {
            System.out.println("the number is prime");
        } else
            System.out.println("The number is not prime");




    }
}
