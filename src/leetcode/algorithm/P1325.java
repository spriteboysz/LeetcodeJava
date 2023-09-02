package leetcode.algorithm;

import leetcode.common.TreeNode;

/**
 * Author: Deean
 * Date: 2022-08-23 23:42
 * FileName: src/leetcode/editor/cn/leetcode.algorithm
 * Description:
 */

public class P1325 {
    // code beginning
    class Solution {
        public TreeNode removeLeafNodes(TreeNode root, int target) {
            if (root == null) return null;
            root.left = removeLeafNodes(root.left, target);
            root.right = removeLeafNodes(root.right, target);
            if (root.left == null && root.right == null && root.val == target) {
                return null;
            }
            return root;
        }
    }

    public static void main(String[] args) {
        Solution s = new P1325().new Solution();
        Object ans = s.removeLeafNodes(new TreeNode("[1,2,null,2,null,2]"), 2);
        System.out.println(ans);
    }
}