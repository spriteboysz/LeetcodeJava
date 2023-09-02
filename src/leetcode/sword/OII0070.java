package leetcode.sword;

/**
 * Author: Deean
 * Date: 2022-07-29 00:16
 * LastEditTime: 2022-07-29 00:16
 * Description: 剑指 Offer II 070. 排序数组中只出现一次的数字
 */

public class OII0070 {
    // code beginning
    class Solution {
        public int singleNonDuplicate(int[] nums) {
            int single = 0;
            for (int num : nums) {
                single ^= num;
            }
            return single;
        }
    }

    public static void main(String[] args) {
        Solution s = new OII0070().new Solution();
        Object ans = s.singleNonDuplicate(new int[]{3, 3, 7, 7, 10, 11, 11});
        System.out.println(ans);
    }
}