public class LeetCode74 {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length;
        int n = matrix[0].length;
        int left = 0, right = m * n - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (matrix[mid / n][mid % n] > target) {
                right = mid - 1;
            } else if (matrix[mid / n][mid % n] < target) {
                left = mid + 1;
            } else {
                return true;
            }
        }
        return false;
    }
}
