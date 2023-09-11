package leetcode.algorithm;

/**
 * Author: Deean
 * Date: 2022-07-01 23:20
 * LastEditTime: 2022-07-01 23:20
 * Description: 1295. 统计位数为偶数的数字
 */

public class P1295 {
    // code beginning
    class Solution {
        public int findNumbers(int[] nums) {
            int count = 0;
            for (int num : nums) {
                if (String.valueOf(num).length() % 2 == 0) count++;
            }
            return count;
        }
    }

    public static void main(String[] args) {
        Solution s = new P1295().new Solution();
        Object ans = s.findNumbers(new int[]{555, 901, 482, 1771});
        System.out.println(ans);
    }
}