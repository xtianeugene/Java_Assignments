class Vehicle {
    String brand;
    int year;

    public Vehicle(String brand, int year) {
        this.brand = brand;
        this.year = year;
    }
}

class Car extends Vehicle {
    int seats;

    public Car(String brand, int year, int seats) {
        super(brand, year);
        this.seats = seats;
    }

    void printDetails() {
        System.out.println("Brand: " + brand);
        System.out.println("Year: " + year);
        System.out.println("Seats: " + seats);
    }
}

public class VehicleRentalSystem {
    public static void main(String[] args) {
        Car myCar = new Car("Honda", 2023, 7);

        System.out.println("=== Car Details ===");
        myCar.printDetails();
    }
}