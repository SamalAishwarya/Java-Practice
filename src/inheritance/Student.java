package inheritance;

public class Student {
    String name;
    int rno;
    String div;

}
class PhysicsMarks  extends Student{
    double marks = 78;
}
class ChemistryMarks extends  Student{
    double marks = 85;
}
class MathMarks extends  Student{
    double marks =90;
}

class StudentIml{
    public static void main(String[] args) {
        MathMarks mathMarks = new MathMarks();
        ChemistryMarks chemistryMarks = new ChemistryMarks();
        PhysicsMarks physicsMarks = new PhysicsMarks();

        double total = mathMarks.marks + chemistryMarks.marks + physicsMarks.marks;
        double percentage =(total/300)*100;
        System.out.println("**************Student Details***** ");
        System.out.println("Roll No"+mathMarks);
        System.out.println("Aishwarya"+mathMarks.name);
        System.out.println("A"+mathMarks.div);
        System.out.println("percentage" +percentage);

    }
}
