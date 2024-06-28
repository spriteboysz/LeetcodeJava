package leetcode.algorithm;

/**
 * Author: Deean
 * Date: 2024-06-28 22:42
 * FileName: src/main/java/leetcode/algorithm
 * Description: 3136. 有效单词
 */

public class P3136 {
    // code beginning
    class Solution {
        public boolean isValid(String word) {
            if (word.length() < 3) {
                return false;
            }
            boolean flag1 = false, flag2 = false;
            for (int i = 0; i < word.length(); i++) {
                char c = word.charAt(i);
                if (Character.isLetter(c)) {
                    c = Character.toLowerCase(c);
                    if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                        flag1 = true;
                    } else {
                        flag2 = true;
                    }
                } else if (!Character.isDigit(c)) {
                    return false;
                }
            }
            return flag1 && flag2;
        }
    }

    public static void main(String[] args) {
        Solution s = new P3136().new Solution();
        var ans = s.isValid("234Adas");
        System.out.println(ans);
    }
}
