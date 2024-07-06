package leetcode.algorithm;

/**
 * Author: Deean
 * Date: 2024-06-29 21:55
 * FileName: src/main/java/leetcode/algorithm
 * Description: 3114. 替换字符可以得到的最晚时间
 */

public class P3114 {
    // code beginning
    class Solution {
        public String findLatestTime(String s) {
            for (int i = 60 * 12 - 1; i >= 0; i--) {
                int hh = i / 60, mm = i % 60;
                String ss = String.format("%02d:%02d", hh, mm);
                boolean flag = true;
                for (int j = 0; j < 5; j++) {
                    if (ss.charAt(j) != s.charAt(j) && s.charAt(j) != '?') {
                        flag = false;
                        break;
                    }
                }
                if (flag) {
                    return ss;
                }
            }
            return "";
        }
    }

    public static void main(String[] args) {
        Solution s = new P3114().new Solution();
        var ans = s.findLatestTime("1?:?4");
        System.out.println(ans);
    }
}
