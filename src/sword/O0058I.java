package sword;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Author: Deean
 * Date: 2022-07-29 23:23
 * LastEditTime: 2022-07-29 23:23
 * Description: 剑指 Offer 58 - I. 翻转单词顺序
 */

public class O0058I {
    // code beginning
    class Solution {
        public String reverseWords(String s) {
            List<String> words = Arrays.asList(s.trim().split("\\s+"));
            Collections.reverse(words);
            return String.join(" ", words);
        }
    }

    public static void main(String[] args) {
        Solution s = new O0058I().new Solution();
        Object ans = s.reverseWords("  hello world!  ");
        System.out.println(ans);
        ans = s.reverseWords("a good   example");
        System.out.println(ans);
    }
}