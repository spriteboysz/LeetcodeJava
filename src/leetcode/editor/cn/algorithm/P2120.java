package leetcode.editor.cn.algorithm;

import java.util.Arrays;

/**
 * Author: Deean
 * Date: 2022-08-21 16:45
 * FileName: src/leetcode/editor/cn/algorithm
 * Description: 2120. 执行所有后缀指令
 */

public class P2120 {
    // code beginning
    class Solution {
        public int[] executeInstructions(int n, int[] startPos, String s) {
            int[] steps = new int[s.length()];
            int x = startPos[0], y = startPos[1];
            for (int i = 0; i < s.length(); i++) {
                steps[i] = process(n, x, y, s.substring(i));
            }
            return steps;
        }

        private int process(int n, int x, int y, String s) {
            int step = 0;
            for (char c : s.toCharArray()) {
                switch (c) {
                    case 'U' -> x--;
                    case 'D' -> x++;
                    case 'R' -> y++;
                    case 'L' -> y--;
                }
                if (x < 0 || x >= n || y < 0 || y >= n) return step;
                step++;
            }
            return step;
        }
    }

    public static void main(String[] args) {
        Solution s = new P2120().new Solution();
        int[] ans = s.executeInstructions(2, new int[]{1, 1}, "LURD");
        System.out.println(Arrays.toString(ans));
    }
}