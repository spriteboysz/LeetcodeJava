package leetcode.algorithm;

/**
 * Author: Deean
 * Date: 2024-06-29 22:05
 * FileName: src/main/java/leetcode/algorithm
 * Description: 3079. 求出加密整数的和
 */

public class P3079 {
    // code beginning
    class Solution {
        private int process(int num) {
            String ss = String.valueOf(num);
            int max = -1, base = 0;
            for (int i = 0; i < ss.length(); i++) {
                max = Math.max(max, ss.charAt(i) - '0');
                base += (int) Math.pow(10, i);
            }
            return max * base;
        }

        public int sumOfEncryptedInt(int[] nums) {
            int sum = 0;
            for (int num : nums) {
                sum += process(num);
            }
            return sum;
        }
    }

    public static void main(String[] args) {
        Solution s = new P3079().new Solution();
        var ans = s.sumOfEncryptedInt(new int[]{10, 21, 31});
        System.out.println(ans);
    }
}
