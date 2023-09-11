package leetcode.interview;

/**
 * Author: Deean
 * Date: 2022-07-03 23:47
 * LastEditTime: 2022-07-03 23:47
 * Description: 面试题 16.07. 最大数值
 */

public class M00160007 {
    // code beginning
    class Solution {
        public int maximum(int a, int b) {
            return Math.max(a, b);
        }
    }

    public static void main(String[] args) {
        Solution s = new M00160007().new Solution();
        Object ans = s.maximum(1, 2);
        System.out.println(ans);
    }
}