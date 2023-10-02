package leetcode.LCP;

import leetcode.common.TreeNode;

/**
 * Author: Deean
 * Date: 2023-09-30 17:05
 * FileName: src/main/java/leetcode/LCP
 * Description:LCR 144. 翻转二叉树
 */

public class LCR0144 {
    // code beginning
    class Solution {
        public TreeNode mirrorTree(TreeNode root) {
            if (root == null) return null;
            TreeNode tmp = mirrorTree(root.left);
            root.left = mirrorTree(root.right);
            root.right = tmp;
            return root;
        }
    }

    public static void main(String[] args) {
        Solution s = new LCR0144().new Solution();
        var ans = s.mirrorTree(new TreeNode("[5,7,9,8,3,2,4]"));
        System.out.println(ans);
    }
}
