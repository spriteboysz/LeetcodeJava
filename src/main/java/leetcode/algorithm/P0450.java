package leetcode.algorithm;

import leetcode.common.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * Author: Deean
 * Date: 2023-09-16 13:37
 * FileName: src/main/java/leetcode/algorithm
 * Description:450. 删除二叉搜索树中的节点
 */

public class P0450 {
    // code beginning
    class Solution {
        List<Integer> values = new ArrayList<>();

        private void dfs(TreeNode root, int key) {
            if (root == null) return;
            dfs(root.left, key);
            if (root.val != key) {
                values.add(root.val);
            }
            dfs(root.right, key);
        }

        private TreeNode create(int left, int right) {
            if (left >= right) return null;
            int mid = left + ((right - left) >> 1);
            TreeNode root = new TreeNode(values.get(mid));
            root.left = create(left, mid);
            root.right = create(mid + 1, right);
            return root;
        }

        public TreeNode deleteNode(TreeNode root, int key) {
            if (root == null) return null;
            dfs(root, key);
            return create(0, values.size());
        }
    }

    public static void main(String[] args) {
        Solution s = new P0450().new Solution();
        var ans = s.deleteNode(new TreeNode("[5,3,6,2,4,null,7]"), 3);
        System.out.println(ans);
    }
}
