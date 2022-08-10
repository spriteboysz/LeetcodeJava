package leetcode.editor.cn.algorithm;

/**
 * Author: Deean
 * Date: 2022-08-10 23:39
 * FileName: src/leetcode/editor/cn/algorithm
 * Description: 482. 密钥格式化
 */

public class P0482 {
    // code beginning
    class Solution {
        public String licenseKeyFormatting(String s, int k) {
            StringBuilder builder = new StringBuilder();
            s = s.replace("-", "");
            for (int i = s.length() - 1, j = 0; i >= 0; i--) {
                char c = s.charAt(i);
                if (Character.isLetterOrDigit(c)) {
                    builder.append(Character.toUpperCase(c));
                    j++;
                }
                if (j == k && i != 0) {
                    builder.append("-");
                    j = 0;
                }
            }
            return builder.reverse().toString();
        }
    }

    public static void main(String[] args) {
        Solution s = new P0482().new Solution();
        Object ans = s.licenseKeyFormatting("2-5g-3-J", 2);
        System.out.println(ans);
        ans = s.licenseKeyFormatting("--a-a-a-a--", 2);
        System.out.println(ans);
    }
}