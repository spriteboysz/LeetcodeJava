package algorithm;

/**
 * Author: Deean
 * Date: 2022-08-17 22:27
 * FileName: src/leetcode/editor/cn/algorithm
 * Description: 504. 七进制数
 */

public class P0504 {
    // code beginning
    class Solution {
        public String convertToBase7(int num) {
            if (num == 0) return "0";
            StringBuilder builder = new StringBuilder();
            boolean flag = true;
            if (num < 0) {
                flag = false;
                num = -num;
            }

            while (num > 0) {
                builder.append(num % 7);
                num /= 7;
            }
            if (!flag) builder.append("-");
            return builder.reverse().toString();
        }
    }

    public static void main(String[] args) {
        Solution s = new P0504().new Solution();
        Object ans = s.convertToBase7(100);
        System.out.println(ans);
        ans = s.convertToBase7(-7);
        System.out.println(ans);
        ans = s.convertToBase7(0);
        System.out.println(ans);
    }
}