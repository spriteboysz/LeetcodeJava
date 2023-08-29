package algorithm;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Author: Deean
 * Date: 2022-07-29 23:36
 * LastEditTime: 2022-07-29 23:36
 * Description: 151. 颠倒字符串中的单词
 */

public class P0151 {
    // code beginning
    class Solution {
        public String reverseWords(String s) {
            List<String> words = Arrays.asList(s.trim().split("\\s+"));
            Collections.reverse(words);
            return String.join(" ", words);
        }
    }

    public static void main(String[] args) {
        Solution s = new P0151().new Solution();
        Object ans = s.reverseWords("  hello world  ");
        System.out.println(ans);
    }
}