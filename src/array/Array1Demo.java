package array;

public class Array1Demo {
    public static void main(String[] args) {
         int a1[];   //initialisation
        a1 = new int[10]; //instantiation
         //initialization
        a1[0] = 10;
        a1[1] = 20;
        a1[2] = 30;
        a1[3] = 40;
        a1[4] = 50;
        a1[8] = 70;
//        System.out.println(a1[1]); //random access
//        for( int i=0;i<10;i++) {
//            System.out.println(a1[i] + "");

//        }

// for each loop

        for( int i:a1){
            System.out.println(i);
        }
        System.out.println(a1[9]);

    }

}



//result is 20
// 10 20 30 40 50 0 0 70 0
// it gives a1[5] = 0
// because bydefault value of integer value is 0;
// double= 0.0000
// if it is string it gives null.
