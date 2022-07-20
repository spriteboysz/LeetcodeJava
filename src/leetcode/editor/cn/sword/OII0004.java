package leetcode.editor.cn.sword;

import java.util.HashMap;

/**
 * Author: Deean
 * Date: 2022-07-20 22:17
 * LastEditTime: 2022-07-20 22:17
 * Description: 剑指 Offer II 004. 只出现一次的数字
 */

public class OII0004 {
    // code beginning
    class Solution {
        public int singleNumber(int[] nums) {
            HashMap<Integer, Integer> count = new HashMap<>();
            for (int num : nums) {
                count.put(num, count.getOrDefault(num, 0) + 1);
            }

            for (int num : count.keySet()) {
                if (count.get(num) == 1) {
                    return num;
                }
            }
            return -1;
        }
    }

    public static void main(String[] args) {
        Solution s = new OII0004().new Solution();
        Object ans = s.singleNumber(new int[]{0, 1, 0, 1, 0, 1, 100});
        System.out.println(ans);
    }
}