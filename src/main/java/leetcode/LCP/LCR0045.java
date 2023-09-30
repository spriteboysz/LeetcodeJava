package leetcode.LCP;

import leetcode.common.TreeNode;

import java.util.Deque;
import java.util.LinkedList;

/**
 * Author: Deean
 * Date: 2023-09-29 18:11
 * FileName: src/main/java/leetcode/algorithm
 * Description:LCR 045. 找树左下角的值
 */

public class LCR0045 {
    // code beginning
    class Solution {
        public int findBottomLeftValue(TreeNode root) {
            int bottomLeft = root.val;
            Deque<TreeNode> queue = new LinkedList<>();
            queue.offer(root);
            while (!queue.isEmpty()) {
                for (int i = 0, n = queue.size(); i < n; i++) {
                    var node = queue.poll();
                    assert node != null;
                    if (i == 0) {
                        bottomLeft = node.val;
                    }
                    if (node.left != null) {
                        queue.offer(node.left);
                    }
                    if (node.right != null) {
                        queue.offer(node.right);
                    }
                }
            }
            return bottomLeft;
        }
    }

    public static void main(String[] args) {
        Solution s = new LCR0045().new Solution();
        var ans = s.findBottomLeftValue(new TreeNode("[1,2,3,4,null,5,6,null,null,7]"));
        System.out.println(ans);
    }
}
