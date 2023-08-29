package algorithm;

/**
 * Author: Deean
 * Date: 2022-07-14 23:26
 * LastEditTime: 2022-07-14 23:26
 * Description: 1869. 哪种连续子字符串更长
 */

public class P1869 {
    // code beginning
    class Solution {
        public boolean checkZeroOnes(String s) {
            int max0 = 0, max1 = 0, cur0 = 0, cur1 = 0;
            for (char c : s.toCharArray()) {
                if (c == '1') {
                    cur1++;
                    max1 = Math.max(max1, cur1);
                    cur0 = 0;
                } else {
                    cur0++;
                    max0 = Math.max(max0, cur0);
                    cur1 = 0;
                }
            }
            return max1 > max0;
        }
    }

    public static void main(String[] args) {
        Solution s = new P1869().new Solution();
        Object ans = s.checkZeroOnes("111000");
        System.out.println(ans);
    }
}