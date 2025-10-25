import java.util.Scanner;

public class Sixth {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
/*
        int[] myArray = {1, 0, -6, 6, -7, 8, -3, 11, -98, 1038};

        for (int i = 0; i < myArray.length; i++) {
            if (myArray[i] >= 0) {
                myArray[i] += 2;
            }

            System.out.println(myArray[i] + " ");
        }
*/
    //--------------------------------------
/*
        int n = 7890987;

        int temp = n;
        int length = 0;

        while (temp > 0) {
            length++;
            temp /= 10;
        }

        int[] digits = new int[length];
        temp = n;


        for (int i = length - 1; i >= 0; i--) {
            digits[i] = temp % 10;
            temp /= 10;
        }

        int count = 0;

        for (int i = 0; i < length / 2; i++) {
            if (digits[i] == digits[length - 1 - i]) {
                count++;
            }
        }
        if (length % 2 == 1) {
            count++;

        System.out.println(count);
*/
    //----------------------------------------
/*        System.out.println("Arrayde nece eded olsun?");
        int n = sc.nextInt();

        System.out.println("Array ucun ededleri daxil edin:");
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int count = 0;
        int sum = 0;

        for (int i = 0; i < n; i++) {
            if (arr[i] % 6 == 0 && arr[i] > 0) {
                count++;
                sum += arr[i];
            }
        }
        System.out.println(count);
        System.out.println(sum);
*/
    //----------------------------------
/*      int a = 8;
        int b= 18;

        int sum = 0;

        for ( int i = a; i <= b; i++ ) {
            if (i % 2 == 1) {
                sum += i;
            }
        }

        System.out.println(sum);
*/
    //----------------------------------------
/*        System.out.println("Her hansi bir eded daxil edin:");
        int n = sc.nextInt();
        int count = 0;

        while (n > 1) {
            if (n % 2 == 1)
                n += 1;
            else
                n /= 2;
            count++;
        }
        System.out.println("input" + " " + n);
        System.out.println("output" + " " + count);
*/
    //-----------------------------------------
/*        int[][] matrix = {
                {8, 18, 28, 38},
                {48, 58, 68, 78},
                {88, 98, 108, 118},
                {128, 138, 148, 158}
        };

        int sum = 0;

        for (int i= 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                sum += matrix[i][j];
            }
        }
        System.out.println(sum);
*/
    //----------------------------------------------
/*        int[][] array = {
                 {8, 18, 28, 38},
                {48, 58, 68, 78},
                {88, 98, 108, 118},
                {128, 138, 148, 158}
        };

        for (int i = 0; i < array.length; i++) {
            int sum1 = 0;
            for (int j = 0; j < array[i].length; j++) {
                sum1 += array[i][j];
            }
            System.out.println("Setir" + (i + 1) +" " + sum1);
        }

        for (int j = 0; j < array[0].length; j++) {
            int sum2 = 0;
            for (int i = 0; i < array.length; i++) {
                sum2 += array[i][j];
                System.out.println("Sutun" + (j + 1) + " " + sum2);
            }
        }
*/
    //-------------------------------------------
          int[][] array = {
                {8, 18, 28, 38},
                {48, 58, 68, 78},
                {88, 98, 108, 118},
                {128, 138, 148, 158}
        };
        int row = array.length;
        int column = array[0].length;

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                if (i < j) {
                    array[i][j] = 1;
                } else {
                    array[i][j] = 0;
                }
            }
        }
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }


    }
}
