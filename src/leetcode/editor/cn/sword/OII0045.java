package leetcode.editor.cn.sword;

import leetcode.editor.cn.common.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Author: Deean
 * Date: 2022-07-18 23:54
 * LastEditTime: 2022-07-18 23:54
 * Description: 剑指 Offer II 045. 二叉树最底层最左边的值
 */

public class OII0045 {
    // code beginning
    class Solution {
        public int findBottomLeftValue(TreeNode root) {
            int bottomLeft = -1;
            if (root == null) return bottomLeft;
            Queue<TreeNode> queue = new LinkedList<>();
            queue.offer(root);
            while (!queue.isEmpty()) {
                int cur = 0;
                int size = queue.size();
                for (int i = 0; i < size; i++) {
                    TreeNode node = queue.poll();
                    assert node != null;
                    if (i == 0) cur = node.val;
                    if (node.left != null) queue.offer(node.left);
                    if (node.right != null) queue.offer(node.right);
                }
                bottomLeft = cur;
            }
            return bottomLeft;
        }
    }

    public static void main(String[] args) {
        Solution s = new OII0045().new Solution();
        Object ans = s.findBottomLeftValue(new TreeNode("[1,2,3,4,null,5,6,null,null,7]"));
        System.out.println(ans);
    }
}