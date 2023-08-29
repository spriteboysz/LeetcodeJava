package algorithm;

import common.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Author: Deean
 * Date: 2022-07-18 23:41
 * LastEditTime: 2022-07-18 23:41
 * Description: 1302. 层数最深叶子节点的和
 */

public class P1302 {
    // code beginning
    class Solution {
        public int deepestLeavesSum(TreeNode root) {
            int lastSum = 0;
            if (root == null) return 0;
            Queue<TreeNode> queue = new LinkedList<>();
            queue.offer(root);
            while (!queue.isEmpty()) {
                int sum = 0, size = queue.size();
                for (int i = 0; i < size; i++) {
                    TreeNode node = queue.poll();
                    assert node != null;
                    sum += node.val;
                    if (node.left != null) queue.offer(node.left);
                    if (node.right != null) queue.offer(node.right);
                }
                lastSum = sum;
            }
            return lastSum;
        }
    }

    public static void main(String[] args) {
        Solution s = new P1302().new Solution();
        Object ans = s.deepestLeavesSum(new TreeNode("[6,7,8,2,7,1,3,9,null,1,4,null,null,null,5]"));
        System.out.println(ans);
    }
}