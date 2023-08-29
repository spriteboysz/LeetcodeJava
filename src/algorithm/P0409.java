package algorithm;

import java.util.HashMap;
import java.util.Map;

/**
 * Author: Deean
 * Date: 2022-08-09 23:02
 * FileName: src/leetcode/editor/cn/algorithm
 * Description: 409. 最长回文串
 */

public class P0409 {
    // code beginning
    class Solution {
        public int longestPalindrome(String s) {
            Map<Character, Integer> map = new HashMap<>();
            for (char c : s.toCharArray()) {
                map.put(c, map.getOrDefault(c, 0) + 1);
            }
            boolean hasOdd = false;
            int count = 0;
            for (int value : map.values()) {
                count += value;
                if (value % 2 == 1) {
                    hasOdd = true;
                    count--;
                }
            }
            return hasOdd ? count + 1 : count;
        }
    }

    public static void main(String[] args) {
        Solution s = new P0409().new Solution();
        Object ans = s.longestPalindrome("dccaccd");
        System.out.println(ans);
    }
}