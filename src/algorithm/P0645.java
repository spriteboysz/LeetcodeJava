package algorithm;

import java.util.Arrays;

/**
 * Author: Deean
 * Date: 2022-08-17 22:02
 * FileName: src/leetcode/editor/cn/algorithm
 * Description: 645. 错误的集合
 */

public class P0645 {
    // code beginning
    class Solution {
        public int[] findErrorNums(int[] nums) {
            int repeat = 0, lost = 0;
            int[] count = new int[nums.length + 1];
            for (int num : nums) count[num]++;
            for (int i = 1; i <= nums.length; i++) {
                if (count[i] == 0) lost = i;
                if (count[i] == 2) repeat = i;
            }
            return new int[]{repeat, lost};
        }
    }

    public static void main(String[] args) {
        Solution s = new P0645().new Solution();
        int[] ans = s.findErrorNums(new int[]{1, 2, 2, 4});
        System.out.println(Arrays.toString(ans));
    }
}