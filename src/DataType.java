import java.util.Scanner;

public class DataType {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("1-ci:");
        int a = sc.nextInt();
        System.out.println("2-ci:");
        int b = sc.nextInt();
        System.out.println("3-cu:");
        int c = sc.nextInt();

        double edediOrta = (double) (a + b + c) / 3;

        System.out.printf("%.3f", edediOrta);

        System.out.println("-------------------------------------");

        System.out.println("Metn daxil edin:");
        String text = sc.nextLine();

        System.out.println("Reqedm daxil edin:");
        int y = sc.nextInt();

        System.out.println("Reqem daxil edin");
        short s = sc.nextShort();

        System.out.println("Reqem daxil edin");
        byte e = sc.nextByte();

        System.out.println("Uzun reqem daxil edin");
        long l = sc.nextLong();

        System.out.println("Simvol daxil edin:");
        char h = sc.next().charAt(0);

        System.out.println("Yoxlayin");
        boolean shert = sc.nextBoolean();

        System.out.println("Kesr eded daxil edin");
        double n = sc.nextDouble();

        System.out.println("Kesr eded daxil edin");
        float f = sc.nextFloat();

        System.out.println("1-ci:" + text + "\nf2-ci:" + y +
                           "\n3-cu:" + s + "\n4-cu:" + e +
                           "\n5-ci:" + l + "\n6-ci:" + h +
                           "\n7-ci:" + h + "\n8-ci:" + shert +
                           "\n9-cu:" + n + "\n10-cu:" + f);


    }

}
