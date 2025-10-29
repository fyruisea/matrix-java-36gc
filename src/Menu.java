import java.util.Scanner;

public class Menu{
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Menyu");
            System.out.println("1. Valyuta chevirici");
            System.out.println("2. BMI");
            System.out.println("3. Vergi hesablayicisi");
            System.out.println("4. Qiymet kakulyatoru");
            System.out.println("5. Taksi haqqinda hesablayici");
            System.out.println("6. Uchbucaq novu teyini");
            System.out.println("Seciminizi daxil edin (1-6)");

            int secim = scanner.nextInt();
            if (secim == 0) {
                System.out.println("Proqram dayandirildi!");
                break;
            }

            switch (secim) {
                case 1:
                    System.out.print("Mebleg:");
                    double amount = scanner.nextDouble();

                    scanner.nextLine();

                    System.out.print("From (AZN/USD/EUR):");
                    String from = scanner.nextLine().toUpperCase();

                    System.out.print("To (AZN/USD/EUR):");
                    String to = scanner.nextLine().toUpperCase();

                    double result = 0;

                    if (from.equals("AZN") && to.equals("USD"))
                        result = amount * 0.59;
                    else if (from.equals("AZN") && to.equals("EUR"))
                        result = amount * 0.54;
                    else if (from.equals("USD") && to.equals("AZN"))
                        result = amount * 1.70;
                    else if (from.equals("EUR") && to.equals("AZN"))
                        result = amount * 1.85;
                    else
                        System.out.println("Desteklenmir!");

                    System.out.println("Netice" + " " + result + " " + to);
                    break;

                case 2:
                    System.out.println("WeightKg");
                    float WeightKg = scanner.nextFloat();

                    System.out.println("HeightCm");
                    int HeightCm = scanner.nextInt();

                    double HeightM = HeightCm / 100.0;

                    double BMI = WeightKg / (HeightM * HeightM);

                    String category;

                    if (BMI < 18.5) {
                        category = "Zeif cekili";

                    } else if (BMI < 25) {
                        category = "Normal cekili";

                    } else if (BMI < 30) {
                        category = "Artiq cekili";

                    } else {
                        category = "Obez";

                    }
                    System.out.printf("BMI %.2f %s(%n)", BMI, category);

                    break;

                case 3:
                    System.out.println("Monthly Salary:");
                    double salary = scanner.nextDouble();

                    System.out.println("is Resident? (true/false):");
                    boolean resident = scanner.nextBoolean();

                    double tax;

                    if (resident) {
                        if (salary <= 500) {
                            tax = 0;
                        } else if (salary <= 2000) {
                            tax = (salary - 500) * 0.10;
                        } else {
                            tax = ((salary - 2000) * 0.15) + (1500 * 0.10);
                        }
                    } else {
                        tax = salary * 0.20;
                    }
                    double netSalary = salary - tax;

                    System.out.println("Vergi:" + " " + tax);
                    System.out.println("Net maash:" + " " + netSalary);
                    break;

                case 4:
                    System.out.println("Score daxil edin: (0-100)");
                    int score = scanner.nextInt();

                    String grade;

                    if (score >= 90 && score <= 100) {
                        grade = "A";
                    } else if (score >= 80 && score <= 89) {
                        grade = "B";
                    } else if (score >= 70 && score <= 79) {
                        grade = "C";
                    } else if (score >= 60 && score <= 69) {
                        grade = "D";
                    } else if (score >= 0 && score < 60) {
                        grade = "F";
                    } else {
                        System.out.println("Xəta: Balınız 0–100 arası olmalıdır!");
                        return;
                    }

                    System.out.println("Sizin qiymətiniz: " + grade);
                    break;

                case 5:
                    System.out.println("distanceKm:");
                    double distance = scanner.nextDouble();

                    System.out.println("Night");
                    boolean night = scanner.nextBoolean();

                    System.out.println("Age");
                    byte age = scanner.nextByte();

                    double start = 1.00;
                    double perKM = 0.70;

                    if (night) {
                        perKM += 0.10;
                    }
                    double total = start + (distance * perKM);

                    if (age < 12) {
                        total *= 0.50;
                    } else if (age >= 65)
                        total *= 0.65;

                    System.out.println("Taksi haqqi" + " " + total + " " + "AZN");
                    break;

                case 6:
                    System.out.println("a terefi:");
                    int a = scanner.nextInt();

                    System.out.println("b terefi:");
                    int b = scanner.nextInt();

                    System.out.println("c terefi:");
                    int c = scanner.nextInt();

                    if (a + b > c || a + c > b || b + c > a) {

                        if (a == b && b == c) {
                            System.out.println("Ucbucaq berabertereflidir");
                        } else if (a == b || b == c || a == c) {
                            System.out.println("Ucbucaq beraberyanlidir");
                        } else {
                            System.out.println("Muxteriftereflidir");
                        }

                    } else {
                        System.out.println("Xeta: Daxil edilen terefler yanlisdir!");
                    }
                    break;

                default:
                    System.out.println("Yanlish sechim");
            }
        }




    }
}
