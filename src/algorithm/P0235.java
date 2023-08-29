package algorithm;

import common.TreeNode;

/**
 * Author: Deean
 * Date: 2022-07-15 22:50
 * LastEditTime: 2022-07-15 22:50
 * Description: 235. 二叉搜索树的最近公共祖先
 */

public class P0235 {
    // code beginning
    class Solution {
        public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
            if (p.val < root.val && q.val < root.val) {
                return lowestCommonAncestor(root.left, p, q);
            } else if (p.val > root.val && q.val > root.val) {
                return lowestCommonAncestor(root.right, p, q);
            } else {
                return root;
            }
        }
    }

    public static void main(String[] args) {
        Solution s = new P0235().new Solution();
        Object ans = s.lowestCommonAncestor(new TreeNode("[6,2,8,0,4,7,9,null,null,3,5]"), new TreeNode(2),
                new TreeNode(4));
        System.out.println(ans);
    }
}