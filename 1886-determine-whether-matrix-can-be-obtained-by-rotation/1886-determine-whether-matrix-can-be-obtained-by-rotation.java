class Solution {
    public boolean findRotation(int[][] mat, int[][] target) {

        // Test Case:
        // mat = [[1,2],
        //        [3,4]]
        // target = [[3,1],
        //           [4,2]]

        int n = mat.length;

        // 4 baar check karenge kyunki 90 degree rotate karke
        // target same mil sakta hai
        for(int k = 0; k < 4; k++) {

            boolean same = true;

            // current matrix ko target se compare karenge
            for(int i = 0; i < n; i++) {
                for(int j = 0; j < n; j++) {
                    if(mat[i][j] != target[i][j]) {
                        same = false;
                        break;
                    }
                }
                if(!same) break;
            }

            // same matrix mil gaya
            if(same) return true;

            // 90 degree clockwise rotate
            for(int i = 0; i < n; i++) {
                for(int j = i + 1; j < n; j++) {
                    int temp = mat[i][j];
                    mat[i][j] = mat[j][i];
                    mat[j][i] = temp;
                }
            }

            for(int i = 0; i < n; i++) {
                int left = 0;
                int right = n - 1;

                while(left < right) {
                    int temp = mat[i][left];
                    mat[i][left] = mat[i][right];
                    mat[i][right] = temp;

                    left++;
                    right--;
                }
            }

            // first rotation:
            // [1,2]       [3,1]
            // [3,4]  ->   [4,2]
            // target mil gaya
        }

        return false;
    }
}