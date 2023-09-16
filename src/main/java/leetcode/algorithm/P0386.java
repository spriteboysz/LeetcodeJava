package leetcode.algorithm;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 * Author: Deean
 * Date: 2023-09-16 13:50
 * FileName: src/main/java/leetcode/algorithm
 * Description:386. 字典序排数
 */

public class P0386 {
    // code beginning
    class Solution {
        public List<Integer> lexicalOrder(int n) {
            List<Integer> list = new ArrayList<>();
            for (int i = 1; i <= n; i++) {
                list.add(i);
            }
            list.sort(Comparator.comparing(String::valueOf));
            return list;
        }
    }

    public static void main(String[] args) {
        Solution s = new P0386().new Solution();
        var ans = s.lexicalOrder(13);
        System.out.println(ans);
    }
}
