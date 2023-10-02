package leetcode.LCP;

import java.util.HashMap;
import java.util.Map;

/**
 * Author: Deean
 * Date: 2023-09-30 22:09
 * FileName: src/main/java/leetcode/LCP
 * Description:LCR 169. 招式拆解 II
 */

public class LCR0169 {
    // code beginning
    class Solution {
        public char dismantlingAction(String arr) {
            Map<Character, Integer> hash = new HashMap<>();
            for (char c : arr.toCharArray()) {
                hash.put(c, hash.getOrDefault(c, 0) + 1);
            }
            for (char c : arr.toCharArray()) {
                if (hash.get(c) == 1) {
                    return c;
                }
            }
            return ' ';
        }
    }

    public static void main(String[] args) {
        Solution s = new LCR0169().new Solution();
        var ans = s.dismantlingAction("abbccdeff");
        System.out.println(ans);
    }
}
