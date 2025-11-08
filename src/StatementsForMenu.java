import java.util.Scanner;

public class StatementsForMenu {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println(""" 
                    Menyu:
                    1.Valyuta chevirici
                    2. BMI
                    3. Vergi hesablayici
                    4. Qiymet kakulyatoru
                    5. Taksi haqqi hesablayici
                    6. Uchbucaq novu teyini
                    seciminizi daxil edin:
                    """);
            int secim = sc.nextInt();

            if (secim == 0) {
                System.out.println("Proqram dayandirildi!");
            }

            switch (secim) {
                case 1:
                    System.out.println("Meblegi daxil edin:");
                    double amount = sc.nextDouble();

                    sc.nextLine();

                    System.out.print("from (AZN/USD/EUR)");
                    String from = sc.nextLine().toUpperCase();

                    System.out.print("to (AZN/USD/EUR)");
                    String to = sc.nextLine().toUpperCase();

                    double result = 0;

                    if (from.equals("AZN") && to.equals("USD")) {
                        result = amount * 0.59;
                    } else if (from.equals("AZN") && to.equals("EUR")) {
                        result = amount * 0.54;
                    } else if (from.equals("USD") && to.equals("AZN")) {
                        result = amount * 1.70;
                    } else if (from.equals("EUR") && to.equals("AZN")) {
                        result = amount * 1.85;
                    } else {
                        System.out.println("Xeta!, Yeniden cehd edin.");
                    }

                    System.out.println("Neticeniz:" + " " + result);
                    break;

                case 2:
                    System.out.println("Chekinizi daxil edin:");
                    float weightKg = sc.nextFloat();

                    System.out.println("Boyunuzu daxil edin:");
                    int heightCm = sc.nextInt();

                    double heightM = heightCm / 100.0;

                    double BMI = weightKg / (heightM * heightM);

                    if (BMI < 18.5 && BMI > 0) {
                        System.out.println("Zeif cekili");
                    } else if (BMI > 18.5 && BMI < 24.9) {
                        System.out.println("Normal cekili");
                    } else if (BMI > 25 && BMI < 29.9) {
                        System.out.println("Artiq cekili");
                    } else if (BMI >= 30) {
                        System.out.println("Obez");
                    } else {
                        System.out.println("Xeta");
                    }
                    break;
                case 3:
                    System.out.println("Ayliq maas:");
                    double salary = sc.nextDouble();

                    System.out.println("Resident?");
                    boolean isResident = sc.nextBoolean();

                    double tax = 0;

                    if (isResident) {
                        if (salary <= 500 && salary > 0) {
                            tax = 0;
                        } else if (salary > 500 && salary <= 2000) {
                            tax = (salary - 500) * 0.1;
                        } else if (salary > 2000) {
                            tax = 1500 * 0.1 + (salary - 2000) * 0.15;
                        }
                    } else {
                        tax = salary * 0.2;
                    }

                    double netSalary = salary - tax;

                    System.out.println("Verginiz:" + " " + tax +
                            "Yekun maasiniz:" + " " + netSalary);
                    break;
                case 4:
                    System.out.println("Input:");
                    int score = sc.nextInt();

                    String grade = "";

                    if (score <= 100 && score >= 90) {
                        grade = "A";
                    } else if (score >= 80 && score <= 89) {
                        grade = "B";
                    } else if (score >= 70 && score <= 79) {
                        grade = "C";
                    } else if (score >= 60 && score <= 69) {
                        grade = "D";
                    } else if (score < 60 && score > 0) {
                        grade = "F";
                    } else {
                        System.out.println("Xeta");
                    }

                    System.out.println("Output" + " " + grade);
                    break;

                case 5:
                    System.out.println("Distance:");
                    double distanceKm = sc.nextDouble();

                    System.out.println("Night");
                    boolean night = sc.nextBoolean();

                    System.out.println("Age");
                    byte age = sc.nextByte();

                    double start = 1.00;
                    double perKm = 0.70;

                    if (night) {
                        perKm += 0.10;
                    }

                    double tariff = start + (perKm * distanceKm);

                    if (age < 12 && age > 0) {
                        tariff *= 0.5;
                    } else if (age >= 65) {
                        tariff *= 0.7;
                    }
                    System.out.println(tariff);
                    break;
                case 6:
                    System.out.println("a terefi:");
                    int a = sc.nextInt();

                    System.out.println("b terefi:");
                    int b = sc.nextInt();

                    System.out.println("c terefi:");
                    int c = sc.nextInt();

                    boolean teref = a + b > c;

                    if (teref) {
                        if (a == b && b == c) {
                            System.out.println("Ucbucaq berabertereflidir");
                        } else if (a == b || b == c || a == c) {
                            System.out.println("Ucbucaq beraberyanlidir");
                        } else {
                            System.out.println("Muxtelif tereflidir");
                        }
                    } else {
                        System.out.println("Xeta");
                    }
                    break;

                default:
                    System.out.println("Yanlish secim");
            }
        }
    }
}
