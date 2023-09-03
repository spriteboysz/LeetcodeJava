package leetcode.algorithm;

/**
 * Author: Deean
 * Date: 2023-09-02 19:28
 * FileName: src/leetcode/algorithm
 * Description:2710. 移除字符串中的尾随零
 */

public class P2710 {
    // code beginning
    class Solution {
        public String removeTrailingZeros(String num) {
            for (int i = num.length() - 1; i >= 0; i--) {
                if (num.charAt(i) != '0') {
                    return num.substring(0, i + 1);
                }
            }
            return "0";
        }
    }

    public static void main(String[] args) {
        Solution s = new P2710().new Solution();
        Object ans = s.removeTrailingZeros("51230100");
        System.out.println(ans);
    }
}
