package leetcode.interview;

/**
 * Author: Deean
 * Date: 2022-08-12 23:52
 * FileName: src/leetcode/editor/cn/leetcode.interview
 * Description: 面试题 05.01. 插入
 */

public class M00050001 {
    // code beginning
    class Solution {
        public int insertBits(int n, int m, int i, int j) {
            //left in (, j + 1];middle in [i, j];right in [i - 1, 0];
            int left = n >> j >> 1;
            left = left << j << 1;
            int middle = m << i;
            int right = n & ((1 << i) - 1);
            return left | middle | right;
        }
    }

    public static void main(String[] args) {
        Solution s = new M00050001().new Solution();
        Object ans = s.insertBits(0, 31, 0, 4);
        System.out.println(ans);
        ans = s.insertBits(1, 31, 0, 4);
        System.out.println(ans);
    }
}