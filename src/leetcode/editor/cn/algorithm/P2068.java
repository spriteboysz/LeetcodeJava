package leetcode.editor.cn.algorithm;

/**
 * Author: Deean
 * Date: 2022-07-08 22:57
 * LastEditTime: 2022-07-08 22:57
 * Description: 2068. 检查两个字符串是否几乎相等
 */

public class P2068 {
    // code beginning
    class Solution {
        public boolean checkAlmostEquivalent(String word1, String word2) {
            int[] count1 = new int[26], count2 = new int[26];
            for (char c : word1.toCharArray()) count1[c - 'a']++;
            for (char c : word2.toCharArray()) count2[c - 'a']++;

            for (int i = 0; i < 26; i++) {
                if (Math.abs(count1[i] - count2[i]) > 3) {
                    return false;
                }
                ;
            }
            return true;
        }
    }

    public static void main(String[] args) {
        Solution s = new P2068().new Solution();
        Object ans = s.checkAlmostEquivalent("abcdeef", "abaaacc");
        System.out.println(ans);
        ans = s.checkAlmostEquivalent("cccddabba", "babababab");
        System.out.println(ans);
    }
}