public class MultiArrays {
    public static void main(String[] args) {
        int[][] array = {
                {8, 18, 28, 38},
                {48, 58, 68, 78},
                {88, 98, 108, 118},
                {128, 138, 148, 158}
        };

        int row = array.length;
        int col = array[0].length;

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                if (i < j) {
                    array[i][j] = 1;
                } else {
                    array[i][j] = 0;
                }
            }
        }
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
}
