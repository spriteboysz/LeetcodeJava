package leetcode.LCP;

import java.util.HashMap;
import java.util.Map;

/**
 * Author: Deean
 * Date: 2023-09-27 22:33
 * FileName: src/main/java/leetcode/LCP
 * Description:LCR 005. 最大单词长度乘积
 */

public class LCR0005 {
    // code beginning
    class Solution {
        public int maxProduct(String[] words) {
            Map<String, Integer> hash = new HashMap<>();
            for (String word : words) {
                int value = 0;
                for (char c : word.toCharArray()) {
                    value |= 1 << (c - 'a');
                }
                hash.put(word, value);
            }
            int maximum = 0;
            for (int i = 0, n = words.length; i < n; i++) {
                for (int j = i + 1; j < n; j++) {
                    if ((hash.get(words[i]) & hash.get(words[j])) == 0) {
                        maximum = Math.max(maximum, words[i].length() * words[j].length());
                    }
                }
            }
            return maximum;
        }
    }

    public static void main(String[] args) {
        Solution s = new LCR0005().new Solution();
        var ans = s.maxProduct(new String[]{"a", "ab", "abc", "d", "cd", "bcd", "abcd"});
        System.out.println(ans);
    }
}
