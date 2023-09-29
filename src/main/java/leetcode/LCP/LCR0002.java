package leetcode.LCP;

/**
 * Author: Deean
 * Date: 2023-09-27 22:06
 * FileName: src/main/java/leetcode/LCP
 * Description:LCR 002. 二进制求和
 */

public class LCR0002 {
    // code beginning
    class Solution {
        public String addBinary(String a, String b) {
            StringBuilder ss = new StringBuilder();
            int carry = 0, pos1 = a.length() - 1, pos2 = b.length() - 1;
            while (pos1 >= 0 || pos2 >= 0 || carry > 0) {
                if (pos1 >= 0) {
                    carry += a.charAt(pos1) - '0';
                    pos1--;
                }
                if (pos2 >= 0) {
                    carry += b.charAt(pos2) - '0';
                    pos2--;
                }
                ss.append(carry % 2);
                carry /= 2;
            }
            return ss.reverse().toString();
        }
    }

    public static void main(String[] args) {
        Solution s = new LCR0002().new Solution();
        var ans = s.addBinary("1010", "1011");
        System.out.println(ans);
    }
}
