package algorithm;

/**
 * Author: Deean
 * Date: 2022-06-30 23:02
 * LastEditTime: 2022-06-30 23:02
 * Description: 1486. 数组异或操作
 */

public class P1486 {
    // code beginning
    class Solution {
        public int xorOperation(int n, int start) {
            int xor = 0;
            for (int i = 0; i < n; i++) {
                xor ^= start + 2 * i;
            }
            return xor;
        }
    }

    public static void main(String[] args) {
        Solution s = new P1486().new Solution();
        Object ans = s.xorOperation(4, 3);
        System.out.println(ans);
    }
}