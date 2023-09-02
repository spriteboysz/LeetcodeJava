package leetcode.sword;

/**
 * Author: Deean
 * Date: 2022-07-28 00:02
 * LastEditTime: 2022-07-28 00:02
 * Description: 剑指 Offer 11. 旋转数组的最小数字
 */

public class O0011 {
    // code beginning
    class Solution {
        public int minArray(int[] numbers) {
            int left = 0, right = numbers.length - 1;
            while (left < right) {
                int mid = left + (right - left) / 2;
                if (numbers[mid] < numbers[right]) {
                    right = mid;
                } else if (numbers[mid] > numbers[right]) {
                    left = mid + 1;
                } else {
                    right -= 1;
                }
            }
            return numbers[left];
        }
    }

    public static void main(String[] args) {
        Solution s = new O0011().new Solution();
        Object ans = s.minArray(new int[]{2, 2, 2, 0, 1});
        System.out.println(ans);
    }
}