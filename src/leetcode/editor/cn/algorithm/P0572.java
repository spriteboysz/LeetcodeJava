package leetcode.editor.cn.algorithm;

import leetcode.editor.cn.common.TreeNode;

/**
 * Author: Deean
 * Date: 2022-08-16 23:51
 * FileName: src/leetcode/editor/cn/algorithm
 * Description: 572. 另一棵树的子树
 */

public class P0572 {
    // code beginning
    class Solution {
        public boolean isSubtree(TreeNode root, TreeNode subRoot) {
            if (subRoot == null) return true;
            if (root == null) return false;
            return isSubtree(root.left, subRoot) || isSubtree(root.right, subRoot) || isSame(root, subRoot);
        }

        private boolean isSame(TreeNode root1, TreeNode root2) {
            if (root1 == null && root2 == null) return true;
            if (root1 == null || root2 == null) return false;
            if (root1.val != root2.val) return false;
            return isSame(root1.left, root2.left) && isSame(root1.right, root2.right);
        }
    }

    public static void main(String[] args) {
        Solution s = new P0572().new Solution();
        Object ans = s.isSubtree(new TreeNode("[3,4,5,1,2,null,null,null,null,0]"), new TreeNode("[4,1,2]"));
        System.out.println(ans);
    }
}