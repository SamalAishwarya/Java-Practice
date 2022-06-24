package oops;

import java.util.Scanner;

public class Student {
    int Rno;
    String name;
    String address;
    float age;

    void insertData(int r, String nm, String addr, float a) {
        Rno = r;
        name = nm;
        address = addr;
        age = a;
    }

    void display() {    //method we create
        System.out.println("*************Student details*********");
        System.out.println("Roll no:" + Rno);
        System.out.println("name:" + name);
        System.out.println("address" + address);
        System.out.println("age:" + age);
    }

}
class StudentImpl{
    public static void main(String[] args) {

        Student s1 = new Student(); // s1- reference variable
        s1.Rno = 1;
        s1.name = "Aishwarya";
        s1.address = "pune";
        s1.age = 7.5f;

//        Student s2 = new Student();
//        s2.Rno = 1;
//        s2.name = "Namrata";
//        s2.address = "pune";
//        s2.age = 7.5f;

        Scanner sc = new Scanner(System.in);
        System.out.println("enter Rno");
        int Rno = sc.nextInt();
        System.out.println("enter name");
        String nm= sc.next();
        System.out.println("enter address");
        String addr =sc.next();
        System.out.println("enter age");
        float age = sc.nextFloat();

        Student s2 = new Student();
        s2.insertData(2,"Aish","pune",22);
        s2.display();

        Student s3 = new Student();
        s3.insertData(3,"nam","pune",21);
        s3.display();




    }
    }