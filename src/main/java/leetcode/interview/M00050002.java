package leetcode.interview;

/**
 * Author: Deean
 * Date: 2023-08-29 17:13
 * FileName: src/leetcode.interview
 * Description:面试题 05.02. 二进制数转字符串
 */

public class M00050002 {
    // code beginning
    class Solution {
        public String printBin(double num) {
            StringBuilder ss = new StringBuilder("0.");
            while (ss.length() <= 32 && num > 0) {
                num *= 2;
                if (num >= 1) {
                    ss.append("1");
                    num -= 1;
                } else {
                    ss.append("0");
                }
            }
            return ss.length() == 33 ? "ERROR" : ss.toString();
        }
    }

    public static void main(String[] args) {
        Solution s = new M00050002().new Solution();
        Object ans = s.printBin(0.625);
        System.out.println(ans);
        System.out.println(s.printBin(0.1));
    }
}
