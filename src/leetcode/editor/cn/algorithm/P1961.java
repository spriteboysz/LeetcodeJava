package leetcode.editor.cn.algorithm;

/**
 * Author: Deean
 * Date: 2022-08-13 21:10
 * FileName: src/leetcode/editor/cn/algorithm
 * Description: 1961. 检查字符串是否为数组前缀
 */

public class P1961 {
    // code beginning
    class Solution {
        public boolean isPrefixString(String s, String[] words) {
            StringBuilder builder = new StringBuilder();
            for (String word : words) {
                builder.append(word);
                if (builder.length() == s.length()) return s.equals(builder.toString());
                if (builder.length() > s.length()) break;
            }
            return false;
        }
    }

    public static void main(String[] args) {
        Solution s = new P1961().new Solution();
        Object ans = s.isPrefixString("iloveleetcode", new String[]{"i", "love", "leetcode", "apples"});
        System.out.println(ans);
        ans = s.isPrefixString("iloveleetcode", new String[]{"apples", "i", "love", "leetcode"});
        System.out.println(ans);
    }
}