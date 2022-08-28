package leetcode.editor.cn.algorithm;

/**
 * Author: Deean
 * Date: 2022-08-28 16:03
 * FileName: src/leetcode/editor/cn/algorithm
 * Description: 2063. 所有子字符串中的元音
 */

public class P2063 {
    // code beginning
    class Solution {
        public long countVowels(String word) {
            long count = 0L;
            for (int i = 0; i < word.length(); i++) {
                if ("aeiou".contains("" + word.charAt(i))) {
                    count += (long) (i + 1) * (word.length() - i);
                }
            }
            return count;
        }
    }

    public static void main(String[] args) {
        Solution s = new P2063().new Solution();
        Object ans = s.countVowels("noosabasboosa");
        System.out.println(ans);
    }
}