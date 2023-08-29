package algorithm;

import java.util.HashSet;

/**
 * Author: Deean
 * Date: 2022-07-01 22:51
 * LastEditTime: 2022-07-01 22:51
 * Description: 1684. 统计一致字符串的数目
 */

public class P1684 {
    // code beginning
    class Solution {
        public int countConsistentStrings(String allowed, String[] words) {
            HashSet<Character> set = new HashSet<>();
            for (int i = 0; i < allowed.length(); i++) {
                set.add(allowed.charAt(i));
            }
            int count = words.length;
            for (String word : words) {
                for (int i = 0; i < word.length(); i++) {
                    if (!set.contains(word.charAt(i))) {
                        count--;
                        break;
                    }
                }
            }
            return count;
        }
    }

    public static void main(String[] args) {
        Solution s = new P1684().new Solution();
        Object ans = s.countConsistentStrings("cad", new String[]{"cc", "acd", "b", "ba", "bac", "bad", "ac", "d"});
        System.out.println(ans);
    }
}