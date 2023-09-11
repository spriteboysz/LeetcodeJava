package leetcode.algorithm;

import java.util.HashSet;
import java.util.Set;

/**
 * Author: Deean
 * Date: 2022-07-15 22:00
 * LastEditTime: 2022-07-15 22:00
 * Description: 1925. 统计平方和三元组的数目
 */

public class P1925 {
    // code beginning
    class Solution {
        public int countTriples(int n) {
            Set<Integer> set = new HashSet<>();
            for (int i = 1; i <= n; i++) {
                set.add(i * i);
            }

            int count = 0;
            for (int i = 1; i <= n; i++) {
                for (int j = i + 1; j <= n; j++) {
                    if (set.contains(i * i + j * j)) {
                        // System.out.println(i + " " + j);
                        count += 2;
                    }
                }
            }
            return count;
        }
    }

    public static void main(String[] args) {
        Solution s = new P1925().new Solution();
        Object ans = s.countTriples(5);
        System.out.println(ans);
        ans = s.countTriples(10);
        System.out.println(ans);
    }
}