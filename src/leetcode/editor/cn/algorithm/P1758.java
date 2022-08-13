package leetcode.editor.cn.algorithm;

/**
 * Author: Deean
 * Date: 2022-08-13 21:22
 * FileName: src/leetcode/editor/cn/algorithm
 * Description: 1758. 生成交替二进制字符串的最少操作数
 */

public class P1758 {
    // code beginning
    class Solution {
        public int minOperations(String s) {
            int count1 = 0, count2 = 0;
            for (int i = 0; i < s.length(); i++) {
                char c = s.charAt(i);
                if (i % 2 == 0) {
                    if (c != '0') count1++;
                    if (c != '1') count2++;
                } else {
                    if (c != '0') count2++;
                    if (c != '1') count1++;
                }
            }
            return Math.min(count1, count2);
        }
    }

    public static void main(String[] args) {
        Solution s = new P1758().new Solution();
        Object ans = s.minOperations("1111");
        System.out.println(ans);
    }
}