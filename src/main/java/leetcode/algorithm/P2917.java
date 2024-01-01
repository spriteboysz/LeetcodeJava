package leetcode.algorithm;

/**
 * Author: Deean
 * Date: 2024-01-01 21:26
 * FileName: src/main/java/leetcode/algorithm
 * Description: 2917. 找出数组中的 K-or 值
 */

public class P2917 {
    // code beginning
    class Solution {
        public int findKOr(int[] nums, int k) {
            int val = 0;
            for (int i = 0; i < 31; i++) {
                int cnt = 0;
                for (int num : nums) {
                    cnt += (num >> i) & 1;
                }
                if (cnt >= k) {
                    val |= 1 << i;
                }
            }
            return val;
        }
    }

    public static void main(String[] args) {
        Solution s = new P2917().new Solution();
        var ans = s.findKOr(new int[]{7, 12, 9, 8, 9, 15}, 4);
        System.out.println(ans);
    }
}
