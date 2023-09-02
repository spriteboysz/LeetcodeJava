package leetcode.sword;

/**
 * Author: Deean
 * Date: 2022-07-29 22:42
 * LastEditTime: 2022-07-29 22:42
 * Description: 剑指 Offer 53 - I. 在排序数组中查找数字 I
 */

public class O0053I {
    // code beginning
    class Solution {
        public int search(int[] nums, int target) {
            int count = 0;
            for (int num : nums) {
                if (num == target) count++;
                if (num > target) break;
            }
            return count;
        }
    }

    public static void main(String[] args) {
        Solution s = new O0053I().new Solution();
        Object ans = s.search(new int[]{5, 7, 7, 8, 8, 10}, 7);
        System.out.println(ans);
    }
}