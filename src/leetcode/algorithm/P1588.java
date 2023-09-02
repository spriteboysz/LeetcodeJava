package leetcode.algorithm;

/**
 * Author: Deean
 * Date: 2022-07-02 21:38
 * LastEditTime: 2022-07-02 21:38
 * Description: 1588. 所有奇数长度子数组的和
 */

public class P1588 {
    // code beginning
    class Solution {
        public int sumOddLengthSubarrays(int[] arr) {
            int sum = 0;
            for (int start = 0; start < arr.length; start += 1) {
                for (int len = 1; start + len <= arr.length; len += 2) {
                    for (int i = start; i < start + len; i++) {
                        sum += arr[i];
                    }
                }
            }
            return sum;
        }
    }

    public static void main(String[] args) {
        Solution s = new P1588().new Solution();
        Object ans = s.sumOddLengthSubarrays(new int[]{1, 4, 2, 5, 3});
        System.out.println(ans);
    }
}