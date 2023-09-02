package leetcode.interview;

/**
 * Author: Deean
 * Date: 2022-08-12 21:16
 * FileName: src/leetcode/editor/cn/leetcode.interview
 * Description: 面试题 16.05. 阶乘尾数
 */

public class M00160005 {
    // code beginning
    class Solution {
        public int trailingZeroes(int n) {
            int count = 0;
            while (n >= 5) {
                n /= 5;
                count += n;
            }
            return count;
        }
    }

    public static void main(String[] args) {
        Solution s = new M00160005().new Solution();
        Object ans = s.trailingZeroes(5);
        System.out.println(ans);
    }
}