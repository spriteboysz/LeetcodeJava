package leetcode.algorithm;

/**
 * Author: Deean
 * Date: 2022-07-01 20:59
 * LastEditTime: 2022-07-01 20:59
 * Description: 1512. 好数对的数目
 */

public class P1512 {
    // code beginning
    class Solution {
        public int numIdenticalPairs(int[] nums) {
            int count = 0;
            for (int i = 0; i < nums.length - 1; i++) {
                for (int j = i + 1; j < nums.length; j++) {
                    if (nums[i] == nums[j]) count++;
                }
            }
            return count;
        }
    }

    public static void main(String[] args) {
        Solution s = new P1512().new Solution();
        Object ans = s.numIdenticalPairs(new int[]{1, 1, 1, 1});
        System.out.println(ans);
    }
}