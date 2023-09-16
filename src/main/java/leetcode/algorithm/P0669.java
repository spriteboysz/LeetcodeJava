package leetcode.algorithm;

import leetcode.common.TreeNode;

/**
 * Author: Deean
 * Date: 2023-09-16 08:53
 * FileName: src/main/java/leetcode/algorithm
 * Description:669. 修剪二叉搜索树
 */

public class P0669 {
    // code beginning
    class Solution {
        public TreeNode trimBST(TreeNode root, int low, int high) {
            if (root == null) return null;
            if (root.val < low) {
                return trimBST(root.right, low, high);
            } else if (root.val > high) {
                return trimBST(root.left, low, high);
            } else {
                root.left = trimBST(root.left, low, high);
                root.right = trimBST(root.right, low, high);
                return root;
            }
        }
    }

    public static void main(String[] args) {
        Solution s = new P0669().new Solution();
        var ans = s.trimBST(new TreeNode("[3,0,4,null,2,null,null,1]"), 1, 3);
        System.out.println(ans);
    }
}
