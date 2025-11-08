public class Arrays {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5};
        int[] b = {3, 7, 8, 9, 10};

        int i = 0;
        int j = 0;

        System.out.println("Ortaq Elementler");

        while (i < a.length && j < b.length) {
            if (a[i] == b[j]) {
                System.out.println(a[i] + " ");
                i++;
                j++;
            } else if (a[i] < b[j]) {
                i++;
            } else {
                j++;
            }
        }

        int[] numbers = {3, 5, 7, 9, 11, 12};

        int sum = 0;

        for (int p = 0; p < numbers.length; p++) {
            sum += numbers[p];
        }
        double ortalama = (double) sum / numbers.length;
        System.out.println(ortalama);

        int[] array = {1, 2, 3, 4, 5};

        int num = array[0];
        array[0] = array[array.length - 1];
        array[array.length - 1] = num;

        for (int f = 0; f < array.length; f++) {
            System.out.print(array[f] + " ");
        }

        System.out.println();

        int[] tam = {1, -1, 2, -2, 3, -3};

        for (int h = 0; h < tam.length; h++) {
            if (tam[h] > 0) {
                tam[h] += 2;
            }
            System.out.print(tam[h] + " ");
        }

        System.out.println();

        int[] arr = {-12, 14, 18, 20, 24, 27};
        int count = 0;
        int summ = 0;

        for (int c = 0; c < arr.length; c++) {
            if (arr[c] % 6 == 0 && arr[c] > 0) {
                count++;
                summ += arr[c];
            }
        }
        System.out.println(summ + " " + count);

        System.out.println();

        int f = 8;
        int n = 18;
        int cemi = 0;

        for (int z = 8; z <= 18; z++) {
            if (z % 2 == 1) {
                cemi += z;
            }
        }
        System.out.println(cemi);

        System.out.println();

        int v = 8;
        int original = v;
        int say = 0;

        while (v > 1) {
            if (v % 2 == 0)
                v /= 2;
            else
                v += 1;
            say++;

        }

        System.out.println(original + " " + say);

    }
}
