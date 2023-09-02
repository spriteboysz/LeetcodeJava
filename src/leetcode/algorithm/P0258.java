package leetcode.algorithm;

/**
 * Author: Deean
 * Date: 2022-07-08 00:04
 * LastEditTime: 2022-07-08 00:04
 * Description: 258. 各位相加
 */

public class P0258 {
    // code beginning
    class Solution {
        public int addDigits(int num) {
            while (num > 9) {
                int cur = 0;
                String str = String.valueOf(num);
                for (int i = 0; i < str.length(); i++) {
                    cur += str.charAt(i) - '0';
                }
                num = cur;
            }
            return num;
        }
    }

    public static void main(String[] args) {
        Solution s = new P0258().new Solution();
        Object ans = s.addDigits(38);
        System.out.println(ans);
        ans = s.addDigits(0);
        System.out.println(ans);
    }
}