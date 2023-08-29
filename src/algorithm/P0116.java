package algorithm;

import common.TreeNode;

import java.util.Deque;
import java.util.LinkedList;

/**
 * Author: Deean
 * Date: 2022-08-14 23:11
 * FileName: src/leetcode/editor/cn/algorithm
 * Description: 116. 填充每个节点的下一个右侧节点指针
 */

public class P0116 {
    // code beginning
    class Solution {
        public TreeNode connect(TreeNode root) {
            if (root == null) return null;
            Deque<TreeNode> queue = new LinkedList<>();
            queue.offer(root);
            while (!queue.isEmpty()) {
                int size = queue.size();
                for (int i = 0; i < size; i++) {
                    TreeNode node = queue.poll();
                    assert node != null;
                    if (i < size - 1) node.next = queue.peek();
                    if (node.left != null) queue.offer(node.left);
                    if (node.right != null) queue.offer(node.right);
                }
            }
            return root;
        }
    }

    public static void main(String[] args) {
        Solution s = new P0116().new Solution();
        Object ans = s.connect(new TreeNode("[1,2,3,4,5,6,7]"));
        System.out.println(ans);
    }
}