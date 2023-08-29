package algorithm;

import common.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * Author: Deean
 * Date: 2022-07-18 22:59
 * LastEditTime: 2022-07-18 22:59
 * Description: 107. 二叉树的层序遍历 II
 */

public class P0107 {
    // code beginning
    class Solution {
        public List<List<Integer>> levelOrderBottom(TreeNode root) {
            List<List<Integer>> levels = new ArrayList<>();
            if (root == null) return levels;
            Queue<TreeNode> queue = new LinkedList<>();
            queue.offer(root);
            while (!queue.isEmpty()) {
                List<Integer> level = new ArrayList<>();
                int size = queue.size();
                for (int i = 0; i < size; i++) {
                    TreeNode node = queue.poll();
                    assert node != null;
                    level.add(node.val);
                    if (node.left != null) queue.offer(node.left);
                    if (node.right != null) queue.offer(node.right);
                }
                levels.add(0, level);
            }
            return levels;
        }
    }

    public static void main(String[] args) {
        Solution s = new P0107().new Solution();
        Object ans = s.levelOrderBottom(new TreeNode("[3,9,20,null,null,15,7]"));
        System.out.println(ans);
    }
}