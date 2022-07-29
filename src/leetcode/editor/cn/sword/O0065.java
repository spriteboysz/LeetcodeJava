package leetcode.editor.cn.sword;

/**
 * Author: Deean
 * Date: 2022-07-29 22:38
 * LastEditTime: 2022-07-29 22:38
 * Description: 剑指 Offer 65. 不用加减乘除做加法
 */

public class O0065 {
    // code beginning
    class Solution {
        public int add(int a, int b) {
            while (b != 0) {
                int c = (a & b) << 1;
                a ^= b;
                b = c;
            }
            return a;
        }
    }

    public static void main(String[] args) {
        Solution s = new O0065().new Solution();
        Object ans = s.add(1, 1);
        System.out.println(ans);
    }
}