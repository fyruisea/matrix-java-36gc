public class Methods {

    static void printHello() {
        System.out.println("Hello");
    }

    static void printName(String name) {
        System.out.println("Hello" + " " + name);
    }

    static void printEvenNumbers() {
        for (int n = 2; n <=20; n+=2) {
            System.out.println(n);
        }
    }

    static int printSquare(int n) {
        return n * n;
    }

    static int sum(int a, int b) {
        return a + b;
    }

    static boolean isEven(int n) {
        return n % 2 ==0;
    }

    static void printBetween(int first, int last) {
        for (int i = first + 1; i < last; i++) {
            System.out.println(i);
        }
    }

    static int findMax(int a, int b, int c) {
        int max = a;
        if (b > max) max = b;
        if (c > max) max = c;
        return max;
    }

    static int getFactorial(int n) {
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }

    static int reverseNumbers(int n) {
        int reversed = 0;
        while (n > 0) {
        int number = n % 10;
        reversed = reversed * 10 + number;
        n /= 10;
        }
        return reversed;
    }

    static boolean isPrime(int n) {
        int i = 2;
        while (i < n / 2) {
            if (n % i == 0) return false;
            i++;
        }
        return true;
    }

    static int sumOfDigits(int n) {
        int sum = 0;
        while (n > 0) {
        sum += n % 10;
        n /= 10;
        }
        return sum;
    }

    static int countVowels(String text) {
        int count = 0;
        text = text.toLowerCase();
        String vowels = "aeiouəöüı";


        for(int i = 0; i < text.length(); i++) {
            String word = String.valueOf(text.charAt(i));
            if (vowels.contains(word)) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {

    printHello();
    printName("Firuza");
    printEvenNumbers();
    System.out.println(printSquare(12));
    System.out.println(sum(3 , 4));
    System.out.println(isEven(9));
    printBetween(12, 55);
    System.out.println(findMax(45, 65, 34));
    System.out.println(getFactorial(3));
    System.out.println(reverseNumbers(897));
    System.out.println(sumOfDigits(897));
    System.out.println(countVowels("Firuza"));

    }
}
