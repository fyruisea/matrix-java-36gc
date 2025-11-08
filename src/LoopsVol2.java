import java.util.Random;
import java.util.Scanner;

public class LoopsVol2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 100; i++) {
            if (i % 3 == 0 && (i * i) % 4 == 0) {
                System.out.println(i);
            }
        }

        System.out.println("Eded daxil edin");
        int n = sc.nextInt();

        while (n >= 1) {
            System.out.println(n + " ");
            n--;
        }

        System.out.println("Eded daxl edin");
        int k = sc.nextInt();
        int sum = 0;

        while (k >= 1) {
            sum += k % 10;
            k /= 10;
        }

        System.out.println(sum);

        System.out.println("Eded daxil edin");
        int e = sc.nextInt();
        int reversed = 0;
        int num = e;

        while (num >= 1) {
            int qaliq = num % 10;
            reversed = reversed * 10 + qaliq;
            num /= 10;
        }
        if (reversed == e) {
            System.out.println("Palindromdur");
        } else {
            System.out.println("NOT");
        }

        String text = "java";
        String soz;


        do {
            System.out.println("Sozu daxil edin:");
            soz = sc.nextLine();
        } while (!soz.equals(text));

        System.out.println("Good job");

        int o;
        int cem = 0;

        do {
            System.out.println("Reqem daxil edin");
            o = sc.nextInt();
            cem += o;
        } while (o != 0);
        System.out.println(cem);

        Random rnd = new Random();

        int randomNumber = rnd.nextInt(10) + 1;
        int guess;
        int attempts = 0;

        do {
            System.out.println("Guess the number");
            guess = sc.nextInt();
            attempts++;

        } while (guess != randomNumber);

        System.out.println("You are right!");
        System.out.println("You've tried:" + " " + attempts);

        int summary = 0;

        do {
            System.out.println("Reqem daxil et");
            int l = sc.nextInt();
            summary += l;

        } while (summary != 30);

        System.out.println("OK");

        System.out.println("eded daxil edin");
        int y = sc.nextInt();
        int sm = 0;
        int ml = 1;

        while (y > 0) {
            int digit = y % 10;
            sm += digit;
            ml *= digit;
            y /= 10;
        }
        double nisbet = (double) sm / ml;
        System.out.println(nisbet);


        System.out.println("3 reqemli eded daxil edin");
        int ucR = sc.nextInt();

        while (ucR > 99) {
            ucR /= 10;
        }
        System.out.println(ucR %= 10);

        for (int i = 1; i < 500; i++) {
            int summ = 0;

            for (int j = 1; j < i; j++) {
                if (i % j == 0) {
                    summ += j;
                }
            }
            if (summ == i) {
                System.out.println(i);
            }
        }

    }
}
