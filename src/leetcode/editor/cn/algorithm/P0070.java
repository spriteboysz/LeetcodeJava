package leetcode.editor.cn.algorithm;

/**
 * Author: Deean
 * Date: 2022-08-02 23:09
 * LastEditTime: 2022-08-02 23:09
 * Description: 70. 爬楼梯
 */

public class P0070 {
    // code beginning
    class Solution {
        public int climbStairs(int n) {
            int a = 1, b = 1;
            for (int i = 1; i < n; i++) {
                int temp = a + b;
                a = b;
                b = temp;
            }
            return b;
        }
    }

    public static void main(String[] args) {
        Solution s = new P0070().new Solution();
        Object ans = s.climbStairs(3);
        System.out.println(ans);
    }
}