import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Necelik vurma cedveli cap edilsin?");
        int n = sc.nextInt();

        System.out.println(n + "x" + n + " " + "Vurma Cedveli");

        for (int i = 1; i <= n; i++) {
            System.out.printf("%2d |", i);
            for (int j = 1; j <= n; j++ ) {
                System.out.printf("%4d", i * j);
                }
            System.out.println();
            }

        System.out.println("3 reqemli eded daxil edin:");
        int t = sc.nextInt();
        int sum = 0;
        while (t > 0) {
            int qaliq = t % 10;
            sum += qaliq;
            t /= 10;

        }
        System.out.println(sum);

        int a = 0;
        int b = 1;

        System.out.print(a + " " + b + " ");

        for (int i = 1; i < 100; i++) {
            int c = a + b;

            if (c >= 100) {
                continue;
            }
            System.out.print(c + " ");
            a = b;
            b = c;
        }

        int d = 0;
        int e = 1;

        System.out.print(d + " " + e + " ");
        int f = d + e;

        while (f < 100) {
            System.out.print(f + " ");
            d = e;
            e = f;
            f = d + e;
        }

        for (int i = 1; i <= 4; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for (int i = 4; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }



    }


}


