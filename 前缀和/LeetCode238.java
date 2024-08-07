public class LeetCode238 {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] answer = new int[n];
        int[] f = new int[n];
        int[] g = new int[n];

        f[0] = g[n - 1] = 1;
        for (int i = 1; i < n; i++) {
            f[i] = f[i - 1] * nums[i - 1];
        }
        for (int i = n - 2; i >= 0; i--) {
            g[i] = g[i + 1] * nums[i + 1];
        }

        for (int i = 0; i < n; i++) {
            answer[i] = f[i] * g[i];
        }

        return answer;
    }
}
