import java.util.Scanner;

public class star2 {
    public static void main(String[] args) {
//        int n,i,j;
//        Scanner sc = new Scanner(System.in);
////        System.out.println("enter the number");
//        n= sc.nextInt();
//
//        for( int p=1;p<=5;p++){
//            for( int q=1;q<=p;q++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//
//        //*****
//        //****
//        //***
//        //**
//        //*
//
//        for(int a=1;a<=5;a++){
//            for(int b=5;b>=a;b--){
//                System.out.println("*");
//            }
//            System.out.println();
//        }

        //    *
        //   **
        //  ***
        // ****
        //*****

        int n,s,i,j;
        Scanner ab = new Scanner(System.in);
        System.out.println("enter no of rows");
        n= ab.nextInt();

        for(i=1;i<=n;i++){
            for(s =1;s<=n-i;s++)
                System.out.print("*");

            for(j=1;j<=1;j++)
                System.out.print("*");

            System.out.println();
        }
    }
}
