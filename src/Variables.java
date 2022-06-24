/**
 * 3 types of variables
 * 1. local - scope of the variables are within function only
 * 2. instance - within a class but outside the method.
 * 3. Static - within a class but outside the method ,cannot be local
 *  */

public class Variables {
    int z = 30;//Instance variable
    static  int c=50;//static variables
    public static void main (String args[]){
        int a=10;
        int b=20;
        a=20;
        System.out.println(a+c); ////in this we can print static variables because main
    }
    void display(){
        int a=10;//local variables
        System.out.println(a+c);

    }
}
