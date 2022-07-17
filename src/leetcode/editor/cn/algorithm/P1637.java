package leetcode.editor.cn.algorithm;

import java.util.TreeSet;

/**
 * Author: Deean
 * Date: 2022-07-17 16:16
 * LastEditTime: 2022-07-17 16:16
 * Description: 1637. 两点之间不包含任何点的最宽垂直面积
 */

public class P1637 {
    // code beginning
    class Solution {
        public int maxWidthOfVerticalArea(int[][] points) {
            TreeSet<Integer> treeSet = new TreeSet<>();
            for (int[] point : points) {
                treeSet.add(point[0]);
            }
            // System.out.println(treeSet);
            int maxWidth = 0;
            Integer prev = null;
            for (Integer v : treeSet) {
                if (prev != null) maxWidth = Math.max(maxWidth, v - prev);
                prev = v;
            }
            return maxWidth;
        }
    }

    public static void main(String[] args) {
        Solution s = new P1637().new Solution();
        Object ans = s.maxWidthOfVerticalArea(new int[][]{{3, 1}, {9, 0}, {1, 0}, {1, 4}, {5, 3}, {8, 8}});
        System.out.println(ans);
    }
}