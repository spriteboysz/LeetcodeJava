package interview;

/**
 * Author: Deean
 * Date: 2022-08-22 00:05
 * FileName: src/leetcode/editor/cn/interview
 * Description: 面试题 08.05. 递归乘法
 */

public class M00080005 {
    // code beginning
    class Solution {
        public int multiply(int a, int b) {
            if (a == 0 && b == 0) {
                return 0;
            } else if (a == 1) {
                return b;
            } else if (b == 1) {
                return a;
            }
            return multiply(a, b - 1) + a;
        }
    }

    public static void main(String[] args) {
        Solution s = new M00080005().new Solution();
        Object ans = s.multiply(3, 4);
        System.out.println(ans);
    }
}