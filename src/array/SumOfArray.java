package array;

import java.util.Scanner;

public class SumOfArray {
    public static void main(String[] args) {
        int a[] = new int[10];
        int sum =0;
        Scanner sc =new Scanner(System.in);
        for(int i=0;i<10;i++){
            System.out.println("enter value");
            a[i] = sc.nextInt();
        }
        for(int i=0;i<10;i++){
            sum =sum+a[i];
        }
        System.out.println("Sum" +sum);


    }
}

