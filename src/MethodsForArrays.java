public class MethodsForArrays {

    public static int tekEdedSayi(int[] array) {
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 1) {
                count++;
            }
        }
        return count;
    }

    public static int sum(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }

        return sum;


    }

    public static int kicikEded(int[] array) {
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }

    public static int boyukEded(int[] array) {
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }

    public static double edediOrta(int[] array) {
        double cem = 0;
        double edediOrta = 0;

        for (int i = 0; i < array.length; i++) {
            cem += array[i];

            edediOrta = cem / array.length;

        }
        return edediOrta;
    }



    public static void main(String[] args) {

        int[] numbers = {3, 4, 6, 7, 8, 11, 20};
        System.out.println(tekEdedSayi(numbers));
        System.out.println(sum(numbers));
        System.out.println(kicikEded(numbers));
        System.out.println(boyukEded(numbers));
        System.out.println(edediOrta(numbers));
    }
}
