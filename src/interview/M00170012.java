package interview;

import common.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * Author: Deean
 * Date: 2022-07-10 22:37
 * LastEditTime: 2022-07-10 22:37
 * Description: 面试题 17.12. BiNode
 */

public class M00170012 {
    // code beginning
    class Solution {
        List<Integer> values = new ArrayList<>();

        public TreeNode convertBiNode(TreeNode root) {
            dfs(root);
            TreeNode dummy = new TreeNode(-1);
            TreeNode cur = dummy;
            for (int value : values) {
                cur.right = new TreeNode(value);
                cur = cur.right;
            }
            return dummy.right;
        }

        private void dfs(TreeNode node) {
            if (node == null) return;
            dfs(node.left);
            values.add(node.val);
            dfs(node.right);
        }
    }

    public static void main(String[] args) {
        Solution s = new M00170012().new Solution();
        Object ans = s.convertBiNode(new TreeNode("[4,2,5,1,3,null,6,0]"));
        System.out.println(ans);
    }
}