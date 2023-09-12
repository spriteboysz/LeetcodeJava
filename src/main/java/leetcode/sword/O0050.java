package leetcode.sword;

import java.util.HashMap;

/**
 * Author: Deean
 * Date: 2022-07-12 00:02
 * LastEditTime: 2022-07-12 00:02
 * Description: 剑指 Offer 50. 第一个只出现一次的字符
 */

public class O0050 {
    // code beginning
    class Solution {
        public char firstUniqChar(String s) {
            if (s.isEmpty()) return ' ';
            HashMap<Character, Integer> hashMap = new HashMap<>();
            for (char c : s.toCharArray()) {
                hashMap.put(c, hashMap.getOrDefault(c, 0) + 1);
            }
            for (char c : s.toCharArray()) {
                if (hashMap.get(c) == 1) return c;
            }
            return ' ';
        }
    }

    public static void main(String[] args) {
        Solution s = new O0050().new Solution();
        Object ans = s.firstUniqChar("abbaccddeff");
        System.out.println(ans);
        ans = s.firstUniqChar("");
        System.out.println(ans);
    }
}