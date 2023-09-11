package leetcode.algorithm;

/**
 * Author: Deean
 * Date: 2023-09-10 09:47
 * FileName: src/leetcode/algorithm
 * Description:2109. 向字符串添加空格
 */

public class P2109 {
    // code beginning
    class Solution {
        public String addSpaces(String s, int[] spaces) {
            StringBuilder ss = new StringBuilder();
            for (int i = 0, pos = 0; i < s.length(); i++) {
                if (pos < spaces.length && i == spaces[pos]) {
                    ss.append(" ");
                    pos++;
                }
                ss.append(s.charAt(i));
            }
            return ss.toString();
        }
    }

    public static void main(String[] args) {
        Solution s = new P2109().new Solution();
        var ans = s.addSpaces("LeetcodeHelpsMeLearn", new int[]{8, 13, 15});
        System.out.println(ans);
    }
}
