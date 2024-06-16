package leetcode.algorithm;

/**
 * Author: Deean
 * Date: 2024-06-16 14:22
 * FileName: src/main/java/leetcode/algorithm
 * Description: 3174. 清除数字
 */

public class P3174 {
    // code beginning
    class Solution {
        public String clearDigits(String s) {
            StringBuilder ss = new StringBuilder();
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) >= '0' && s.charAt(i) <= '9' && !ss.isEmpty()) {
                    ss.deleteCharAt(ss.length() - 1);
                } else {
                    ss.append(s.charAt(i));
                }
            }
            return ss.toString();
        }
    }

    public static void main(String[] args) {
        Solution s = new P3174().new Solution();
        var ans = s.clearDigits("cb34");
        System.out.println(ans);
    }
}
