package algorithm;

/**
 * Author: Deean
 * Date: 2022-08-09 23:42
 * FileName: src/leetcode/editor/cn/algorithm
 * Description: 28. 实现 strStr()
 */

public class P0028 {
    // code beginning
    class Solution {
        public int strStr(String haystack, String needle) {
            int n = haystack.length(), m = needle.length();
            for (int i = 0; i + m <= n; i++) {
                boolean flag = true;
                for (int j = 0; j < m; j++) {
                    if (haystack.charAt(i + j) != needle.charAt(j)) {
                        flag = false;
                        break;
                    }
                }
                if (flag) return i;
            }
            return -1;
        }
    }

    public static void main(String[] args) {
        Solution s = new P0028().new Solution();
        Object ans = s.strStr("hello", "ll");
        System.out.println(ans);
        ans = s.strStr("hello", "llb");
        System.out.println(ans);
    }
}