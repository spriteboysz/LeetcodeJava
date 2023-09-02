package leetcode.algorithm;

/**
 * Author: @Deean
 * Date: 2022-06-24 23:54
 * LastEditTime: 2022-06-24 23:54
 * Description: .
 */

public class P0744 {
    // code beginning
    class Solution {
        public char nextGreatestLetter(char[] letters, char target) {
            for (char c : letters) {
                if (c > target) {
                    return c;
                }
            }
            return letters[0];
        }
    }

    public static void main(String[] args) {
        Solution s = new P0744().new Solution();
        Object ans = s.nextGreatestLetter(new char[]{'c', 'f', 'j'}, 'c');
        System.out.println(ans);
    }
}