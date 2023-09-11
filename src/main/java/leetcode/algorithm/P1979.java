package leetcode.algorithm;

import java.util.Arrays;

/**
 * Author: Deean
 * Date: 2022-07-03 18:00
 * LastEditTime: 2022-07-03 18:00
 * Description: 1979. 找出数组的最大公约数
 */

public class P1979 {
    // code beginning
    class Solution {
        public int findGCD(int[] nums) {
            Arrays.sort(nums);
            int min = nums[0], max = nums[nums.length - 1], gcd = 1;
            for (int i = min; i >= 1; i--) {
                if (min % i == 0 && max % i == 0) {
                    gcd = i;
                    break;
                }
            }
            return gcd;
        }
    }

    public static void main(String[] args) {
        Solution s = new P1979().new Solution();
        Object ans = s.findGCD(new int[]{7, 5, 6, 8, 3});
        System.out.println(ans);
    }
}