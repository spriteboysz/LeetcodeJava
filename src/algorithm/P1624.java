package algorithm;

import java.util.HashMap;
import java.util.Map;

/**
 * Author: Deean
 * Date: 2022-08-13 22:06
 * FileName: src/leetcode/editor/cn/algorithm
 * Description: 1624. 两个相同字符之间的最长子字符串
 */

public class P1624 {
    // code beginning
    class Solution {
        public int maxLengthBetweenEqualCharacters(String s) {
            Map<Character, Integer> map = new HashMap<>();
            int max = -1;
            for (int i = 0; i < s.length(); i++) {
                char c = s.charAt(i);
                if (!map.containsKey(c)) {
                    map.put(c, i);
                } else {
                    max = Math.max(max, i - map.get(c) - 1);
                }
            }
            return max;
        }
    }

    public static void main(String[] args) {
        Solution s = new P1624().new Solution();
        Object ans = s.maxLengthBetweenEqualCharacters("abca");
        System.out.println(ans);
        ans = s.maxLengthBetweenEqualCharacters("cbzxy");
        System.out.println(ans);
    }
}