package leetcode.algorithm;

/**
 * Author: Deean
 * Date: 2022-07-03 22:03
 * LastEditTime: 2022-07-03 22:03
 * Description: 2057. 值相等的最小索引
 */

public class P2057 {
    // code beginning
    class Solution {
        public int smallestEqual(int[] nums) {
            for (int i = 0; i < nums.length; i++) {
                if (i % 10 == nums[i]) return i;
            }
            return -1;
        }
    }

    public static void main(String[] args) {
        Solution s = new P2057().new Solution();
        Object ans = s.smallestEqual(new int[]{4, 3, 2, 1});
        System.out.println(ans);
        ans = s.smallestEqual(new int[]{7, 8, 3, 5, 2, 6, 3, 1, 1, 4, 5, 4, 8, 7, 2, 0, 9, 9, 0, 5, 7, 1, 6});
        System.out.println(ans);
    }
}