package leetcode.LCP;

/**
 * Author: Deean
 * Date: 2023-10-01 20:08
 * FileName: src/main/java/leetcode/LCP
 * Description:LCR 190. 加密运算
 */

public class LCR0190 {
    // code beginning
    class Solution {
        public int encryptionCalculate(int dataA, int dataB) {
            while (dataB != 0) {
                int c = (dataA & dataB) << 1;
                dataA ^= dataB;
                dataB = c;
            }
            return dataA;
        }
    }

    public static void main(String[] args) {
        Solution s = new LCR0190().new Solution();
        var ans = s.encryptionCalculate(5, -1);
        System.out.println(ans);
    }
}
