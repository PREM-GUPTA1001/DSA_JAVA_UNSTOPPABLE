import java.util.*;

class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {

        // Dry run dude-->Test Case:
        // matrix = [[1,2,3],
        //           [4,5,6],
        //           [7,8,9]]
        // Output = [1,2,3,6,9,8,7,4,5]

        List<Integer> ans = new ArrayList<>();

        // 4 boundaries maintain karenge
        int top = 0;
        int bottom = matrix.length - 1;
        int left = 0;
        int right = matrix[0].length - 1;

        while(top <= bottom && left <= right) {

            // top row: left -> right
            for(int i = left; i <= right; i++) {
                ans.add(matrix[top][i]);
            }
            top++;

            // right column: top -> bottom
            for(int i = top; i <= bottom; i++) {
                ans.add(matrix[i][right]);
            }
            right--;

            // bottom row: right -> left
            if(top <= bottom) {
                for(int i = right; i >= left; i--) {
                    ans.add(matrix[bottom][i]);
                }
                bottom--;
            }

            // left column: bottom -> top
            if(left <= right) {
                for(int i = bottom; i >= top; i--) {
                    ans.add(matrix[i][left]);
                }
                left++;
            }
        }

        return ans;
    }
}