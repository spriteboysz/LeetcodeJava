package leetcode.algorithm;

/**
 * Author: Deean
 * Date: 2022-08-13 22:29
 * FileName: src/leetcode/editor/cn/leetcode.algorithm
 * Description: 1592. 重新排列单词间的空格
 */

public class P1592 {
    // code beginning
    class Solution {
        public String reorderSpaces(String text) {
            String[] words = text.trim().split("\\s+");
            int count = text.length();
            for (String word : words) {
                count -= word.length();
            }
            if (count == 0) return text;
            if (words.length == 1) return words[0] + " ".repeat(count);
            int div = count / (words.length - 1), mod = count % (words.length - 1);
            return String.join(" ".repeat(div), words) + " ".repeat(mod);
        }
    }

    public static void main(String[] args) {
        Solution s = new P1592().new Solution();
        Object ans = s.reorderSpaces(" practice   makes   perfect");
        System.out.println(ans);
        ans = s.reorderSpaces("hello   world");
        System.out.println(ans);
        ans = s.reorderSpaces(" walks  udp package   into  bar a");
        System.out.println(ans);
        ans = s.reorderSpaces("a");
        System.out.println(ans);
    }
}