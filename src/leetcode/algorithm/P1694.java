package leetcode.algorithm;

/**
 * Author: Deean
 * Date: 2022-08-06 09:44
 * Description: 1694. 重新格式化电话号码
 */

public class P1694 {
    // code beginning
    class Solution {
        public String reformatNumber(String number) {
            number = number.replace(" ", "").replace("-", "");
            StringBuilder builder = new StringBuilder();
            int n = number.length();
            for (int i = 0; i < n; i++) {
                builder.append(number.charAt(i));
                if (i % 3 == 2 && i < n - 2) {
                    builder.append("-");
                } else if (n % 3 == 1 && i == n - 3) {
                    builder.append("-");
                }
            }
            return builder.toString();
        }
    }

    public static void main(String[] args) {
        Solution s = new P1694().new Solution();
        Object ans = s.reformatNumber("123 4-567");
        System.out.println(ans);
        ans = s.reformatNumber("123 4-5678");
        System.out.println(ans);
    }
}