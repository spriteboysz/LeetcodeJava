package leetcode.interview;

/**
 * Author: Deean
 * Date: 2022-07-12 23:23
 * LastEditTime: 2022-07-12 23:23
 * Description: 面试题 17.01. 不用加号的加法
 */

public class M00170001 {
    // code beginning
    class Solution {
        public int add(int a, int b) {
            if (a == 0) return b;
            return add((a & b) << 1, a ^ b);
        }
    }

    public static void main(String[] args) {
        Solution s = new M00170001().new Solution();
        Object ans = s.add(1, 1);
        System.out.println(ans);
        ans = s.add(999, 88);
        System.out.println(ans);
    }
}