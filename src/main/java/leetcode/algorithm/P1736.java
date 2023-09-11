package leetcode.algorithm;

/**
 * Author: Deean
 * Date: 2022-08-13 21:28
 * FileName: src/leetcode/editor/cn/leetcode.algorithm
 * Description: 1736. 替换隐藏数字得到的最晚时间
 */

public class P1736 {
    // code beginning
    class Solution {
        public String maximumTime(String time) {
            char[] maximum = time.toCharArray();
            if (maximum[0] == '?') {
                if (maximum[1] != '?' && maximum[1] - '0' > 3) {
                    maximum[0] = '1';
                } else {
                    maximum[0] = '2';
                }
            }
            if (maximum[1] == '?') {
                if (maximum[0] == '2') maximum[1] = '3';
                else maximum[1] = '9';
            }
            if (maximum[3] == '?') maximum[3] = '5';
            if (maximum[4] == '?') maximum[4] = '9';
            return new String(maximum);
        }
    }

    public static void main(String[] args) {
        Solution s = new P1736().new Solution();
        Object ans = s.maximumTime("0?:3?");
        System.out.println(ans);
        ans = s.maximumTime("??:3?");
        System.out.println(ans);
    }
}