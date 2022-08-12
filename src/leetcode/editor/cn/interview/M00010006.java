package leetcode.editor.cn.interview;

/**
 * Author: Deean
 * Date: 2022-08-12 21:18
 * FileName: src/leetcode/editor/cn/interview
 * Description: 面试题 01.06. 字符串压缩
 */

public class M00010006 {
    // code beginning
    class Solution {
        public String compressString(String s) {
            if (s.length() == 0) return s;
            StringBuilder builder = new StringBuilder();
            builder.append(s.charAt(0));
            for (int i = 1, count = 1; i < s.length(); i++) {
                if (s.charAt(i) == s.charAt(i - 1)) {
                    count++;
                } else {
                    builder.append(count);
                    builder.append(s.charAt(i));
                    count = 1;
                }
                if (i == s.length() - 1) builder.append(count);
            }
            String compress = builder.toString();
            return compress.length() < s.length() ? compress : s;
        }
    }

    public static void main(String[] args) {
        Solution s = new M00010006().new Solution();
        Object ans = s.compressString("aabcccccaaa");
        System.out.println(ans);
        ans = s.compressString("abbccd");
        System.out.println(ans);
    }
}