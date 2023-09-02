package leetcode.sword;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * Author: Deean
 * Date: 2022-07-23 11:41
 * LastEditTime: 2022-07-23 11:41
 * Description: 剑指 Offer II 081. 允许重复选择元素的组合
 */

public class OII0081 {
    // code beginning
    class Solution {
        List<List<Integer>> paths = new ArrayList<>();
        LinkedList<Integer> path = new LinkedList<>();

        public List<List<Integer>> combinationSum(int[] candidates, int target) {
            backtrace(candidates, target, path, 0);
            return paths;
        }

        private void backtrace(int[] candidates, int target, LinkedList<Integer> path, int start) {
            if (target == 0) {
                paths.add(new ArrayList<>(path));
                return;
            }
            if (target < 0) return;
            for (int i = start; i < candidates.length; i++) {
                path.add(candidates[i]);
                backtrace(candidates, target - candidates[i], path, i);
                path.removeLast();
            }
        }
    }

    public static void main(String[] args) {
        Solution s = new OII0081().new Solution();
        Object ans = s.combinationSum(new int[]{2, 3, 5}, 8);
        System.out.println(ans);
    }
}