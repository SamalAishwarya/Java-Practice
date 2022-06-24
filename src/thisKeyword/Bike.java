package thisKeyword;

public class Bike {
    int bikeNo;
    String bikeName;

    public Bike() {
        this(101, "Honda");
        System.out.println("In default Constructer");
    }

    public Bike(int bikeNo, String bikeName) {
        System.out.println("In paramertrised constructor");
        this.bikeNo = bikeNo;
        this.bikeName = bikeName;
    }

    void display() {
        System.out.println("Bike Details");
        System.out.println("BikeNo" + bikeNo);
        System.out.println("BikeName" + bikeName);
    }
}
    class BikeImpl{
        public static void main(String[] args) {
            Bike bike = new Bike();
            bike.display();

        }
    }

