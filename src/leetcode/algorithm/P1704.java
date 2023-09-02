package leetcode.algorithm;

/**
 * Author: Deean
 * Date: 2022-07-03 21:43
 * LastEditTime: 2022-07-03 21:43
 * Description: 1704. 判断字符串的两半是否相似
 */

public class P1704 {
    // code beginning
    class Solution {
        public boolean halvesAreAlike(String s) {
            String vowels = "aeiouAEIOU";
            int count1 = 0, count2 = 0;
            for (int i = 0; i < s.length() / 2; i++) {
                if (vowels.contains(String.valueOf(s.charAt(i)))) count1++;
            }
            for (int i = s.length() / 2; i < s.length(); i++) {
                if (vowels.contains(String.valueOf(s.charAt(i)))) count2++;
            }
            return count1 == count2;
        }
    }

    public static void main(String[] args) {
        Solution s = new P1704().new Solution();
        Object ans = s.halvesAreAlike("textbook");
        System.out.println(ans);
    }
}