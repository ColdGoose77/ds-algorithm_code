import java.util.ArrayList;
import java.util.List;

public class LeetCode1441 {
    //给你一个数组 target 和一个整数 n。每次迭代，需要从  list = { 1 , 2 , 3 ..., n } 中依次读取一个数字。
    //
    //请使用下述操作来构建目标数组 target ：
    //
    //"Push"：从 list 中读取一个新元素， 并将其推入数组中。
    //"Pop"：删除数组中的最后一个元素。
    //如果目标数组构建完成，就停止读取更多元素。
    //题目数据保证目标数组严格递增，并且只包含 1 到 n 之间的数字。
    //
    //请返回构建目标数组所用的操作序列。如果存在多个可行方案，返回任一即可。
    public List<String> buildArray(int[] target, int n) {
        List<String> list = new ArrayList<>();
        int temp = 1;
        int index = 0;

        while (index < target.length) {

            if (temp == target[index]) {
                list.add("Push");
                temp++;
                index++;
            } else {
                while (temp < target[index]) {
                    list.add("Push");
                    list.add("Pop");
                    temp++;
                }

            }


        }
        return list;
    }
}
