package string;

public class ImmutableDemo {
    public static void main(String[] args) {
        String s1 = "Pune";
        String s2 = s1;
        s1 =" Mumbai";
        System.out.println(s1.concat("city"));
        System.out.println(s1);
        System.out.println(s2);

        int n1 = 10;
        int n2 = n1;
        n1 = 15;
        System.out.println(n1);
        System.out.println(n2);

//        String Constant Pool(String literal pool)
//- separate place in heap area
//- values of strings are gets stored
//- JVM checks SCP first,if string is already exists in SCP then it refers to same string
//	else it will created new string instance
//- Strings present in SCP are not applicable for Garbage Collector, because reference
//	variables are internally managed by JVM
    }
}
