package leetcode.algorithm;

/**
 * Author: Deean
 * Date: 2022-08-10 23:06
 * FileName: src/leetcode/editor/cn/leetcode.algorithm
 * Description: 168. Excel表列名称
 */

public class P0168 {
    // code beginning
    class Solution {
        public String convertToTitle(int columnNumber) {
            StringBuilder builder = new StringBuilder();
            while (columnNumber > 0) {
                columnNumber--;
                builder.append((char) ('A' + columnNumber % 26));
                columnNumber /= 26;
            }
            return builder.reverse().toString();
        }
    }

    public static void main(String[] args) {
        Solution s = new P0168().new Solution();
        Object ans = s.convertToTitle(701); // "ZY"
        System.out.println(ans);
    }
}