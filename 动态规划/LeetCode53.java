import java.util.Arrays;

public class LeetCode53 {
    //给你一个整数数组 nums ，请你找出一个具有最大和的连续子数组（子数组最少包含一个元素），返回其最大和。
    //
    //子数组
    //是数组中的一个连续部分。
    public int maxSubArray(int[] nums) {
        int n = nums.length;

        int[] dp = new int[n];

        dp[0] = nums[0];

        for (int i = 1; i < n; i++) {
            dp[i] = Math.max(dp[i - 1] + nums[i], nums[i]);
        }

        Arrays.sort(dp);

        return dp[n - 1];

    }
}
