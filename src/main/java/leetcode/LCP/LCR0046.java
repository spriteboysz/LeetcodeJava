package leetcode.LCP;

import leetcode.common.TreeNode;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

/**
 * Author: Deean
 * Date: 2023-09-29 18:16
 * FileName: src/main/java/leetcode/algorithm
 * Description:LCR 046. 二叉树的右视图
 */

public class LCR0046 {
    // code beginning
    class Solution {
        public List<Integer> rightSideView(TreeNode root) {
            List<Integer> right = new ArrayList<>();
            if (root == null) return right;
            Deque<TreeNode> queue = new LinkedList<>();
            queue.offer(root);
            while (!queue.isEmpty()) {
                int level = 0;
                for (int i = 0, n = queue.size(); i < n; i++) {
                    var node = queue.poll();
                    assert node != null;
                    level = node.val;
                    if (node.left != null) {
                        queue.offer(node.left);
                    }
                    if (node.right != null) {
                        queue.offer(node.right);
                    }
                }
                right.add(level);
            }
            return right;
        }
    }

    public static void main(String[] args) {
        Solution s = new LCR0046().new Solution();
        var ans = s.rightSideView(new TreeNode("[1,2,3,null,5,null,4]"));
        System.out.println(ans);
    }
}
