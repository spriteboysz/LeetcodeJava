package leetcode.editor.cn.algorithm;

/**
 * Author: Deean
 * Date: 2022-08-19 22:00
 * FileName: src/leetcode/editor/cn/algorithm
 * Description: 441. 排列硬币
 */

public class P0441 {
    // code beginning
    class Solution {
        public int arrangeCoins(int n) {
            int left = 1, right = n;
            while (left < right) {
                int mid = left + (right - left + 1) / 2;
                if ((long) mid * (mid + 1) <= (long) n * 2) {
                    left = mid;
                } else {
                    right = mid - 1;
                }
            }
            return left;
        }
    }

    public static void main(String[] args) {
        Solution s = new P0441().new Solution();
        Object ans = s.arrangeCoins(5);
        System.out.println(ans);
    }
}