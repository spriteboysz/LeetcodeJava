package leetcode.editor.cn.LCP;

import java.util.Arrays;

/**
 * Author: Deean
 * Date: 2022-08-08 23:03
 * Description: LCS 02. 完成一半题目
 */

public class LCS0002 {
    // code beginning
    class Solution {
        public int halfQuestions(int[] questions) {
            int[] nums = new int[1001];
            for (int question : questions) nums[question]++;
            int sum = 0, count = 0;
            Arrays.sort(nums);
            for (int i = nums.length - 1; i >= 0; i--) {
                sum += nums[i];
                count++;
                if (sum >= questions.length / 2) break;
            }
            return count;
        }
    }

    public static void main(String[] args) {
        Solution s = new LCS0002().new Solution();
        Object ans = s.halfQuestions(new int[]{1, 5, 1, 3, 4, 5, 2, 5, 3, 3, 8, 6});
        System.out.println(ans);
    }
}