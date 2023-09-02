package leetcode.algorithm;

import java.util.ArrayList;
import java.util.List;

/**
 * Author: Deean
 * Date: 2022-07-21 23:03
 * LastEditTime: 2022-07-21 23:03
 * Description: 77. 组合
 */

public class P0077 {
    // code beginning
    class Solution {
        List<List<Integer>> paths = new ArrayList<>();
        List<Integer> path = new ArrayList<>();

        public List<List<Integer>> combine(int n, int k) {
            backtrace(n, k, 1);
            return paths;
        }

        private void backtrace(int n, int k, int start) {
            if (path.size() == k) {
                paths.add(new ArrayList<>(path));
                return;
            }
            for (int i = start; i <= n - (k - path.size()) + 1; i++) {
                path.add(i);
                backtrace(n, k, i + 1);
                path.remove(path.size() - 1);
            }
        }
    }

    public static void main(String[] args) {
        Solution s = new P0077().new Solution();
        Object ans = s.combine(4, 2);
        System.out.println(ans);
    }
}