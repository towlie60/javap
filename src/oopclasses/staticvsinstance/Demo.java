package oopclasses.staticvsinstance;

public class Demo {
    public static void main(String[] args) {

        Car c = new Car(122332431, "ABC123", "BMW", "M5");
        Car c2 = new Car(22222221, "ABC124", "BMW", "M3");

        System.out.println(Car.count);
        Car c3 = new Car(22222221, "ABC124", "BMW", "M3");
        System.out.println(Car.count);
        c3.count = 0;

        System.out.println(Car.count);
    }
}
