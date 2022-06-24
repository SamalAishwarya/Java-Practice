package constructor;

public class Person {
    int id;
    String name;
    String companyName;

    Person() {
        System.out.println("Default Constructor");
    }

    Person(String nm) {
        name = nm;
    }

    Person(int i, String nm) {
        id = i;
        name = nm;
    }

    void display() {
        System.out.println("Id:" + id);
        System.out.println("Name:" + name);
    }

}

class PersonImp {
    public static void main(String[] args) {
        Person p1 = new Person(5, "Aish");
        p1.display();
        Person p2 = new Person();//default constructor
        Person p3 = new Person("aishwarya");
        p3.display();
    }
}

