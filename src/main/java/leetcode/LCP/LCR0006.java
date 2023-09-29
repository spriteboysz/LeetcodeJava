package leetcode.LCP;

import java.util.Arrays;

/**
 * Author: Deean
 * Date: 2023-09-27 22:45
 * FileName: src/main/java/leetcode/LCP
 * Description:LCR 006. 两数之和 II - 输入有序数组
 */

public class LCR0006 {
    // code beginning
    class Solution {
        public int[] twoSum(int[] numbers, int target) {
            for (int i = 0; i < numbers.length; ++i) {
                int left = i + 1, right = numbers.length - 1;
                while (left <= right) {
                    int mid = left + ((right - left) >> 1);
                    if (numbers[mid] == target - numbers[i]) {
                        return new int[]{i, mid};
                    } else if (numbers[mid] > target - numbers[i]) {
                        right = mid - 1;
                    } else {
                        left = mid + 1;
                    }
                }
            }
            return new int[]{-1, -1};
        }
    }

    public static void main(String[] args) {
        Solution s = new LCR0006().new Solution();
        var ans = s.twoSum(new int[]{1, 2, 4, 6, 10}, 8);
        System.out.println(Arrays.toString(ans));
    }
}
