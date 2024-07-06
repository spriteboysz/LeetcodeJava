package leetcode.algorithm;

import java.util.HashSet;

/**
 * Author: Deean
 * Date: 2024-07-06 13:52
 * FileName: src/main/java/leetcode/algorithm
 * Description:
 */

public class P3083 {
    // code beginning
    class Solution {
        public boolean isSubstringPresent(String s) {
            HashSet<String> set = new HashSet<>();
            for (int i = 1; i < s.length(); i++) {
                if (s.charAt(i) == s.charAt(i - 1)) {
                    return true;
                }
                StringBuilder ss = new StringBuilder();
                ss.append(s, i - 1, i + 1);
                if (set.contains(ss.toString())) {
                    return true;
                } else {
                    ss.reverse();
                    set.add(ss.toString());
                }
            }
            return false;
        }
    }

    public static void main(String[] args) {
        Solution s = new P3083().new Solution();
        var ans = s.isSubstringPresent("aefae");
        System.out.println(ans);
    }
}
