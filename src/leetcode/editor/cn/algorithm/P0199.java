package leetcode.editor.cn.algorithm;

import leetcode.editor.cn.common.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * Author: Deean
 * Date: 2022-07-19 22:57
 * LastEditTime: 2022-07-19 22:57
 * Description: 199. 二叉树的右视图
 */

public class P0199 {
    // code beginning
    class Solution {
        public List<Integer> rightSideView(TreeNode root) {
            List<Integer> view = new ArrayList<>();
            if (root == null) return view;
            Queue<TreeNode> queue = new LinkedList<>();
            queue.offer(root);
            while (!queue.isEmpty()) {
                int cur = 0, size = queue.size();
                for (int i = 0; i < size; i++) {
                    TreeNode node = queue.poll();
                    assert node != null;
                    cur = node.val;
                    if (node.left != null) queue.offer(node.left);
                    if (node.right != null) queue.offer(node.right);
                }
                view.add(cur);
            }
            return view;
        }
    }

    public static void main(String[] args) {
        Solution s = new P0199().new Solution();
        Object ans = s.rightSideView(new TreeNode("[1,null,3]"));
        System.out.println(ans);
    }
}