package leetcode.algorithm;

/**
 * Author: Deean
 * Date: 2022-06-26 16:19
 * LastEditTime: 2022-06-26 16:19
 * Description: 7. 整数反转
 */

public class P0007 {
    // code beginning
    class Solution {
        public int reverse(int x) {
            StringBuilder sb = new StringBuilder(String.valueOf(x));
            sb.reverse();
            if (sb.toString().endsWith("-")) {
                sb.deleteCharAt(sb.length() - 1);
                sb.insert(0, '-');
            }
            long rev = Long.parseLong(sb.toString());
            return (rev < Integer.MIN_VALUE || rev > Integer.MAX_VALUE) ? 0 : (int) rev;
        }
    }

    public static void main(String[] args) {
        Solution s = new P0007().new Solution();
        int ans = s.reverse(-123);
        System.out.println(ans);
        ans = s.reverse(1534236469);
        System.out.println(ans);
    }
}