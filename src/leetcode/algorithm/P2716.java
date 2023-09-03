package leetcode.algorithm;

/**
 * Author: Deean
 * Date: 2023-09-02 19:24
 * FileName: src/leetcode/algorithm
 * Description:2716. 最小化字符串长度
 */

public class P2716 {
    // code beginning
    class Solution {
        public int minimizedStringLength(String s) {
            int[] alphabet = new int[26];
            for (char c : s.toCharArray()) {
                alphabet[c - 'a'] |= 1;
            }
            int cnt = 0;
            for (int i = 0; i < 26; i++) {
                cnt += alphabet[i];
            }
            return cnt;
        }
    }

    public static void main(String[] args) {
        Solution s = new P2716().new Solution();
        Object ans = s.minimizedStringLength("dddaaa");
        System.out.println(ans);
    }
}
