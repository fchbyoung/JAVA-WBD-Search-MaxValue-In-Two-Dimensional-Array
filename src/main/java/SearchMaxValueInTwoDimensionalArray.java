public class SearchMaxValueInTwoDimensionalArray {
    public static void main(String[] args) {

        int[][] arr = {
                {10, 2, 5, 4},
                {3, 10, 8, 7},
                {1,9,11,13,12},
                {14,6,17,15,18}
        };

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }

        int max = arr[0][0];
        int row = 0, column = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if(arr[i][j] > max) {
                    max = arr[i][j];
                    row = i;
                    column = j;
                }
            }
        }

        System.out.println("MaxValue = " + max + " and position : row = " + row + " column = " + column);

    }
}
