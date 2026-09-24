class Solution {
    public int longestCommonSubsequence(String text1, String text2) {

        // text1 = "abcde"
        // text2 = "ace"

        int n = text1.length();
        int m = text2.length();

        // dp[i][j] = text1 ke first i characters
        // aur text2 ke first j characters ka LCS
        int[][] dp = new int[n + 1][m + 1];

        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= m; j++) {

                // Agar current characters same hain
                // to dono ko LCS me include karenge
                if (text1.charAt(i - 1) == text2.charAt(j - 1)) {

                    dp[i][j] = dp[i - 1][j - 1] + 1;

                    // i = 1, j = 1
                    // a == a
                    // dp[1][1] = dp[0][0] + 1
                    // dp[1][1] = 1

                    // i = 3, j = 2
                    // c == c
                    // dp[3][2] = dp[2][1] + 1
                    // dp[3][2] = 2

                    // i = 5, j = 3
                    // e == e
                    // dp[5][3] = dp[4][2] + 1
                    // dp[5][3] = 3
                }

                else {

                    // Agar characters different hain
                    // to current text1 character ko skip
                    // ya current text2 character ko skip
                    // dono me se maximum lenge
                    dp[i][j] = Math.max(
                        dp[i - 1][j],
                        dp[i][j - 1]
                    );

                    // Example:
                    // b != a
                    // upar aur left me jo maximum hai
                    // wahi current answer hoga
                }
            }
        }

        // Last cell me dono strings ka
        // complete LCS answer hoga
        return dp[n][m];

        // text1 = abcde
        // text2 = ace
        //
        // LCS = "ace"
        // answer = 3
    }
}