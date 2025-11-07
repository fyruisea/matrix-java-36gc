public class Employee {
    String name = "Unknown";
    int salary = 0;

    public Employee(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }

    public void printEmployee() {
        System.out.println(name + " " + salary);
    }

}
