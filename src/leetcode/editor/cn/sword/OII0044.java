package leetcode.editor.cn.sword;

import leetcode.editor.cn.common.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * Author: Deean
 * Date: 2022-07-18 23:47
 * LastEditTime: 2022-07-18 23:47
 * Description: 剑指 Offer II 044. 二叉树每层的最大值
 */

public class OII0044 {
    // code beginning
    class Solution {
        public List<Integer> largestValues(TreeNode root) {
            List<Integer> largest = new ArrayList<>();
            if (root == null) return largest;
            Queue<TreeNode> queue = new LinkedList<>();
            queue.offer(root);
            while (!queue.isEmpty()) {
                int max = Integer.MIN_VALUE, size = queue.size();
                for (int i = 0; i < size; i++) {
                    TreeNode node = queue.poll();
                    assert node != null;
                    max = Math.max(max, node.val);
                    if (node.left != null) queue.offer(node.left);
                    if (node.right != null) queue.offer(node.right);
                }
                largest.add(max);
            }
            return largest;
        }
    }

    public static void main(String[] args) {
        Solution s = new OII0044().new Solution();
        Object ans = s.largestValues(new TreeNode("[1,2,3]"));
        System.out.println(ans);
    }
}