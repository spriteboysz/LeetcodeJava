package leetcode.algorithm;

/**
 * Author: Deean
 * Date: 2023-09-02 19:54
 * FileName: src/leetcode/algorithm
 * Description:2696. 删除子串后的字符串最小长度
 */

public class P2696 {
    // code beginning
    class Solution {
        public int minLength(String s) {
            StringBuilder ss = new StringBuilder();
            for (char c : s.toCharArray()) {
                int last = ss.length() - 1;
                if (ss.length() == 0) {
                    ss.append(c);
                } else if (ss.charAt(last) == 'A' && c == 'B') {
                    ss.deleteCharAt(last);
                } else if (ss.charAt(last) == 'C' && c == 'D') {
                    ss.deleteCharAt(last);
                } else {
                    ss.append(c);
                }
            }
            return ss.length();
        }
    }

    public static void main(String[] args) {
        Solution s = new P2696().new Solution();
        Object ans = s.minLength("ABFCACDB");
        System.out.println(ans);
    }
}
