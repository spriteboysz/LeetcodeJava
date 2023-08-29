package algorithm;

import java.util.HashSet;
import java.util.Set;

/**
 * Author: Deean
 * Date: 2022-06-26 23:32
 * LastEditTime: 2022-06-26 23:32
 * Description: 804. 唯一摩尔斯密码词
 */

public class P0804 {
    // code beginning
    class Solution {
        public int uniqueMorseRepresentations(String[] words) {
            String[] morse = {".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", "-.-", ".-..", "--", "-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--.."};
            Set<String> set = new HashSet<>();
            for (String word : words) {
                StringBuilder sb = new StringBuilder();
                for (int j = 0; j < word.length(); j++) {
                    sb.append(morse[word.charAt(j) - 'a']);
                }
                set.add(sb.toString());
            }
            return set.size();
        }
    }

    public static void main(String[] args) {
        Solution s = new P0804().new Solution();
        Object ans = s.uniqueMorseRepresentations(new String[]{"gin", "zen", "gig", "msg"});
        System.out.println(ans);
    }
}