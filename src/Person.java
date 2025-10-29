import java.util.Scanner;

public class Person {
    String name;
    String surname;
    int age;
    String phoneNumber;

    static int count = 0;

    static void printCount() {
        System.out.println(count);
    }

    Person() {
        count++;
    }

    void inputData() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ad daxil et");
        name = sc.nextLine();
        System.out.println("Soyad daxil et");
        surname = sc.nextLine();
        System.out.println("Yas daxil et");
        age = sc.nextInt();
        System.out.println("Nomre daxil et");
        phoneNumber = sc.nextLine();
    }

    void printData() {
        System.out.println("Ad" + " " + name + " " +
                "Soyad" + " " + surname +
                "Yas" + " " + age +
                "Nomre" + " " + phoneNumber);
    }

    public boolean equals(Person p) {
        if (this == p) return true;
        if (p == null) return false;
        Person per = (Person) p;
        return age == per.age &&
                name.equals(per.name) &&
                surname.equals(per.surname) &&
                phoneNumber.equals(per.phoneNumber);
    }


    public static void main(String[] args) {
    }
}



