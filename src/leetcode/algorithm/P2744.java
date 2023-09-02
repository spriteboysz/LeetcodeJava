package leetcode.algorithm;

/**
 * Author: Deean
 * Date: 2023-08-29 16:09
 * FileName: src/leetcode.algorithm
 * Description:2744. 最大字符串配对数目
 */

public class P2744 {
    // code beginning
    class Solution {
        public int maximumNumberOfStringPairs(String[] words) {
            int cnt = 0;
            for (int i = 0, n = words.length; i < n; i++) {
                for (int j = i + 1; j < n; j++) {
                    if (words[i].charAt(0) == words[j].charAt(1) && words[i].charAt(1) == words[j].charAt(0)) {
                        cnt++;
                    }
                }
            }
            return cnt;
        }
    }

    public static void main(String[] args) {
        Solution s = new P2744().new Solution();
        Object ans = s.maximumNumberOfStringPairs(new String[]{"cd", "ac", "dc", "ca", "zz"});
        System.out.println(ans);
    }
}
