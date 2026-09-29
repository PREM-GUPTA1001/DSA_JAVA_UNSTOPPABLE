class Solution {
    public void rotate(int[][] matrix) {

        // Test Case:
        // 1 2 3
        // 4 5 6
        // 7 8 9

        int n = matrix.length;

        // pehle transpose karenge
        for(int i = 0; i < n; i++) {
            for(int j = i + 1; j < n; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }

        // ab har row ko reverse karenge
        for(int i = 0; i < n; i++) {
            int left = 0;
            int right = n - 1;

            while(left < right) {
                int temp = matrix[i][left];
                matrix[i][left] = matrix[i][right];
                matrix[i][right] = temp;

                left++;
                right--;
            }
        }

        // transpose:
        // 1 4 7
        // 2 5 8
        // 3 6 9

        // row reverse:
        // 7 4 1
        // 8 5 2
        // 9 6 3
    }
}