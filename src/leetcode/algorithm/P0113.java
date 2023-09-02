package leetcode.algorithm;

import leetcode.common.TreeNode;

import java.util.ArrayList;
import java.util.Deque;
import java.util.List;
import java.util.concurrent.LinkedBlockingDeque;

/**
 * Author: Deean
 * Date: 2022-07-31 17:42
 * LastEditTime: 2022-07-31 17:42
 * Description: 113. 路径总和 II
 */

public class P0113 {
    // code beginning
    class Solution {
        List<List<Integer>> paths = new ArrayList<>();
        Deque<Integer> path = new LinkedBlockingDeque<>();

        public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
            backtrace(root, targetSum);
            return paths;
        }

        private void backtrace(TreeNode node, int targetSum) {
            if (node == null) return;
            path.offerLast(node.val);
            targetSum -= node.val;
            if (node.left == null && node.right == null && targetSum == 0) {
                paths.add(new ArrayList<>(path));
            }
            backtrace(node.left, targetSum);
            backtrace(node.right, targetSum);
            path.pollLast();
        }


    }

    public static void main(String[] args) {
        Solution s = new P0113().new Solution();
        Object ans = s.pathSum(new TreeNode("[5,4,8,11,null,13,4,7,2,null,null,5,1]"), 22);
        System.out.println(ans);
    }
}