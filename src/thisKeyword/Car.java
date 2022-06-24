package thisKeyword;

public class Car {
    int carNo;
    String carName;
    double price;

    Car(int carNo, String carName, double price) {
        this.carNo = carNo;
        this.carName = carName;
        this.price = price;
    }

    void display() {
        System.out.println("********Car Details*************");
        System.out.println("carNo:" + carNo);
        System.out.println("Car name:" + carName);
        System.out.println("price:" + price);
    }
}
    class CarImp{
        public static void main(String[] args) {
            Car c1 = new Car(101,"maruti",90000000);
            c1.display();
        }


    }


