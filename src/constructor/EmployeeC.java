package constructor;

public class EmployeeC {
    String name;
    int emp_id;
    EmployeeC (String name,int emp_id){
        this.name = name;
        this.emp_id= emp_id;
    }

    public static void main(String[] args) {
        EmployeeC e1 = new EmployeeC("Aishwarya",11);
        EmployeeC e2 = new EmployeeC("Pravin",02);
        System.out.println("Employee1: "+e1.name +" " +e1.emp_id );
        System.out.println("Employee2: "+e2.name +" " +e2.emp_id );

    }
}
