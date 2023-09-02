package leetcode.sword;

import leetcode.common.TreeNode;

/**
 * Author: Deean
 * Date: 2022-07-30 23:44
 * LastEditTime: 2022-07-30 23:44
 * Description: 剑指 Offer II 047. 二叉树剪枝
 */

public class OII0047 {
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
        Solution s = new OII0047().new Solution();
        Object ans = s.pruneTree(new TreeNode("[1,0,1,0,0,0,1]"));
        System.out.println(ans);
    }
}