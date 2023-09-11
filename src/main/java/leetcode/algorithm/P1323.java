package leetcode.algorithm;

/**
 * Author: Deean
 * Date: 2022-07-03 23:19
 * LastEditTime: 2022-07-03 23:19
 * Description: 1323. 6 和 9 组成的最大数字
 */

public class P1323 {
    // code beginning
    class Solution {
        public int maximum69Number(int num) {
            char[] ch = Integer.toString(num).toCharArray();
            for (int i = 0; i < ch.length; i++) {
                if (ch[i] == '6') {
                    ch[i] = '9';
                    break;
                }
            }
            return Integer.parseInt(new String(ch));
        }
    }

    public static void main(String[] args) {
        Solution s = new P1323().new Solution();
        Object ans = s.maximum69Number(9996);
        System.out.println(ans);
    }
}