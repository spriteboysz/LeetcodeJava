package leetcode.editor.cn.sword;

import leetcode.editor.cn.common.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * Author: Deean
 * Date: 2022-07-22 21:45
 * LastEditTime: 2022-07-22 21:45
 * Description: 剑指 Offer 32 - III. 从上到下打印二叉树 III
 */

public class O0032III {
    // code beginning
    class Solution {
        public List<List<Integer>> levelOrder(TreeNode root) {
            List<List<Integer>> levels = new ArrayList<>();
            if (root == null) return levels;
            Queue<TreeNode> queue = new LinkedList<>();
            queue.offer(root);
            int index = 0;
            while (!queue.isEmpty()) {
                List<Integer> level = new ArrayList<>();
                int size = queue.size();
                for (int i = 0; i < size; i++) {
                    TreeNode node = queue.poll();
                    if (index % 2 == 0) {
                        level.add(node.val);
                    } else {
                        level.add(0, node.val);
                    }
                    if (node.left != null) queue.offer(node.left);
                    if (node.right != null) queue.offer(node.right);
                }
                levels.add(level);
                index++;
            }
            return levels;
        }
    }

    public static void main(String[] args) {
        Solution s = new O0032III().new Solution();
        Object ans = s.levelOrder(new TreeNode("[3,9,20,null,null,15,7]"));
        System.out.println(ans);
    }
}