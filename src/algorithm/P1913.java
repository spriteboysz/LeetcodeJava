package algorithm;

/**
 * Author: Deean
 * Date: 2022-07-01 22:27
 * LastEditTime: 2022-07-01 22:27
 * Description: 1913. 两个数对之间的最大乘积差
 */

public class P1913 {
    // code beginning
    class Solution {
        public int maxProductDifference(int[] nums) {
            int min1 = Integer.MAX_VALUE, min2 = Integer.MAX_VALUE;
            int max1 = Integer.MIN_VALUE, max2 = Integer.MIN_VALUE;
            for (int num : nums) {
                if (num > max2) {
                    if (num > max1) {
                        max2 = max1;
                        max1 = num;
                    } else {
                        max2 = num;
                    }
                }
                if (num < min2) {
                    if (num < min1) {
                        min2 = min1;
                        min1 = num;
                    } else {
                        min2 = num;
                    }
                }
            }
            return max2 * max1 - min2 * min1;
        }
    }

    public static void main(String[] args) {
        Solution s = new P1913().new Solution();
        Object ans = s.maxProductDifference(new int[]{4, 2, 5, 9, 7, 4, 8});
        System.out.println(ans);
    }
}