package leetcode.editor.cn.sword;

import leetcode.editor.cn.common.TreeNode;

/**
 * Author: Deean
 * Date: 2022-07-16 23:11
 * LastEditTime: 2022-07-16 23:11
 * Description: 剑指 Offer 68 - II. 二叉树的最近公共祖先
 */

public class O0068II {
    // code beginning
    class Solution {
        public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
            if (root == null || root == p || root == q) return root;
            TreeNode left = lowestCommonAncestor(root.left, p, q);
            TreeNode right = lowestCommonAncestor(root.right, p, q);
            if (left == null) return right;
            if (right == null) return left;
            return root;
        }
    }

    public static void main(String[] args) {
        Solution s = new O0068II().new Solution();
        Object ans = s.lowestCommonAncestor(new TreeNode("[3,5,1,6,2,0,8,null,null,7,4]"), new TreeNode(5),
                new TreeNode(4));
        System.out.println(ans);
    }
}