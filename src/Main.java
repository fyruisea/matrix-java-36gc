import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);


        System.out.println("Ad daxil edin:");
        String name = sc.next();
        System.out.println("Soyad daxil et:");
        String surname = sc.next();
        System.out.println("Yash daxil et:");
        int age = sc.nextInt();

        Student student = new Student(name, surname, age);
        student.print();


  }
}
