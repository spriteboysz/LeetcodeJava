package leetcode.editor.cn.algorithm;

import leetcode.editor.cn.common.TreeNode;

/**
 * Author: Deean
 * Date: 2022-07-09 22:18
 * LastEditTime: 2022-07-09 22:18
 * Description: 617. 合并二叉树
 */

public class P0617 {
    // code beginning
    class Solution {
        public TreeNode mergeTrees(TreeNode root1, TreeNode root2) {
            if (root1 == null) return root2;
            if (root2 == null) return root1;
            TreeNode merged = new TreeNode(root1.val + root2.val);
            merged.left = mergeTrees(root1.left, root2.left);
            merged.right = mergeTrees(root1.right, root2.right);
            return merged;
        }
    }

    public static void main(String[] args) {
        Solution s = new P0617().new Solution();
        Object ans = s.mergeTrees(new TreeNode("[1,3,2,5]"), new TreeNode("[2,1,3,null,4,null,7]"));
        System.out.println(ans);
    }
}