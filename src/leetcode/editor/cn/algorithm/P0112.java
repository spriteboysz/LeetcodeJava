package leetcode.editor.cn.algorithm;

import leetcode.editor.cn.common.TreeNode;

/**
 * Author: Deean
 * Date: 2022-07-31 17:37
 * LastEditTime: 2022-07-31 17:37
 * Description: 112. 路径总和
 */

public class P0112 {
    // code beginning
    class Solution {
        public boolean hasPathSum(TreeNode root, int targetSum) {
            if (root == null) return false;
            if (root.left == null && root.right == null) return root.val == targetSum;
            return hasPathSum(root.left, targetSum - root.val) || hasPathSum(root.right, targetSum - root.val);
        }
    }

    public static void main(String[] args) {
        Solution s = new P0112().new Solution();
        Object ans = s.hasPathSum(new TreeNode("[5,4,8,11,null,13,4,7,2,null,null,null,1]"), 22);
        System.out.println(ans);
    }
}