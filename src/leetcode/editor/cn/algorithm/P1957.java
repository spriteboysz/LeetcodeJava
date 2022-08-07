package leetcode.editor.cn.algorithm;

/**
 * Author: Deean
 * Date: 2022-08-07 14:36
 * Description: 1957. 删除字符使字符串变好
 */

public class P1957 {
    // code beginning
    class Solution {
        public String makeFancyString(String s) {
            StringBuilder builder = new StringBuilder();
            for (char c : s.toCharArray()) {
                int n = builder.length();
                if (n >= 2 && builder.charAt(n - 1) == builder.charAt(n - 2) && builder.charAt(n - 1) == c) {
                    continue;
                }
                builder.append(c);
            }
            return builder.toString();
        }
    }

    public static void main(String[] args) {
        Solution s = new P1957().new Solution();
        Object ans = s.makeFancyString("aaabaaaa");
        System.out.println(ans);
    }
}