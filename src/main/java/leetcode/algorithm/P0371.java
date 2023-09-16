package leetcode.algorithm;

/**
 * Author: Deean
 * Date: 2023-09-16 13:58
 * FileName: src/main/java/leetcode/algorithm
 * Description:371. 两整数之和
 */

public class P0371 {
    // code beginning
    class Solution {
        public int getSum(int a, int b) {
            while (b != 0) {
                int carry = (a & b) << 1;
                a ^= b;
                b = carry;
            }
            return a;
        }
    }

    public static void main(String[] args) {
        Solution s = new P0371().new Solution();
        var ans = s.getSum(1, 2);
        System.out.println(ans);
    }
}
