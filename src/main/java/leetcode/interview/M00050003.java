package leetcode.interview;

/**
 * Author: Deean
 * Date: 2022-08-18 23:20
 * FileName: src/leetcode/editor/cn/leetcode.interview
 * Description: 面试题 05.03. 翻转数位
 */

public class M00050003 {
    // code beginning
    class Solution {
        public int reverseBits(int num) {
            String s = Integer.toBinaryString(num);
            int cur = 0, ps = 0, max = 1;
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == '1') {
                    cur++;
                } else {
                    ps = cur;
                    cur = 0;
                }
                max = Math.max(max, ps + cur + 1);
            }
            return Math.min(max, 32);
        }
    }

    public static void main(String[] args) {
        Solution s = new M00050003().new Solution();
        Object ans = s.reverseBits(1775);
        System.out.println(ans);
        ans = s.reverseBits(4);
        System.out.println(ans);
    }
}