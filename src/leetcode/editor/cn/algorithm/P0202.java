package leetcode.editor.cn.algorithm;

import java.util.HashSet;

/**
 * Author: Deean
 * Date: 2022-06-27 23:29
 * LastEditTime: 2022-06-27 23:29
 * Description: 202. 快乐数
 */

public class P0202 {
    // code beginning
    class Solution {
        private int process(int num) {
            int total = 0;
            while (num > 0) {
                int cur = num % 10;
                num = num / 10;
                total += cur * cur;
            }
            return total;
        }

        public boolean isHappy(int n) {
            HashSet<Integer> seen = new HashSet<>();
            while (n != 1 && !seen.contains(n)) {
                seen.add(n);
                n = process(n);
            }
            return n == 1;
        }
    }

    public static void main(String[] args) {
        Solution s = new P0202().new Solution();
        Object ans = s.isHappy(19);
        System.out.println(ans);
    }
}