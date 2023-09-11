package leetcode.algorithm;

import leetcode.common.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Author: Deean
 * Date: 2022-08-26 23:01
 * FileName: src/leetcode/editor/cn/leetcode.algorithm
 * Description: 117. 填充每个节点的下一个右侧节点指针 II
 */

public class P0117 {
    // code beginning
    class Solution {
        public TreeNode connect(TreeNode root) {
            if (root == null) return null;
            Queue<TreeNode> queue = new LinkedList<>();
            queue.add(root);
            while (!queue.isEmpty()) {
                int size = queue.size();
                for (int i = 0; i < size; i++) {
                    TreeNode node = queue.poll();
                    assert node != null;
                    if (i < size - 1) node.next = queue.peek();
                    if (node.left != null) queue.add(node.left);
                    if (node.right != null) queue.add(node.right);
                }
            }
            return root;
        }
    }

    public static void main(String[] args) {
        Solution s = new P0117().new Solution();
        Object ans = s.connect(new TreeNode("[1,2,3,4,5,null,7]"));
        System.out.println(ans);
    }
}