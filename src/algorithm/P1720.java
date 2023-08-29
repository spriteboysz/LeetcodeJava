package algorithm;

import java.util.Arrays;

/**
 * Author: Deean
 * Date: 2022-06-29 22:41
 * LastEditTime: 2022-06-29 22:41
 * Description: 1720. 解码异或后的数组
 */

public class P1720 {
    // code beginning
    class Solution {
        public int[] decode(int[] encoded, int first) {
            int[] decoded = new int[encoded.length + 1];
            decoded[0] = first;
            for (int i = 1; i < decoded.length; i++) {
                decoded[i] = decoded[i - 1] ^ encoded[i - 1];
            }
            return decoded;
        }
    }

    public static void main(String[] args) {
        Solution s = new P1720().new Solution();
        int[] ans = s.decode(new int[]{6, 2, 7, 3}, 4);
        System.out.println(Arrays.toString(ans));
    }
}