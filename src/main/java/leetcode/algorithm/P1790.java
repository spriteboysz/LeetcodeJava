package leetcode.algorithm;

import java.util.ArrayList;
import java.util.List;

/**
 * Author: Deean
 * Date: 2023-09-11 23:27
 * FileName: src/leetcode/common
 * Description:1790. 仅执行一次字符串交换能否使两个字符串相等
 */

public class P1790 {
    // code beginning
    class Solution {
        public boolean areAlmostEqual(String s1, String s2) {
            if (s1.length() != s2.length()) return false;
            if (s1.equals(s2)) return true;
            List<Character> diff = new ArrayList<>();
            for (int i = 0; i < s1.length(); i++) {
                if (s1.charAt(i) != s2.charAt(i)) {
                    diff.add(s1.charAt(i));
                    diff.add(s2.charAt(i));
                }
            }
            if (diff.size() != 4) return false;
            return diff.get(0) == diff.get(3) && diff.get(1) == diff.get(2);
        }
    }

    public static void main(String[] args) {
        Solution s = new P1790().new Solution();
        var ans = s.areAlmostEqual("bank", "kanb");
        System.out.println(ans);
    }
}
