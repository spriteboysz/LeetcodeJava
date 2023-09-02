package leetcode.sword;

import leetcode.common.TreeNode;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

/**
 * Author: Deean
 * Date: 2022-07-31 22:12
 * LastEditTime: 2022-07-31 22:12
 * Description: 剑指 Offer 34. 二叉树中和为某一值的路径
 */

public class O0034 {
    // code beginning
    class Solution {
        List<List<Integer>> paths = new ArrayList<>();
        Deque<Integer> path = new LinkedList<>();

        public List<List<Integer>> pathSum(TreeNode root, int target) {
            backtrace(root, target);
            return paths;
        }

        private void backtrace(TreeNode root, int target) {
            if (root == null) return;
            path.offerLast(root.val);
            target -= root.val;
            if (root.left == null && root.right == null && target == 0) {
                paths.add(new ArrayList<>(path));
            }
            backtrace(root.left, target);
            backtrace(root.right, target);
            path.pollLast();
        }
    }

    public static void main(String[] args) {
        Solution s = new O0034().new Solution();
        Object ans = s.pathSum(new TreeNode("[5,4,8,11,null,13,4,7,2,null,null,5,1]"), 22);
        System.out.println(ans);
    }
}