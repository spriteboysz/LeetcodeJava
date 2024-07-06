package leetcode.algorithm;

/**
 * Author: Deean
 * Date: 2024-06-29 21:51
 * FileName: src/main/java/leetcode/algorithm
 * Description: 3120. 统计特殊字母的数量 I
 */

public class P3120 {
    // code beginning
    class Solution {
        public int numberOfSpecialChars(String word) {
            int[] alphabet = new int[26];
            for (int i = 0; i < word.length(); i++) {
                if (word.charAt(i) >= 'a' && word.charAt(i) <= 'z') {
                    alphabet[word.charAt(i) - 'a'] |= 1;
                } else {
                    alphabet[word.charAt(i) - 'A'] |= 2;
                }
            }
            int cnt = 0;
            for (int num : alphabet) {
                if (num == 3) {
                    cnt++;
                }
            }
            return cnt;
        }
    }

    public static void main(String[] args) {
        Solution s = new P3120().new Solution();
        var ans = s.numberOfSpecialChars("aaAbcBC");
        System.out.println(ans);
    }
}
