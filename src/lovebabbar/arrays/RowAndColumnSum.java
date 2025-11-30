package lovebabbar.arrays;

public class RowAndColumnSum {
    static void main() {
        RowAndColumnSum.sumSameRowsColumn();
        findMax();
        sumDiffRowsColumn();
        tranposeSameMatrix();
        MxNMatrix();
    }
    static void sumSameRowsColumn() {
        int[][] a = {
                {1,2,3},
                {4,5,6},
                {7,8,9}};
        int sum = 0;
        System.out.println("Row Wise Print");
        for (int i =0; i<a.length; i++){
            for (int j=0; j<a[i].length; j++){
                sum += a[i][j];
            }
            System.out.println("ith Row Sum "+sum);
            sum =0;
        }
        System.out.println("Column Wise Print");
        for (int i =0; i<a.length; i++){
            for (int j=0; j<a[i].length; j++){
                sum += a[j][i];
            }
            System.out.println("ith Column Sum "+sum);
            sum =0;
        }
    }
    static void findMax() {
        int[][] a = {
                {1,2,3},
                {4,5,6},
                {7,8,9}};
        int max  = Integer.MIN_VALUE;
        System.out.println("Row Wise Print");
        for (int i =0; i<a.length; i++){
            for (int j=0; j<a[i].length; j++){
                if (a[i][j] > max){
                    max = a[i][j];
                }
            }


        }  System.out.println("Max : " +max);
    }
    static void sumDiffRowsColumn() {
        int[][] a = {
                {1,2,3,8},
                {4,5,6,6},
                {7,8,9,7}};
        int sum = 0;
        System.out.println("Diff Row Wise Print");
        for (int i =0; i<a.length; i++){
            for (int j=0; j<a[i].length; j++){
                sum += a[i][j];
            }
            System.out.println("ith Row Sum "+sum);
            sum =0;
        }
        System.out.println("Diff Column Wise Print");
        for (int i =0; i<a[0].length; i++){
            for (int j=0; j<a.length; j++){
                sum += a[j][i];
            }
            System.out.println("ith Column Sum "+sum);
            sum =0;
        }
    }
    static void tranposeSameMatrix() {
        //If the matrix is square, you can transpose it without extra space:
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        for(int i = 0; i < matrix.length; i++) {
            for(int j = i + 1; j < matrix[0].length; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
        for (int[] row : matrix) {
            for (int val : row) {
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }
    static void MxNMatrix() {
        /*
        ✅ 2. Transpose of a Rectangular Matrix (M × N) — Using New Matrix

For non-square matrices, you must create a new matrix:

         */

        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6}
        };

        int rows = matrix.length;
        int cols = matrix[0].length;

        int[][] transpose = new int[cols][rows];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                transpose[j][i] = matrix[i][j];
            }
        }

        for (int[] row : transpose) {
            for (int val : row) {
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }
}

/*

✅ 3. Transpose Using Java Streams (Fancy but less common)
int[][] transpose = IntStream.range(0, matrix[0].length)
    .mapToObj(i -> IntStream.range(0, matrix.length)
    .map(j -> matrix[j][i]).toArray())
    .toArray(int[][]::new);

 */
