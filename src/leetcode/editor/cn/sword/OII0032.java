package leetcode.editor.cn.sword;

/**
 * Author: Deean
 * Date: 2022-07-13 22:21
 * LastEditTime: 2022-07-13 22:21
 * Description: 剑指 Offer II 032. 有效的变位词
 */

public class OII0032 {
    // code beginning
    class Solution {
        public boolean isAnagram(String s, String t) {
            if (s.length() != t.length() || s.equals(t)) return false;
            int[] sCount = new int[26], tCount = new int[26];
            for (int i = 0; i < s.length(); i++) {
                sCount[s.charAt(i) - 'a']++;
                tCount[t.charAt(i) - 'a']++;
            }

            for (int i = 0; i < 26; i++) {
                if (sCount[i] != tCount[i]) return false;
            }
            return true;
        }
    }

    public static void main(String[] args) {
        Solution s = new OII0032().new Solution();
        Object ans = s.isAnagram("rat", "car");
        System.out.println(ans);
        ans = s.isAnagram("rat", "tra");
        System.out.println(ans);
    }
}