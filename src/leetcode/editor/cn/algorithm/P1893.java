package leetcode.editor.cn.algorithm;

import java.util.HashSet;
import java.util.Set;

/**
 * Author: Deean
 * Date: 2022-08-06 19:44
 * Description: 1893. 检查是否区域内所有整数都被覆盖
 */

public class P1893 {
    // code beginning
    class Solution {
        public boolean isCovered(int[][] ranges, int left, int right) {
            Set<Integer> set = new HashSet<>();
            for (int i = left; i <= right; i++) {
                set.add(i);
            }
            for (int[] range : ranges) {
                for (int i = range[0]; i <= range[1]; i++) {
                    set.remove(i);
                    if (set.isEmpty()) return true;
                }
            }
            return false;
        }
    }

    public static void main(String[] args) {
        Solution s = new P1893().new Solution();
        Object ans = s.isCovered(new int[][]{{1, 10}, {10, 20}}, 21, 21);
        System.out.println(ans);
    }
}