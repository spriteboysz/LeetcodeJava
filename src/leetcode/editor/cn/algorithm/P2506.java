package leetcode.editor.cn.algorithm;

import java.util.Arrays;

/**
 * Author: Deean
 * Date: 2023-02-26 13:07
 * FileName: src/leetcode/editor/cn/algorithm
 * Description: 2506. 统计相似字符串对的数目
 */

public class P2506 {
    // code beginning
    class Solution {
        public int similarPairs(String[] words) {
            int[][] alphabet = new int[words.length][26];
            for (int i = 0; i < words.length; i++) {
                for (char c : words[i].toCharArray()) {
                    alphabet[i][c - 'a'] = 1;
                }
            }
            int cnt = 0;
            for (int i = 0; i < words.length; i++) {
                for (int j = i + 1; j < words.length; j++) {
                    if (Arrays.equals(alphabet[i], alphabet[j])) {
                        cnt++;
                    }
                }
            }
            return cnt;
        }
    }

    public static void main(String[] args) {
        Solution s = new P2506().new Solution();
        Object ans = s.similarPairs(new String[]{"aba", "aabb", "abcd", "bac", "aabc"});
        System.out.println(ans);
    }
}
