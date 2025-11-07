import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Student s = new Student("Firuza", 19);

        s.printStudentInfo();

        Rectangle r = new Rectangle(12, 4);

        r.area();
        r.perimeter();

        Book b = new Book("Phobia,", "Wult Dorn,", 9.99);

        b.printDetails();

        Car c = new Car("Lamborghini", 2018, 450500);

        c.prinCarInfo();

        Employee e = new Employee("Firuza", 1800);

        e.printEmployee();

        Product p1 = new Product("1", "LapTop", 2000);
        Product p2 = new Product("2", "LipStick", 55);
        Product p3 = new Product("3", "EarPhones", 60);
        Product p4 = new Product("4", "Heels", 885);
        Product p5 = new Product("5", "BoxerGloves", 30);

        Product[] products = {p1, p2, p3, p4, p5};
        Product max = products[0];
        for (int i = 0; i < products.length; i++) {
            if (max.price < products[i].price) {
                max.price = products[i].price;
                System.out.println(max);
            }
        }
        max.mostExpensive();

    }

}
