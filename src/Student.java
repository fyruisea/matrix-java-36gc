import java.util.Scanner;

public class Student {

    String name;
    String surname;
    int age;
    String phoneNumber;

    void inputData() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ad daxil et");
        name = sc.next();
        System.out.println("Soyad daxil et");
        surname = sc.next();
        System.out.println("Yas daxil et");
        age = sc.nextInt();
        System.out.println("Nomre daxil et");
        phoneNumber = sc.next();
    }

    void printData() {
        System.out.println("Ad" + " " + name + " " +
                "Soyad" + " " + surname +
                "Yas" + " " + age +
                "Nomre" + " " + phoneNumber);
    }


}