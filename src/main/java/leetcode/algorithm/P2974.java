package leetcode.algorithm;

import java.util.Arrays;

/**
 * Author: Deean
 * Date: 2023-12-30 19:05
 * FileName: src/main/java/leetcode/algorithm
 * Description: 2974. 最小数字游戏
 */

public class P2974 {
    // code beginning
    class Solution {
        public int[] numberGame(int[] nums) {
            Arrays.sort(nums);
            for (int i = 0; i < nums.length; i += 2) {
                int temp = nums[i];
                nums[i] = nums[i + 1];
                nums[i + 1] = temp;
            }
            return nums;
        }
    }

    public static void main(String[] args) {
        Solution s = new P2974().new Solution();
        var ans = s.numberGame(new int[]{5, 4, 2, 3});
        System.out.println(Arrays.toString(ans));
    }
}
