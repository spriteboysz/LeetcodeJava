package leetcode.editor.cn.algorithm;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * Author: Deean
 * Date: 2022-07-23 12:00
 * LastEditTime: 2022-07-23 12:00
 * Description: 39. 组合总和
 */

public class P0039 {
    // code beginning
    class Solution {
        List<List<Integer>> paths = new ArrayList<>();
        LinkedList<Integer> path = new LinkedList<>();

        public List<List<Integer>> combinationSum(int[] candidates, int target) {
            backtrace(candidates, target, path, 0);
            return paths;
        }

        private void backtrace(int[] candidates, int target, LinkedList<Integer> path, int start) {
            if (target < 0) return;
            if (target == 0) {
                paths.add(new ArrayList<>(path));
                return;
            }
            for (int i = start; i < candidates.length; i++) {
                path.add(candidates[i]);
                backtrace(candidates, target - candidates[i], path, i);
                path.removeLast();
            }
        }
    }

    public static void main(String[] args) {
        Solution s = new P0039().new Solution();
        Object ans = s.combinationSum(new int[]{2, 3, 5}, 8);
        System.out.println(ans);
    }
}