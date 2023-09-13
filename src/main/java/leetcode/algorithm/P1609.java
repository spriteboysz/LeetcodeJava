package leetcode.algorithm;

import leetcode.common.TreeNode;

import java.util.ArrayDeque;
import java.util.Queue;

/**
 * Author: Deean
 * Date: 2023-09-13 21:25
 * FileName: src/main/java/leetcode/algorithm
 * Description:1609. 奇偶树
 */

public class P1609 {
    // code beginning
    class Solution {
        public boolean isEvenOddTree(TreeNode root) {
            int level = 0;
            Queue<TreeNode> queue = new ArrayDeque<>();
            queue.add(root);
            while (!queue.isEmpty()) {
                int prev = level % 2 == 0 ? Integer.MIN_VALUE : Integer.MAX_VALUE;
                for (int i = 0, n = queue.size(); i < n; i++) {
                    TreeNode node = queue.poll();
                    assert node != null;
                    int value = node.val;
                    if (level % 2 == value % 2) {
                        return false;
                    }
                    if ((level % 2 == 0 && value <= prev) || (level % 2 == 1 && value >= prev)) {
                        return false;
                    }
                    prev = value;
                    if (node.left != null) {
                        queue.offer(node.left);
                    }
                    if (node.right != null) {
                        queue.offer(node.right);
                    }
                }
                level++;
            }
            return true;
        }
    }

    public static void main(String[] args) {
        Solution s = new P1609().new Solution();
        var ans = s.isEvenOddTree(new TreeNode("[1,10,4,3,null,7,9,12,8,6,null,null,2]"));
        System.out.println(ans);
    }
}
