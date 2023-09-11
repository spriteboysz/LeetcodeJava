package leetcode.algorithm;

/**
 * Author: Deean
 * Date: 2022-07-10 21:26
 * LastEditTime: 2022-07-10 21:26
 * Description: 1945. 字符串转化后的各位数字之和
 */

public class P1945 {
    // code beginning
    class Solution {
        public int getLucky(String s, int k) {
            StringBuilder builder = new StringBuilder();
            for (char c : s.toCharArray()) {
                builder.append(c - 'a' + 1);
            }

            String str = builder.toString();
            while (k > 0) {
                int cur = 0;
                for (char c : str.toCharArray()) {
                    cur += c - '0';
                }
                str = String.valueOf(cur);
                k--;
            }
            return Integer.parseInt(str);
        }
    }

    public static void main(String[] args) {
        Solution s = new P1945().new Solution();
        Object ans = s.getLucky("leetcode", 2);
        System.out.println(ans);
    }
}