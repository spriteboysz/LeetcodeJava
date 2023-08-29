package algorithm;

import java.util.HashMap;

/**
 * Author: Deean
 * Date: 2022-06-27 23:44
 * LastEditTime: 2022-06-27 23:44
 * Description: .
 */

public class P0205 {
    // code beginning
    class Solution {
        public boolean isIsomorphic(String s, String t) {
            HashMap<Character, Character> hashMap1 = new HashMap<>(), hashMap2 = new HashMap<>();
            for (int i = 0; i < s.length(); i++) {
                char cs = s.charAt(i), ct = t.charAt(i);
                if (!hashMap1.containsKey(cs)) {
                    hashMap1.put(cs, ct);
                }
                if (!hashMap2.containsKey(ct)) {
                    hashMap2.put(ct, cs);
                }
                if (hashMap1.get(cs) != ct || hashMap2.get(ct) != cs) {
                    return false;
                }
            }
            return true;
        }
    }

    public static void main(String[] args) {
        Solution s = new P0205().new Solution();
        Object ans = s.isIsomorphic("paper", "title");
        System.out.println(ans);
    }
}