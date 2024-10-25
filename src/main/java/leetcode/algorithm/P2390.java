package leetcode.algorithm;

/**
 * Author: Deean
 * Date: 2023-09-09 21:16
 * FileName: src/leetcode/algorithm
 * Description:2390. 从字符串中移除星号
 */

public class P2390 {
    // code beginning
    class Solution {
        public String removeStars(String s) {
            StringBuilder ss = new StringBuilder();
            for (char c : s.toCharArray()) {
                if (ss.length() == 0) {
                    if (c != '*') {
                        ss.append(c);
                    }
                } else if (c == '*') {
                    ss.deleteCharAt(ss.length() - 1);
                } else {
                    ss.append(c);
                }
            }
            return ss.toString();
        }
    }

    public static void main(String[] args) {
        Solution s = new P2390().new Solution();
        var ans = s.removeStars("leet**cod*e");
        System.out.println(ans);
    }
}
