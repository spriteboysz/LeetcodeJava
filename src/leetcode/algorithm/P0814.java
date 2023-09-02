package leetcode.algorithm;

import leetcode.common.TreeNode;

/**
 * Author: Deean
 * Date: 2022-07-21 23:20
 * LastEditTime: 2022-07-21 23:20
 * Description: 814. 二叉树剪枝
 */

public class P0814 {
    // code beginning
    class Solution {
        public TreeNode pruneTree(TreeNode root) {
            if (root == null) return null;
            root.left = pruneTree(root.left);
            root.right = pruneTree(root.right);
            if (root.left == null && root.right == null && root.val == 0) {
                return null;
            }
            return root;
        }
    }

    public static void main(String[] args) {
        Solution s = new P0814().new Solution();
        Object ans = s.pruneTree(new TreeNode("[1,0,1,0,0,0,1]"));
        System.out.println(ans);
    }
}