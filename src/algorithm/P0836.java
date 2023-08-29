package algorithm;

/**
 * Author: Deean
 * Date: 2022-08-17 23:56
 * FileName: src/leetcode/editor/cn/algorithm
 * Description: 836. 矩形重叠
 */

public class P0836 {
    // code beginning
    class Solution {
        public boolean isRectangleOverlap(int[] rec1, int[] rec2) {
            boolean x = rec1[2] <= rec2[0] || rec2[2] <= rec1[0];
            boolean y = rec1[3] <= rec2[1] || rec2[3] <= rec1[1];
            return !x && !y;
        }
    }

    public static void main(String[] args) {
        Solution s = new P0836().new Solution();
        Object ans = s.isRectangleOverlap(new int[]{0, 0, 1, 1}, new int[]{2, 2, 3, 3});
        System.out.println(ans);
    }
}