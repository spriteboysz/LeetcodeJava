package leetcode.editor.cn.algorithm;

import java.util.Arrays;

/**
 * Author: Deean
 * Date: 2022-07-05 23:01
 * LastEditTime: 2022-07-05 23:01
 * Description: 1374. 生成每种字符都是奇数个的字符串
 */

public class P1374 {
    // code beginning
    class Solution {
        public String generateTheString(int n) {
            char[] chars = new char[n];
            Arrays.fill(chars, 'b');
            if (n % 2 == 0) chars[0] = 'a';
            return String.valueOf(chars);
        }
    }

    public static void main(String[] args) {
        Solution s = new P1374().new Solution();
        Object ans = s.generateTheString(7);
        System.out.println(ans);
        ans = s.generateTheString(6);
        System.out.println(ans);
    }
}