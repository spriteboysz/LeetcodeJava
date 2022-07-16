package leetcode.editor.cn.sword;

import java.util.HashSet;
import java.util.Set;

/**
 * Author: Deean
 * Date: 2022-07-16 23:04
 * LastEditTime: 2022-07-16 23:04
 * Description: 剑指 Offer 61. 扑克牌中的顺子
 */

public class O0061 {
    // code beginning
    class Solution {
        public boolean isStraight(int[] nums) {
            Set<Integer> repeat = new HashSet<>();
            int max = 0, min = 14;
            for (int num : nums) {
                if (num == 0) continue;
                max = Math.max(max, num);
                min = Math.min(min, num);
                if (repeat.contains(num)) return false;
                repeat.add(num);
            }
            return max - min < 5;
        }
    }

    public static void main(String[] args) {
        Solution s = new O0061().new Solution();
        Object ans = s.isStraight(new int[]{0, 0, 1, 2, 5});
        System.out.println(ans);
    }
}