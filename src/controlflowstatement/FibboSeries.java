package controlflowstatement;

public class FibboSeries {
    public static void main(String[] args) {
        int a=0;
        int b=1;
        int limit = 10;
        System.out.println("a" +a);
        System.out.println("b"+b);
        while(limit>0){
            int next = a+b;
            System.out.println("next : " +next);
            b=next;
            a=b;
            limit--;
        }
    }
}
