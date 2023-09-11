package leetcode.algorithm;

/**
 * Author: Deean
 * Date: 2022-08-13 22:44
 * FileName: src/leetcode/editor/cn/leetcode.algorithm
 * Description: 1556. 千位分隔数
 */

public class P1556 {
    // code beginning
    class Solution {
        public String thousandSeparator(int n) {
            StringBuilder src = new StringBuilder(String.valueOf(n));
            StringBuilder dst = new StringBuilder();
            src.reverse();
            for (int i = 0; i < src.length(); i++) {
                dst.append(src.charAt(i));
                if (i != 0 && i != src.length() - 1 && i % 3 == 2) {
                    dst.append(".");
                }

            }
            return dst.reverse().toString();
        }
    }

    public static void main(String[] args) {
        Solution s = new P1556().new Solution();
        Object ans = s.thousandSeparator(123456789);
        System.out.println(ans);
        ans = s.thousandSeparator(1234);
        System.out.println(ans);
    }
}