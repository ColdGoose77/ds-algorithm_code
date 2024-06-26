//给你一个字符串 s ，每一次操作你都可以在字符串的任意位置插入任意字符。
//
//请你返回让 s 成为回文串的 最少操作次数 。
//
//「回文串」是正读和反读都相同的字符串。
public class LeetCode1312 {

    public int minInsertions(String s) {
        int n = s.length();
        int[][] dp = new int[n][n];


        for (int i = n - 1; i >= 0; i--) {
            dp[i][i] = 0;
            for (int j = i + 1; j < n; j++) {
                if (s.charAt(i) == s.charAt(j)) {
                    if (i + 1 == j) {
                        dp[i][j] = 0;
                    } else if (i + 1 < j) {
                        dp[i][j] = dp[i + 1][j - 1];
                    }
                } else {

                    dp[i][j] = Math.min(dp[i][j - 1], dp[i + 1][j]) + 1;
                }
            }
        }

        return dp[0][n - 1];
    }
}
