package leetcode.sword;

import java.util.Arrays;

/**
 * Author: Deean
 * Date: 2022-07-26 23:10
 * LastEditTime: 2022-07-26 23:10
 * Description: 剑指 Offer II 014. 字符串中的变位词
 */

public class OII0014 {
    // code beginning
    class Solution {
        public boolean checkInclusion(String s1, String s2) {
            char[] chars1 = s1.toCharArray();
            Arrays.sort(chars1);
            String target = String.valueOf(chars1);
            for (int i = 0; i <= s2.length() - s1.length(); i++) {
                String cur = s2.substring(i, i + s1.length());
                char[] chars2 = cur.toCharArray();
                Arrays.sort(chars2);
                if (String.valueOf(chars2).equals(target)) return true;
            }
            return false;
        }
    }

    public static void main(String[] args) {
        Solution s = new OII0014().new Solution();
        Object ans = s.checkInclusion("ab", "eidboaoo");
        System.out.println(ans);
        ans = s.checkInclusion("ab", "eidbaoaoo");
        System.out.println(ans);
        ans = s.checkInclusion("ab", "ba");
        System.out.println(ans);
    }
}