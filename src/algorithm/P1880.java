package algorithm;

/**
 * Author: Deean
 * Date: 2022-07-03 21:50
 * LastEditTime: 2022-07-03 21:50
 * Description: .
 */

public class P1880 {
    // code beginning
    class Solution {
        public boolean isSumEqual(String firstWord, String secondWord, String targetWord) {
            return process(firstWord) + process(secondWord) == process(targetWord);
        }

        private int process(String word) {
            int num = 0;
            for (int i = 0; i < word.length(); i++) {
                num = num * 10 + word.charAt(i) - 'a';
            }
            return num;
        }
    }

    public static void main(String[] args) {
        Solution s = new P1880().new Solution();
        Object ans = s.isSumEqual("aaa", "a", "aab");
        System.out.println(ans);
        ans = s.isSumEqual("acb", "cba", "cdb");
        System.out.println(ans);
    }
}