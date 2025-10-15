import java.util.Scanner;

public class Third {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Ededi daxil edin:");
        int number = sc.nextInt();

        int sum = 0;
        int orj = number;

        while (orj != 0) {
           int last = orj % 10;
           sum += last;
           orj /= 10;
        }

        System.out.println(number + " " + "Ededin reqemleri cemi" + " " + sum);

    }
}