import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    Person[] people = new Person[2];

    for(int i = 0; i < people.length; i++) {
        System.out.println("Sexsin melumatlari:");
        people[i] = new Person();
        people[i].inputData();
    }

        System.out.println("\nDaxil etdikleriniz:");
        for (Person per : people) {
            per.printData();
        }

        Person.printCount();
  }
}
