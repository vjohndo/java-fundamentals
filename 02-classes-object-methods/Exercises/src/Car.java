public class Car {
    private String brand;
    private String make;
    private int year;

    public Car (String brand, String make, int year) {
        this.brand = brand;
        this.make = make;
        this.year = year;
    }

    @Override
    public String toString() {
        return this.brand + " " + this.make + " " + String.valueOf(this.year);
    }

    public static void main(String[] args) {
        Car myCar = new Car("Honda", "Civic", 2012);
        System.out.println(myCar);
    }
}
