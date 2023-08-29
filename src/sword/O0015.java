package sword;

/**
 * Author: Deean
 * Date: 2022-07-04 23:48
 * LastEditTime: 2022-07-04 23:48
 * Description: 剑指 Offer 15. 二进制中1的个数
 */

public class O0015 {
    // code beginning
    class Solution {
        public int hammingWeight(int n) {
            String s = Integer.toBinaryString(n);
            int weight = 0;
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == '1') weight++;
            }
            return weight;
        }
    }

    public static void main(String[] args) {
        Solution s = new O0015().new Solution();
        Object ans = s.hammingWeight(-3);
        System.out.println(ans);
    }
}