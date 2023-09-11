package leetcode.algorithm;

/**
 * Author: Deean
 * Date: 2023-02-26 13:33
 * FileName: src/leetcode/editor/cn/leetcode.algorithm
 * Description: 2490. 回环句
 */

public class P2490 {
    // code beginning
    class Solution {
        public boolean isCircularSentence(String sentence) {
            int n = sentence.length();
            for (int i = 0; i < n; i++) {
                if (sentence.charAt(i) == ' ' && sentence.charAt(i - 1) != sentence.charAt(i + 1)) {
                    return false;
                }
            }
            return sentence.charAt(0) == sentence.charAt(n - 1);
        }
    }

    public static void main(String[] args) {
        Solution s = new P2490().new Solution();
        Object ans = s.isCircularSentence("leetcode exercises sound delightful");
        System.out.println(ans);
    }
}
