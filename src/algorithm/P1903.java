package algorithm;

/**
 * Author: Deean
 * Date: 2022-07-11 23:56
 * LastEditTime: 2022-07-11 23:56
 * Description: 1903. 字符串中的最大奇数
 */

public class P1903 {
    // code beginning
    class Solution {
        public String largestOddNumber(String num) {
            for (int i = num.length() - 1; i >= 0; i--) {
                int n = Integer.parseInt(String.valueOf(num.charAt(i)));
                if (n % 2 == 1) return num.substring(0, i + 1);
            }
            return "";
        }
    }

    public static void main(String[] args) {
        Solution s = new P1903().new Solution();
        Object ans = s.largestOddNumber("4206");
        System.out.println(ans);
        ans = s.largestOddNumber("35627");
        System.out.println(ans);
    }
}