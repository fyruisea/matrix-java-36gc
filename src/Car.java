public class Car {
    String model;
    int year;
    double price;


    public Car(String model) {
        this.model = model;
    }

    public Car(String model , int year) {
        this.model = model;
        this.year = year;
    }

    public Car(String model, int year, double price) {
        this.model = model;
        this.year = year;
        this.price = price;
    }

    public void prinCarInfo() {
        System.out.println(model);
        System.out.println(model + " " + year);
        System.out.println(model + " " + year + " " + price);
    }
}
