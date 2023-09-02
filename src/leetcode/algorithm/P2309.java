package leetcode.algorithm;

/**
 * Author: Deean
 * Date: 2022-07-27 23:18
 * LastEditTime: 2022-07-27 23:18
 * Description: 2309. 兼具大小写的最好英文字母
 */

public class P2309 {
    // code beginning
    class Solution {
        public String greatestLetter(String s) {
            int[] alphabet = new int[26];
            for (char c : s.toCharArray()) {
                if (Character.isLowerCase(c)) alphabet[c - 'a'] |= 1;
                if (Character.isUpperCase(c)) alphabet[c - 'A'] |= 2;
            }
            for (int i = 25; i >= 0; i--) {
                if (alphabet[i] == 3) return String.valueOf((char) (i + 'A'));
            }
            return "";
        }
    }

    public static void main(String[] args) {
        Solution s = new P2309().new Solution();
        Object ans = s.greatestLetter("arRAzFif");
        System.out.println(ans);
    }
}