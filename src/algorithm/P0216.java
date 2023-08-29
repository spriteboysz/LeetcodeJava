package algorithm;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * Author: Deean
 * Date: 2022-07-23 13:52
 * LastEditTime: 2022-07-23 13:52
 * Description: 216. 组合总和 III
 */

public class P0216 {
    // code beginning
    class Solution {
        List<List<Integer>> paths = new ArrayList<>();
        LinkedList<Integer> path = new LinkedList<>();

        public List<List<Integer>> combinationSum3(int k, int n) {
            backtrace(n, k, 1, 0);
            return paths;
        }

        private void backtrace(int target, int k, int start, int sum) {
            if (sum > target) return;
            if (path.size() == k) {
                if (sum == target) paths.add(new ArrayList<>(path));
                return;
            }
            for (int i = start; i <= 9 - (k - path.size()) + 1; i++) {
                path.add(i);
                sum += i;
                backtrace(target, k, i + 1, sum);
                path.removeLast();
                sum -= i;
            }
        }
    }

    public static void main(String[] args) {
        Solution s = new P0216().new Solution();
        Object ans = s.combinationSum3(3, 9);
        System.out.println(ans);
    }
}