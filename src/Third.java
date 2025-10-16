import java.util.Scanner;

public class Third {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

/*      System.out.println("Ededi daxil edin:");
        int number = sc.nextInt();

        int sum = 0;
        int orj = number;

        while (orj != 0) {
           int last = orj % 10;
           sum += last;
           orj /= 10;
        }

        System.out.println(number + " " + "Ededin reqemleri cemi" + " " + sum);
*/

/*      System.out.println("Neche dene eded gosterilsin?");
        int n = sc.nextInt();

        int a = 0; int b = 1;

        System.out.print("Fibonacci sirasi (for ile)" + " " + a + " " + b + " ");

        for (int i = 2; i < n; i++) {
            int c = a + b;
            System.out.print(c + " ");
            a = b;
            b = c;
        }
*/

/*      System.out.println("Neche dene eded gosterilsin?");
        int n = sc.nextInt();

        int a = 0; int b = 1;
        int count = 2;

        System.out.print("Fibonnacci sirasi (while ile)" + " " + a + " " + b + " ");

        while (count < n) {
            int c = a + b;
            System.out.print(c + " ");
            a = b;
            b = c;
            count++;

        }
*/

/*        int secim;

        while (true) {
            System.out.println("---Kakulyator----");
            System.out.println("1. Toplama");
            System.out.println("2. Chixma");
            System.out.println("3. Vurma");
            System.out.println("4. Bolme");
            System.out.println("5. Proqrami dayandir");
            System.out.print("Seciminizi daxil edin:");

            secim = sc.nextInt();

            if (secim == 5) {
                System.out.println("Proqram dayandirildi");
                break;
            }

            if (secim > 5 || secim < 1) {
                System.out.println("Xeta");
                continue;
            }

            System.out.println("Birinci ededi daxil edin:");
            double a = sc.nextDouble();

            System.out.println("Ikinci ededi daxil edin:");
            double b = sc.nextDouble();

            switch (secim) {
                case 1:
                    System.out.println("Netice" + (a + b));
                    break;
                case 2:
                    System.out.println("Netice" + (a - b));
                    break;
                case 3:
                    System.out.println("Netice" + (a * b));
                    break;
                case 4:
                    if (b != 0)
                        System.out.println("Netice" + (a / b));
                    else
                        System.out.println("Sifira bolmek mumkun deyil!");
                    break;
                default:
                    System.out.println("Secim yanlisdir!");
                    break;

            }


        }

*/
    }
}