import javax.management.StringValueExp;
import java.util.Random;
import java.util.Scanner;

public class Fourth {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //Task 1
//        System.out.print("n daxil et:");
//        int n = sc.nextInt();
//
//        while (n >= 1) {
//            System.out.println(n + " ");
//            n--;
//        }


        //Task 2
//        System.out.print("Ededi daxil et:");
//        int n = sc.nextInt();
//        int sum = 0;
//
//        while (n > 0) {
//            sum += n % 10;
//            n /= 10;
//        }
//
//        System.out.println("Reqemlerinin cemi" + " " + sum);


        //Task 3
//        System.out.print("Ededi daxil edin:");
//        int n = sc.nextInt();
//
//        int num = n;
//        int reversed = 0;
//
//        while (num > 0) {
//            int digit = num % 10;
//            reversed = reversed * 10 + digit;
//            num /= 10;
//        }
//        if (n == reversed) {
//            System.out.println("Palindromdur");
//        } else {
//            System.out.println("Palindrom deyil");
//        }


        //Task 4
//          String correct = "java";
//          String input;
//
//          do {
//              System.out.print("Sozu daxil et:");
//              input = sc.nextLine();
//          } while (!input.equals(correct));
//
//          System.out.println("OK");


        //Task 5
//        int sum = 0;
//        int n;
//
//        do {
//            System.out.print("Ededi daxil edin:");
//            n = sc.nextInt();
//            sum += n;
//        } while (n != 0);
//
//        System.out.println("Cem" + " " + sum);


        //Task 6
//        Random rnd = new Random();
//
//        int randomNumber = rnd.nextInt(10) + 1;
//        int guess;
//        int attempts = 0;
//
//        do {
//            System.out.print("Guess the number:");
//            guess = sc.nextInt();
//            attempts++;
//        } while (guess != randomNumber);
//
//        System.out.println("You are right!");
//        System.out.println("You've tried:" + " " + attempts + " " + "times");


        //Task 7
//        int sum = 0;
//
//        while (sum < 30) {
//            System.out.print("Ededi daxil edin:");
//            int n = sc.nextInt();
//            sum += n;
//
//            if (sum == 30) {
//                System.out.println("Cem" + " "  + sum + " " + "OK");
//                break;
//            }
//        }
//        if (sum > 30)
//            System.out.println("Cem 30-u kecdi! (" + sum + ")");


        //Task 8
//        System.out.print("Eded daxil edin:");
//        int n = sc.nextInt();
//
//        int num = n;
//        int sum =0, product = 1;
//
//        while (num > 0) {
//            int digit = num % 10;
//            sum += digit;
//            product *= digit;
//            num /= 10;
//
//        }
//            if (product != 0)
//                System.out.println("Nisbet (cem/hasil):" +((double) sum / product));
//            else
//                System.out.println("Hasil 0-a beraberdir, nisbet tapilmadi.");


        //Task 9
//        System.out.print("Ededi daxil et:");
//        int n = sc.nextInt();
//
//        String s = String.valueOf(n);
//        if (s.length() >= 2)
//            System.out.println("Ikinci reqem" + " " + s.charAt(1));
//        else
//            System.out.println("Bu ededin ikinci reqemi yoxdur.");


        //Task 10
//        System.out.println("0-500 arasi mukemmel ededler");
//
//        for (int i = 1; i <= 500; i++) {
//            int sum = 0;
//
//            for (int j = 1; j < i; j++) {
//                if (i % j == 0)
//                    sum += j;
//            }
//            if (sum == i)
//                System.out.println(i);
//        }


        //Task 11
//        int [] array1 = {1, 3, 4, 9, 15};
//        int [] array2 = {2, 3, 5, 9, 14};
//
//        int i = 0,  j = 0;
//
//        System.out.println("Ortaq elementler");
//
//        while (i < array1.length && j < array2.length) {
//            if (array1[i] == array2[j]) {
//                System.out.println(array1[i] + " ");
//                i++;
//                j++;
//            } else if (array1[i] < array2[j]) {
//                i++;
//            } else {
//                j++;
//            }
//        }
        



    }
}