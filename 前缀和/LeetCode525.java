import java.util.HashMap;
import java.util.Map;

public class LeetCode525 {
    public int findMaxLength(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();

        map.put(0, -1);

        int sum = 0;
        int ret = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i] == 0 ? -1 : 1;
            if (map.containsKey(sum)) {
                ret = Math.max(ret, i - map.get(sum));
            } else {
                map.put(sum, i);
            }
        }

        return ret;
    }
}
