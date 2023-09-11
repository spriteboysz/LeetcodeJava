package leetcode.algorithm;

/**
 * Author: Deean
 * Date: 2022-08-06 19:52
 * Description: *
 */

public class P1009 {
    // code beginning
    class Solution {
        public int bitwiseComplement(int n) {
            char[] bin = Integer.toBinaryString(n).toCharArray();
            int num = 0;
            for (int i = 0; i < bin.length; i++) {
                if (bin[i] == '0') {
                    bin[i] = '1';
                } else {
                    bin[i] = '0';
                }
                num = num * 2 + (bin[i] - '0');
            }
            return num;
        }
    }

    public static void main(String[] args) {
        Solution s = new P1009().new Solution();
        Object ans = s.bitwiseComplement(7);
        System.out.println(ans);
        ans = s.bitwiseComplement(10);
        System.out.println(ans);
    }
}