package leetcode.algorithm;

/**
 * Author: Deean
 * Date: 2024-06-02 10:16
 * FileName: src/main/java/leetcode/algorithm
 * Description: 3162. 优质数对的总数 I
 */

public class P3162 {
    // code beginning
    class Solution {
        public int numberOfPairs(int[] nums1, int[] nums2, int k) {
            int cnt = 0;
            for (int num1 : nums1) {
                for (int num2 : nums2) {
                    if (num1 % (num2 * k) == 0) {
                        cnt++;
                    }
                }
            }
            return cnt;
        }
    }

    public static void main(String[] args) {
        Solution s = new P3162().new Solution();
        var ans = s.numberOfPairs(new int[]{1, 3, 4}, new int[]{1, 3, 4}, 1);
        System.out.println(ans);
    }
}
