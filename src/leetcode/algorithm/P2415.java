package leetcode.algorithm;

import leetcode.common.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * Author: Deean
 * Date: 2023-09-08 23:02
 * FileName: src/leetcode/algorithm
 * Description:2415. 反转二叉树的奇数层
 */

public class P2415 {
    // code beginning
    class Solution {
        public TreeNode reverseOddLevels(TreeNode root) {
            Queue<TreeNode> queue = new LinkedList<>();
            List<TreeNode> nodes = new ArrayList<>();
            List<Integer> values = new ArrayList<>();
            int level = 0;
            queue.add(root);
            while (!queue.isEmpty()) {
                nodes.clear();
                values.clear();
                for (int i = 0, n = queue.size(); i < n; i++) {
                    TreeNode node = queue.poll();
                    nodes.add(node);
                    assert node != null;
                    values.add(node.val);
                    if (node.left != null) queue.add(node.left);
                    if (node.right != null) queue.add(node.right);
                }
                if (level % 2 == 1) {
                    for (int i = 0, n = nodes.size(); i < n; i++) {
                        nodes.get(i).val = values.get(n - 1 - i);
                    }
                }
                level++;
            }
            return root;
        }
    }

    public static void main(String[] args) {
        Solution s = new P2415().new Solution();
        var ans = s.reverseOddLevels(new TreeNode("[2,3,5,8,13,21,34]"));
        System.out.println(ans);
    }
}
