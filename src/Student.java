import java.util.Scanner;

public class Student {

    String name;
    String surname;
    int age;
    String phoneNumber;

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

    public class Qeydiyyat {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            Student[] students = null;

            while (true) {
                System.out.println("Menu:");
                System.out.println("1. Qeydiyyat");
                System.out.println("2. Hamısını göstər");
                System.out.println("3. Çıxış");
                System.out.print("Seçimin: ");
                int choice = sc.nextInt();

                if (choice == 1) {
                    System.out.print("Neçə nəfər qeydiyyatdan keçəcək?: ");
                    int n = sc.nextInt();
                    sc.nextLine();
                    students = new Student[n];

                    for (int i = 0; i < n; i++) {
                        System.out.println((i + 1) + ". tələbənin məlumatlarını daxil et:");
                        students[i] = new Student();
                        students[i].inputData();
                    }

                } else if (choice == 2) {
                    if (students == null || students.length == 0) {
                        System.out.println("Hələ heç kim qeydiyyatdan keçməyib.");
                    } else {
                        System.out.println("Qeydiyyatdan keçənlər:");
                        for (Student s : students) {
                            s.printData();
                        }
                    }

                } else if (choice == 3) {
                    System.out.println("Proqram bitdi.");
                    break;
                } else {
                    System.out.println("Yanlış seçim.");
                }
            }

        }
    }
}