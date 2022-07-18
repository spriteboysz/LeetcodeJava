package leetcode.editor.cn.algorithm;

import leetcode.editor.cn.common.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * Author: Deean
 * Date: 2022-07-19 00:02
 * LastEditTime: 2022-07-19 00:02
 * Description: .
 */

public class P0429 {
    // code beginning
    class Solution {
        public List<List<Integer>> levelOrder(TreeNode root) {
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
                    for (TreeNode n : node.children) {
                        if (n != null) queue.offer(n);
                    }
                }
                levels.add(level);
            }
            return levels;
        }
    }

    public static void main(String[] args) {
        Solution s = new P0429().new Solution();
        //Object ans = s.levelOrder(new TreeNode("[1,null,3,2,4,null,5,6]"));
        //System.out.println(ans);
    }
}