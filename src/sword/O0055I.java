package sword;

import common.TreeNode;

/**
 * Author: Deean
 * Date: 2022-07-06 22:05
 * LastEditTime: 2022-07-06 22:05
 * Description: 剑指 Offer 55 - I. 二叉树的深度
 */

public class O0055I {
    // code beginning
    class Solution {
        public int maxDepth(TreeNode root) {
            if (root == null) return 0;
            return Math.max(maxDepth(root.left), maxDepth(root.right)) + 1;
        }
    }

    public static void main(String[] args) {
        Solution s = new O0055I().new Solution();
        Object ans = s.maxDepth(new TreeNode("[3,9,20,null,null,15,7]"));
        System.out.println(ans);
    }
}