package leetcode.algorithm;

import java.util.Arrays;

/**
 * Author: Deean
 * Date: 2022-08-21 22:52
 * FileName: src/leetcode/editor/cn/leetcode.algorithm
 * Description: 1769. 移动所有球到每个盒子所需的最小操作数
 */

public class P1769 {
    // code beginning
    class Solution {
        public int[] minOperations(String boxes) {
            int[] steps = new int[boxes.length()];
            for (int i = 0; i < boxes.length(); i++) {
                for (int j = 0; j < boxes.length(); j++) {
                    if (j == i) continue;
                    if (boxes.charAt(j) == '1') {
                        steps[i] += Math.abs(j - i);
                    }
                }
            }
            return steps;
        }
    }

    public static void main(String[] args) {
        Solution s = new P1769().new Solution();
        int[] ans = s.minOperations("001011");
        System.out.println(Arrays.toString(ans));
    }
}