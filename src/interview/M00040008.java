package interview;

import common.TreeNode;

/**
 * Author: Deean
 * Date: 2022-08-28 17:03
 * FileName: src/leetcode/editor/cn/interview
 * Description: 面试题 04.08. 首个共同祖先
 */

public class M00040008 {
    // code beginning
    class Solution {
        public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
            if (root == null || root == p || root == q) return root;
            TreeNode left = lowestCommonAncestor(root.left, p, q);
            TreeNode right = lowestCommonAncestor(root.right, p, q);
            if (left == null & right == null) return null;
            if (left == null) return right;
            if (right == null) return left;
            return root;
        }
    }

    public static void main(String[] args) {
        Solution s = new M00040008().new Solution();
        Object ans = s.lowestCommonAncestor(
                new TreeNode("[3,5,1,6,2,0,8,null,null,7,4]"),
                new TreeNode(5),
                new TreeNode(4));
        System.out.println(ans);
    }
}