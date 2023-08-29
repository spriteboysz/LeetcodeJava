package algorithm;

/**
 * Author: @Deean
 * Date: 2022-06-23 22:47
 * LastEditTime: 2022-06-23 22:47
 * Description: 数字转换为十六进制数
 */

public class P0405 {
    // code beginning
    class Solution {
        private final char[] BASE = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

        public String toHex(int num) {
            StringBuilder sb = new StringBuilder();
            while (sb.length() < 8) {
                sb.append(BASE[num & 0xf]);
                num >>= 4;
                if (num == 0) {
                    break;
                }
            }
            return sb.reverse().toString();
        }
    }

    public static void main(String[] args) {
        Solution s = new P0405().new Solution();
        Object ans = s.toHex(17);
        System.out.println(ans);
        ans = s.toHex(-1);
        System.out.println(ans);
    }
}