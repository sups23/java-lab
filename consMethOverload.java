/**
 * consMethOverload
 */
class Car {
    private String name;
    private String model;

    Car(String name, String model) {
        this.name = name;
        this.model = model;
    }

    public void display() {
        System.out.println("Car " + this.name + " of model " + this.model + ".");
    }

    public void display(String year) {
        System.out.println("Car " + this.name + " of model " + this.model + " made in year " + year + ".");
    }
    
    public static void main(String args[]) {
        Car car = new Car("ABC", "XYZ");
        car.display();
        car.display("1987");
    }
}
