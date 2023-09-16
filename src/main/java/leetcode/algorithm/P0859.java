package leetcode.algorithm;

import java.util.ArrayList;
import java.util.List;

/**
 * Author: Deean
 * Date: 2023-09-15 22:58
 * FileName: src/main/java/leetcode/algorithm
 * Description:859. 亲密字符串
 */

public class P0859 {
    // code beginning
    class Solution {
        public boolean buddyStrings(String s, String goal) {
            if (s.length() != goal.length()) return false;
            if (s.equals(goal)) {
                int[] alphabet = new int[26];
                for (char c : s.toCharArray()) {
                    alphabet[c - 'a']++;
                }
                for (int i = 0; i < 26; i++) {
                    if (alphabet[i] >= 2) {
                        return true;
                    }
                }
                return false;
            }
            List<Character> diff = new ArrayList<>();
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) != goal.charAt(i)) {
                    diff.add(s.charAt(i));
                    diff.add(goal.charAt(i));
                }
                if (diff.size() > 4) {
                    return false;
                }
            }
            if (diff.size() != 4) return false;
            return diff.get(0) == diff.get(3) && diff.get(1) == diff.get(2);
        }
    }

    public static void main(String[] args) {
        Solution s = new P0859().new Solution();
        var ans = s.buddyStrings("ab", "ba");
        System.out.println(ans);
    }
}
