package leetcode.LCP;

import java.util.Arrays;

/**
 * Author: Deean
 * Date: 2023-10-01 19:49
 * FileName: src/main/java/leetcode/LCP
 * Description:LCR 179. 查找总价格为目标值的两个商品
 */

public class LCR0179 {
    // code beginning
    class Solution {
        public int[] twoSum(int[] price, int target) {
            int left = 0, right = price.length - 1;
            while (left < right) {
                int sum = price[left] + price[right];
                if (sum < target) {
                    left++;
                } else if (sum > target) {
                    right--;
                } else {
                    return new int[]{price[left], price[right]};
                }
            }
            return new int[]{};
        }
    }

    public static void main(String[] args) {
        Solution s = new LCR0179().new Solution();
        var ans = s.twoSum(new int[]{8, 21, 27, 34, 52, 66}, 61);
        System.out.println(Arrays.toString(ans));
    }
}
