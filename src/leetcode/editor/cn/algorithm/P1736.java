package leetcode.editor.cn.algorithm;

/**
 * Author: Deean
 * Date: 2022-08-13 21:28
 * FileName: src/leetcode/editor/cn/algorithm
 * Description: 1736. 替换隐藏数字得到的最晚时间
 */

public class P1736 {
    // code beginning
    class Solution {
        public String maximumTime(String time) {
            char[] maximum = new char[5];
            if (time.charAt(0) == '?') {
                if (time.charAt(1) != '?' && Integer.parseInt(String.valueOf(time.charAt(1))) > 3) {
                    maximum[0] = '1';
                } else {
                    maximum[0] = '2';
                }
            } else {
                maximum[0] = time.charAt(0);
            }
            if (time.charAt(1) == '?') {
                if (maximum[0] == '2') maximum[1] = '3';
                else maximum[1] = '9';
            } else {
                maximum[1] = time.charAt(1);
            }
            maximum[2] = ':';
            if (time.charAt(3) == '?') {
                maximum[3] = '5';
            } else {
                maximum[3] = time.charAt(3);
            }
            if (time.charAt(4) == '?') {
                maximum[4] = '9';
            } else {
                maximum[4] = time.charAt(4);
            }
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