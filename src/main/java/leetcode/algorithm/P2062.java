package leetcode.algorithm;

import java.util.HashSet;
import java.util.Set;

/**
 * Author: Deean
 * Date: 2022-08-06 15:55
 * Description: 2062. 统计字符串中的元音子字符串
 */

public class P2062 {
    // code beginning
    class Solution {
        public int countVowelSubstrings(String word) {
            int count = 0, n = word.length();
            if (n < 5) return 0;
            for (int i = 0; i < n; i++) {
                Set<Character> set = new HashSet<>();
                for (int j = i; j < n; j++) {
                    char c = word.charAt(j);
                    if ("aeiou".indexOf(c) < 0) break;
                    set.add(c);
                    if (set.size() == 5) count++;
                }
            }
            return count;
        }
    }

    public static void main(String[] args) {
        Solution s = new P2062().new Solution();
        Object ans = s.countVowelSubstrings("cuaieuouac");
        System.out.println(ans);
        ans = s.countVowelSubstrings("bbaeixoubb");
        System.out.println(ans);
    }
}