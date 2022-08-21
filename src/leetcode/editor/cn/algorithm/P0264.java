package leetcode.editor.cn.algorithm;

import java.util.TreeSet;

/**
 * Author: Deean
 * Date: 2022-08-21 14:53
 * FileName: src/leetcode/editor/cn/algorithm
 * Description: 264. 丑数 II
 */

public class P0264 {
    // code beginning
    class Solution {
        public int nthUglyNumber(int n) {
            int[] factors = new int[]{2, 3, 5};
            TreeSet<Long> set = new TreeSet<>();
            set.add(1L);
            for (int i = 1; i <= n; i++) {
                long x = set.pollFirst();
                if (i == n) return (int) x;
                for (int factor : factors) set.add(factor * x);
            }
            return -1;
        }
    }

    public static void main(String[] args) {
        Solution s = new P0264().new Solution();
        Object ans = s.nthUglyNumber(10);
        System.out.println(ans);
    }
}