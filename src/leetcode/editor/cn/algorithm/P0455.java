package leetcode.editor.cn.algorithm;

import java.util.Arrays;

/**
 * Author: Deean
 * Date: 2022-08-19 22:13
 * FileName: src/leetcode/editor/cn/algorithm
 * Description: 455. 分发饼干
 */

public class P0455 {
    // code beginning
    class Solution {
        public int findContentChildren(int[] g, int[] s) {
            Arrays.sort(g);
            Arrays.sort(s);
            int count = 0;
            for (int i = 0, j = 0; i < g.length && j < s.length; i++, j++) {
                while (j < s.length && g[i] > s[j]) {
                    j++;
                }
                if (j < s.length) count++;
            }
            return count;
        }
    }

    public static void main(String[] args) {
        Solution s = new P0455().new Solution();
        Object ans = s.findContentChildren(new int[]{1, 2}, new int[]{1, 2, 3});
        System.out.println(ans);
    }
}