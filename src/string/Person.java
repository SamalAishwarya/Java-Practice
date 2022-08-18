package string;

public class Person {

    private int pid;

    private String name;

   private String mbl_no;

    @Override
    public String toString() {
        return "Person{" +
                "pid=" + pid +
                ", name='" + name + '\'' +
                ", mbl_no='" + mbl_no + '\'' +
                '}';


    }

    public static void main(String[] args) {
        Person p = new Person();
        p.mbl_no= "8669081524";
        p.name="Aishwarya";
        p.pid = 2;
        System.out.println(p.toString());
    }
}

