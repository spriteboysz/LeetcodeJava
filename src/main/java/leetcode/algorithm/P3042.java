package leetcode.algorithm;

/**
 * Author: Deean
 * Date: 2024-07-06 14:20
 * FileName: src/main/java/leetcode/algorithm
 * Description: 3042. 统计前后缀下标对 I
 */

public class P3042 {
    // code beginning
    class Solution {
        public int countPrefixSuffixPairs(String[] words) {
            int cnt = 0;
            for (int i = 0; i < words.length; i++) {
                for (int j = i + 1; j < words.length; j++) {
                    if (words[j].startsWith(words[i]) && words[j].endsWith(words[i])) {
                        cnt += 1;
                    }
                }
            }
            return cnt;
        }
    }

    public static void main(String[] args) {
        Solution s = new P3042().new Solution();
        var ans = s.countPrefixSuffixPairs(new String[]{"a", "aba", "ababa", "aa"});
        System.out.println(ans);
    }
}
