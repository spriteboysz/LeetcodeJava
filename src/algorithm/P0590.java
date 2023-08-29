package algorithm;

import common.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * Author: Deean
 * Date: 2022-07-06 23:25
 * LastEditTime: 2022-07-06 23:25
 * Description: 590. N 叉树的后序遍历
 */

public class P0590 {
    // code beginning
    class Solution {
        List<Integer> values = new ArrayList<>();

        public List<Integer> postorder(TreeNode root) {
            if (root == null) return values;
            dfs(root);
            return values;
        }

        private void dfs(TreeNode node) {
            for (TreeNode n : node.children) {
                dfs(n);
            }
            values.add(node.val);
        }
    }

    public static void main(String[] args) {
        Solution s = new P0590().new Solution();
        System.out.println(s.postorder(new TreeNode("[1,2,3]")));
    }
}