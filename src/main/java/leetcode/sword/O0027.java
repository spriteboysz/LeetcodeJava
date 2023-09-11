package leetcode.sword;

import leetcode.common.TreeNode;

/**
 * Author: Deean
 * Date: 2022-07-06 21:57
 * LastEditTime: 2022-07-06 21:57
 * Description: 剑指 Offer 27. 二叉树的镜像
 */

public class O0027 {
    // code beginning
    class Solution {
        public TreeNode mirrorTree(TreeNode root) {
            if (root == null) return null;
            TreeNode left = mirrorTree(root.left);
            root.left = mirrorTree(root.right);
            root.right = left;
            return root;
        }
    }

    public static void main(String[] args) {
        Solution s = new O0027().new Solution();
        Object ans = s.mirrorTree(new TreeNode("[4,2,7,1,3,6,9]"));
        System.out.println(ans);
    }
}