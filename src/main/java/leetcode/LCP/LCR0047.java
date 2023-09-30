package leetcode.LCP;

import leetcode.common.TreeNode;

/**
 * Author: Deean
 * Date: 2023-09-29 21:45
 * FileName: src/main/java/leetcode/algorithm
 * Description:LCR 047. 二叉树剪枝
 */

public class LCR0047 {
    // code beginning
    class Solution {
        public TreeNode pruneTree(TreeNode root) {
            if (root == null) return null;
            root.left = pruneTree(root.left);
            root.right = pruneTree(root.right);
            if (root.left == null && root.right == null && root.val == 0) {
                return null;
            }
            return root;
        }
    }

    public static void main(String[] args) {
        Solution s = new LCR0047().new Solution();
        var ans = s.pruneTree(new TreeNode("[1,null,0,0,1]"));
        System.out.println(ans);
    }
}
