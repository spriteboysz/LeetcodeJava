package leetcode.algorithm;

/**
 * Author: Deean
 * Date: 2022-08-17 22:47
 * FileName: src/leetcode/editor/cn/leetcode.algorithm
 * Description: 693. 交替位二进制数
 */

public class P0693 {
    // code beginning
    class Solution {
        public boolean hasAlternatingBits(int n) {
            String s = Integer.toBinaryString(n);
            return !s.contains("11") && !s.contains("00");
        }
    }

    public static void main(String[] args) {
        Solution s = new P0693().new Solution();
        Object ans = s.hasAlternatingBits(5);
        System.out.println(ans);
        ans = s.hasAlternatingBits(7);
        System.out.println(ans);
    }
}