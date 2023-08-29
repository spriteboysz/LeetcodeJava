package algorithm;

import common.TreeNode;

/**
 * Author: Deean
 * Date: 2022-08-21 16:57
 * FileName: src/leetcode/editor/cn/algorithm
 * Description: 1379. 找出克隆二叉树中的相同节点
 */

public class P1379 {
    // code beginning
    class Solution {
        public final TreeNode getTargetCopy(final TreeNode original, final TreeNode cloned, final TreeNode target) {
            if (original == null) return null;
            if (original == target) return cloned;
            TreeNode tree = getTargetCopy(original.left, cloned.left, target);
            if (tree != null) return tree;
            tree = getTargetCopy(original.right, cloned.right, target);
            return tree;
        }
    }

    public static void main(String[] args) {
        Solution s = new P1379().new Solution();
        TreeNode tree = new TreeNode("[8,null,6,null,5,null,4,null,3,null,2,null,1]");
        Object ans = s.getTargetCopy(tree, tree, new TreeNode("[4]"));
        System.out.println(ans);
    }
}