package string;

import java.util.Scanner;

public class InitialChar {
    public static void main(String[] args) {
        String str;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the name;");
        String name = sc.nextLine();
        String []nameArray = name.split(" ");
        System.out.println(nameArray.length);
//        for(String s : nameArray){
//            System.out.println(s);
//        }
        char firstInitial = nameArray[0].toUpperCase().charAt(0);
        char middleInitial = nameArray[1].toUpperCase().charAt(0);

        System.out.println(nameArray[2].substring(0,1).toUpperCase());
        String lastname = nameArray[2].substring(0,1).toUpperCase().concat(nameArray[2].substring(1));
        String initialName = firstInitial+ "." +middleInitial +"." +nameArray[2];
        System.out.println(initialName);
    }
}
