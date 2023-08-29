package sword;

import java.util.HashMap;
import java.util.Map;

/**
 * Author: Deean
 * Date: 2022-08-07 23:26
 * Description: 剑指 Offer II 034. 外星语言是否排序
 */

public class OII0034 {
    // code beginning
    class Solution {
        public boolean isAlienSorted(String[] words, String order) {
            Map<Character, Character> map = new HashMap<>();
            for (int i = 0; i < order.length(); i++) {
                char c = order.charAt(i);
                map.put(c, (char) (i + 'a'));
            }
            String temp = "0";
            for (String word : words) {
                StringBuilder builder = new StringBuilder();
                for (char c : word.toCharArray()) {
                    builder.append(map.get(c));
                }
                if (builder.toString().compareTo(temp) < 0) return false;
                temp = builder.toString();
            }
            return true;
        }
    }

    public static void main(String[] args) {
        Solution s = new OII0034().new Solution();
        Object ans = s.isAlienSorted(new String[]{"word", "world", "row"}, "worldabcefghijkmnpqstuvxyz");
        System.out.println(ans);
    }
}