package leetcode.algorithm;

import java.util.Arrays;

/**
 * Author: Deean
 * Date: 2023-09-16 15:23
 * FileName: src/main/java/leetcode/algorithm
 * Description:167. 两数之和 II - 输入有序数组
 */

public class P0167 {
    // code beginning
    class Solution {
        public int[] twoSum(int[] numbers, int target) {
            for (int i = 0, n = numbers.length; i < n; ++i) {
                int left = i + 1, right = n - 1;
                while (left <= right) {
                    int mid = left + ((right - left) >> 1);
                    if (numbers[mid] == target - numbers[i]) {
                        return new int[]{i + 1, mid + 1};
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
        Solution s = new P0167().new Solution();
        var ans = s.twoSum(new int[]{2, 7, 11, 15}, 9);
        System.out.println(Arrays.toString(ans));
    }
}
