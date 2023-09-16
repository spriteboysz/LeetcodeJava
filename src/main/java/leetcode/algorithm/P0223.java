package leetcode.algorithm;

/**
 * Author: Deean
 * Date: 2023-09-16 15:19
 * FileName: src/main/java/leetcode/algorithm
 * Description:223. 矩形面积
 */

public class P0223 {
    // code beginning
    class Solution {
        public int computeArea(int ax1, int ay1, int ax2, int ay2, int bx1, int by1, int bx2, int by2) {
            int area1 = (ax2 - ax1) * (ay2 - ay1), area2 = (bx2 - bx1) * (by2 - by1);
            int width = Math.min(ax2, bx2) - Math.max(ax1, bx1);
            int high = Math.min(ay2, by2) - Math.max(ay1, by1);
            int area3 = Math.max(width, 0) * Math.max(high, 0);
            return area1 + area2 - area3;
        }
    }

    public static void main(String[] args) {
        Solution s = new P0223().new Solution();
        var ans = s.computeArea(-3, 0, 3, 4, 0, -1, 9, 2);
        System.out.println(ans);
    }
}
