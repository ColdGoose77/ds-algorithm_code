import java.util.HashSet;
import java.util.Set;

public class LeetCode202 {
    //编写一个算法来判断一个数 n 是不是快乐数。
    //
    //「快乐数」 定义为：
    //
    //对于一个正整数，每一次将该数替换为它每个位置上的数字的平方和。
    //然后重复这个过程直到这个数变为 1，也可能是 无限循环 但始终变不到 1。
    //如果这个过程 结果为 1，那么这个数就是快乐数。
    //如果 n 是 快乐数 就返回 true ；不是，则返回 false 。
    public boolean isHappy(int n) {
        Set<Integer> set = new HashSet<Integer>();
        while (n != 1 && !set.contains(n)) {
            set.add(n);
            n = support(n);
        }
        if (n != 1) {
            return false;
        }
        return true;
    }

    public int support(int num) {
        int sum = 0;
        int temp = 0;
        while (num != 0) {
            temp = num % 10;
            sum += temp * temp;
            num /= 10;
        }
        return sum;
    }
}
