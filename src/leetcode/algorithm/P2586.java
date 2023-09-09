package leetcode.algorithm;

/**
 * Author: Deean
 * Date: 2023-09-07 23:17
 * FileName: src/leetcode/algorithm
 * Description:2586. 统计范围内的元音字符串数
 */

public class P2586 {
    // code beginning
    class Solution {
        public int vowelStrings(String[] words, int left, int right) {
            int cnt = 0;
            String vowel = "aeiou";
            for (int i = left; i <= right && i < words.length; i++) {
                if (vowel.contains(String.valueOf(words[i].charAt(0)))
                        && vowel.contains(String.valueOf(words[i].charAt(words[i].length() - 1)))) {
                    cnt++;
                }
            }
            return cnt;
        }
    }

    public static void main(String[] args) {
        Solution s = new P2586().new Solution();
        Object ans = s.vowelStrings(new String[]{"are", "amy", "u"}, 0, 2);
        System.out.println(ans);
    }
}
