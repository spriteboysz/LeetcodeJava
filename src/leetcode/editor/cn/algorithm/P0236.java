package leetcode.editor.cn.algorithm;

import leetcode.editor.cn.common.TreeNode;

/**
 * Author: Deean
 * Date: 2022-08-28 16:39
 * FileName: src/leetcode/editor/cn/algorithm
 * Description: 236. 二叉树的最近公共祖先
 */

public class P0236 {
    // code beginning
    class Solution {
        public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
            if (root == null || root == p || root == q) return root;
            TreeNode left = lowestCommonAncestor(root.left, p, q);
            TreeNode right = lowestCommonAncestor(root.right, p, q);
            if (left == null && right == null) return null;
            if (left == null) return right;
            if (right == null) return left;
            return root;
        }
    }

    public static void main(String[] args) {
        Solution s = new P0236().new Solution();
        Object ans = s.lowestCommonAncestor(new TreeNode("[3,5,1,6,2,0,8,null,null,7,4]"),
                new TreeNode(5),
                new TreeNode(7));
        System.out.println(ans);
    }
}