package algorithm;

/**
 * Author: @Deean
 * Date: 2022-06-22 22:54
 * LastEditTime: 2022-06-22 22:54
 * Description: 位1的个数
 */

public class P0191 {
    // code beginning
    class Solution {
        public int hammingWeight(int n) {
            int weight = 0;
            for (int i = 0; i < 32; i++) {
                weight += n & 1;
                n >>= 1;
            }
            return weight;
        }
    }

    public static void main(String[] args) {
        Solution s = new P0191().new Solution();
        Object ans = s.hammingWeight(8);
        System.out.println(ans);
    }
}