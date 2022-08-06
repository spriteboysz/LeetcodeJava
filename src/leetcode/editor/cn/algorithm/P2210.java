package leetcode.editor.cn.algorithm;

import java.util.ArrayList;
import java.util.List;

/**
 * Author: Deean
 * Date: 2022-08-06 21:45
 * Description: 2210. 统计数组中峰和谷的数量
 */

public class P2210 {
    // code beginning
    class Solution {
        public int countHillValley(int[] nums) {
            List<Integer> list = new ArrayList<>();
            for (int num : nums) {
                if (list.isEmpty() || list.get(list.size() - 1) != num) {
                    list.add(num);
                }
            }
            int count = 0;
            for (int i = 1; i < list.size() - 1; i++) {
                int a = list.get(i - 1), b = list.get(i), c = list.get(i + 1);
                if (b > a && b > c) count++;
                if (b < a && b < c) count++;
            }
            return count;
        }
    }

    public static void main(String[] args) {
        Solution s = new P2210().new Solution();
        Object ans = s.countHillValley(new int[]{2, 4, 1, 1, 6, 5});
        System.out.println(ans);
    }
}