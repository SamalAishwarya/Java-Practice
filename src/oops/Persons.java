package oops;

import java.util.Scanner;

public class Persons {
    int Mno;
    String name;
    String address;
    float age;

    void insertData(int r, String nm, String addr, float a) {
        Mno = r;
        name = nm;
        address = addr;
        age = a;
    }

    void display() {
        System.out.println("*************Person details*********");
        System.out.println("Mobile no:" + Mno);
        System.out.println("name:" + name);
        System.out.println("address" + address);
        System.out.println("age:" + age);
    }
}

    class PersonImpl{
        public static void main(String[] args) {

            Persons s1 = new Persons();
            s1.Mno = 866908152;
            s1.name = "Aishwarya";
            s1.address = "pune";
            s1.age = 7.5f;

//
            Scanner sc = new Scanner(System.in);
            System.out.println("enter mobile no");
            int Mno = sc.nextInt();
            System.out.println("enter name");
            String nm= sc.next();
            System.out.println("enter address");
            String addr =sc.next();
            System.out.println("enter age");
            float age = sc.nextFloat();

            Persons p2 = new Persons();
            p2.insertData(2,"Namrata","pune",22);
            p2.display();

            Persons p3 = new Persons();
            p3.insertData(3,"pooja","Soalpur",19);
            p3.display();




        }

}
