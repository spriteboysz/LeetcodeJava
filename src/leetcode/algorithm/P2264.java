package leetcode.algorithm;

/**
 * Author: Deean
 * Date: 2022-07-12 00:11
 * LastEditTime: 2022-07-12 00:11
 * Description: 2264. 字符串中最大的 3 位相同数字
 */

public class P2264 {
    // code beginning
    class Solution {
        public String largestGoodInteger(String num) {
            int max = -1;
            for (int i = 0; i < num.length() - 2; i++) {
                char c = num.charAt(i);
                if (c == num.charAt(i + 1) && c == num.charAt(i + 2)) {
                    max = Math.max(max, Integer.parseInt(String.valueOf(c)));
                }
            }
            if (max == -1) return "";
            if (max == 0) return "000";
            return String.valueOf(max * 111);
        }
    }

    public static void main(String[] args) {
        Solution s = new P2264().new Solution();
        Object ans = s.largestGoodInteger("6777133339");
        System.out.println(ans);
        ans = s.largestGoodInteger("2300019");
        System.out.println(ans);
    }
}