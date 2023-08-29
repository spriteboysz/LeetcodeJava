package algorithm;

import common.TreeNode;

/**
 * Author: Deean
 * Date: 2022-07-04 23:39
 * LastEditTime: 2022-07-04 23:39
 * Description: 226. 翻转二叉树
 */

public class P0226 {
    // code beginning
    class Solution {
        public TreeNode invertTree(TreeNode root) {
            if (root == null) return null;
            TreeNode left = invertTree(root.left);
            root.left = invertTree(root.right);
            root.right = left;
            return root;
        }
    }

    public static void main(String[] args) {
        Solution s = new P0226().new Solution();
        Object ans = s.invertTree(new TreeNode("[4,2,7,1,3,6,9]"));
        System.out.println(ans);
    }
}