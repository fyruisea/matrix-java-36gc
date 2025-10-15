import java.util.Scanner;

public class Second {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        System.out.print("Neçəlik vurma cədvəli çap edilsin? (məs: 10): ");
        int n = sc.nextInt();

        System.out.println(n + "x" + n + " Vurma Cədvəli ");

        System.out.print("    ");
        for (int i = 1; i <= n; i++) {
            System.out.printf("%4d", i);
        }
        System.out.println();
        System.out.println("------------------------------------------------");


        for (int i = 1; i <= n; i++) {
            System.out.printf("%2d |", i);
            for (int j = 1; j <= n; j++) {
                System.out.printf("%4d", i * j);
            }
            System.out.println();
        }


    }
}





