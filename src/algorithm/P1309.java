package algorithm;

/**
 * Author: Deean
 * Date: 2022-07-09 22:48
 * LastEditTime: 2022-07-09 22:48
 * Description: 1309. 解码字母到整数映射
 */

public class P1309 {
    // code beginning
    class Solution {
        public String freqAlphabets(String s) {
            StringBuilder builder = new StringBuilder();
            for (int i = 0; i < s.length(); i++) {
                if (i + 2 < s.length() && s.charAt(i + 2) == '#') {
                    builder.append((char) ((s.charAt(i) - '0') * 10 + s.charAt(i + 1) - '1' + 'a'));
                    i += 2;
                } else {
                    builder.append((char) (s.charAt(i) - '1' + 'a'));
                }
            }
            return builder.toString();
        }
    }

    public static void main(String[] args) {
        Solution s = new P1309().new Solution();
        Object ans = s.freqAlphabets("1326#");
        System.out.println(ans);
    }
}