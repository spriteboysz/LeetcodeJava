package leetcode.editor.cn.algorithm;

import leetcode.editor.cn.common.TreeNode;

/**
 * Author: Deean
 * Date: 2022-07-17 17:04
 * LastEditTime: 2022-07-17 17:04
 * Description: 222. 完全二叉树的节点个数
 */

public class P0222 {
    // code beginning
    class Solution {
        public int countNodes(TreeNode root) {
            if (root == null) return 0;
            return countNodes(root.left) + countNodes(root.right) + 1;
        }
    }

    public static void main(String[] args) {
        Solution s = new P0222().new Solution();
        Object ans = s.countNodes(new TreeNode("[1,2,3,4,5,6]"));
        System.out.println(ans);
    }
}