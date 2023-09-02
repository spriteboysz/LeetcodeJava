package leetcode.algorithm;

/**
 * Author: Deean
 * Date: 2022-07-07 23:08
 * LastEditTime: 2022-07-07 23:08
 * Description: 171. Excel 表列序号
 */

public class P0171 {
    // code beginning
    class Solution {
        public int titleToNumber(String columnTitle) {
            int num = 0;
            for (char c : columnTitle.toCharArray()) {
                num = num * 26 + c - 'A' + 1;
            }
            return num;
        }
    }

    public static void main(String[] args) {
        Solution s = new P0171().new Solution();
        Object ans = s.titleToNumber("ZY");
        System.out.println(ans);
    }
}