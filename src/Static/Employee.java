package Static;

public class Employee {
    int  emp_id;
    String name;
    static  String company ="WIPRO";   //static variable  can be used to refer to the common property or value for all objects.
    Employee (int emp_id,String name){
        this.emp_id = emp_id;
        this.name = name;
    }
    void display(){
        System.out.println(emp_id + ":" +name + " "+company);
    }

    public static void main(String[] args) {
        Employee e1 = new Employee(101,"Aishwarya");
        e1.display();
        Employee e2 = new Employee(102 ,"Pravin");
        e2.display();
        Employee e3 = new Employee(103,"Rohit");
        e3.display();
    }
}
