package leetcode.algorithm;

import java.util.Random;

/**
 * Author: Deean
 * Date: 2022-08-08 23:59
 * FileName: src/leetcode/editor/cn/leetcode.algorithm
 * Description:
 */

public class P1576 {
    // code beginning
    class Solution {
        public String modifyString(String s) {
            s = "a" + s + "a";
            char[] chars = s.toCharArray();
            for (int i = 1; i < chars.length - 1; i++) {
                if (chars[i] == '?') {
                    char n = 'a';
                    while (n == chars[i - 1] || n == chars[i + 1]) {
                        n = (char) (new Random().nextInt(26) + 'a');
                    }
                    chars[i] = n;
                }
            }
            return new String(chars).substring(1, chars.length - 1);
        }
    }

    public static void main(String[] args) {
        Solution s = new P1576().new Solution();
        Object ans = s.modifyString("j?qg??b");
        System.out.println(ans);
    }
}