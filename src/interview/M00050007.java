package interview;

/**
 * Author: Deean
 * Date: 2022-07-08 23:37
 * LastEditTime: 2022-07-08 23:37
 * Description: 面试题 05.07. 配对交换
 */

public class M00050007 {
    // code beginning
    class Solution {
        public int exchangeBits(int num) {
            int odd = num & 0x55555555;
            int even = num & 0xaaaaaaaa;
            odd <<= 1;
            even >>>= 1;
            return odd | even;
        }
    }

    public static void main(String[] args) {
        Solution s = new M00050007().new Solution();
        Object ans = s.exchangeBits(3);
        System.out.println(ans);
    }
}