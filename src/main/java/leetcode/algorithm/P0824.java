package leetcode.algorithm;

/**
 * Author: Deean
 * Date: 2022-07-10 21:42
 * LastEditTime: 2022-07-10 21:42
 * Description: 824. 山羊拉丁文
 */

public class P0824 {
    // code beginning
    class Solution {
        public String toGoatLatin(String sentence) {
            String vowel = "aeiouAEIOU";
            String[] words = sentence.split(" ");
            for (int i = 0; i < words.length; i++) {
                StringBuilder sb = new StringBuilder(words[i]);
                if (vowel.contains(String.valueOf(words[i].charAt(0)))) {
                    sb.append("ma");
                } else {
                    sb.append(words[i].charAt(0)).append("ma").deleteCharAt(0);
                }
                int n = i + 1;
                while (n > 0) {
                    sb.append("a");
                    n--;
                }
                words[i] = sb.toString();
            }
            return String.join(" ", words);
        }
    }

    public static void main(String[] args) {
        Solution s = new P0824().new Solution();
        Object ans = s.toGoatLatin("The quick brown fox jumped over the lazy dog");
        System.out.println(ans);
    }
}