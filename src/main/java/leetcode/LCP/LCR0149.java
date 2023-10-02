package leetcode.LCP;

import leetcode.common.TreeNode;

import java.util.*;

/**
 * Author: Deean
 * Date: 2023-09-30 15:41
 * FileName: src/main/java/leetcode/LCP
 * Description:LCR 149. 彩灯装饰记录 I
 */

public class LCR0149 {
    // code beginning
    class Solution {
        public int[] decorateRecord(TreeNode root) {
            List<Integer> levels = new ArrayList<>();
            if (root == null) return new int[]{};
            Deque<TreeNode> queue = new LinkedList<>();
            queue.offer(root);
            while (!queue.isEmpty()) {
                for (int i = 0, n = queue.size(); i < n; i++) {
                    var node = queue.poll();
                    assert node != null;
                    levels.add(node.val);
                    if (node.left!=null){
                        queue.offer(node.left);
                    }
                    if (node.right != null) {
                        queue.offer(node.right);
                    }
                }
            }
            int[] level = new int[levels.size()];
            for (int i = 0, n = levels.size(); i < n; i++) {
                level[i] = levels.get(i);
            }
            return level;
        }
    }

    public static void main(String[] args) {
        Solution s = new LCR0149().new Solution();
        var ans = s.decorateRecord(new TreeNode("[8,17,21,18,null,null,6]"));
        System.out.println(Arrays.toString(ans));
    }
}
