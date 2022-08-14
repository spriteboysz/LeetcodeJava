package leetcode.editor.cn.algorithm;

/**
 * Author: Deean
 * Date: 2022-08-14 22:10
 * FileName: src/leetcode/editor/cn/algorithm
 * Description: 1668. 最大重复子字符串
 */

public class P1668 {
    // code beginning
    class Solution {
        public int maxRepeating(String sequence, String word) {
            for (int i = 0; i <= sequence.length() / word.length(); i++) {
                if (!sequence.contains(word.repeat(i + 1))) return i;
            }
            return -1;
        }
    }

    public static void main(String[] args) {
        Solution s = new P1668().new Solution();
        Object ans = s.maxRepeating("aaaaa", "a");
        System.out.println(ans);
    }
}