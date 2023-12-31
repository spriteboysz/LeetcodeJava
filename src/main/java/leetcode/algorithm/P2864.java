package leetcode.algorithm;

/**
 * Author: Deean
 * Date: 2023-12-31 20:09
 * FileName: src/main/java/leetcode/algorithm
 * Description: 2864. 最大二进制奇数
 */

public class P2864 {
    // code beginning
    class Solution {
        public String maximumOddBinaryNumber(String s) {
            int cnt0 = 0, cnt1 = 0;
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == '0') {
                    cnt0++;
                } else {
                    cnt1++;
                }
            }
            return "1".repeat(cnt1 - 1) + "0".repeat(cnt0) + "1";
        }
    }

    public static void main(String[] args) {
        Solution s = new P2864().new Solution();
        var ans = s.maximumOddBinaryNumber("0101");
        System.out.println(ans);
    }
}
