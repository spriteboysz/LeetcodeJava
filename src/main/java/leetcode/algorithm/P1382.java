package leetcode.algorithm;

import leetcode.common.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * Author: Deean
 * Date: 2023-09-13 23:36
 * FileName: src/main/java/leetcode/algorithm
 * Description:1382. 将二叉搜索树变平衡
 */

public class P1382 {
    // code beginning
    class Solution {
        List<Integer> values = new ArrayList<>();

        private void dfs(TreeNode root) {
            if (root == null) return;
            dfs(root.left);
            values.add(root.val);
            dfs(root.right);
        }

        private TreeNode create(int left, int right) {
            if (left >= right) return null;
            int mid = left + ((right - left) >> 1);
            TreeNode root = new TreeNode(values.get(mid));
            root.left = create(left, mid);
            root.right = create(mid + 1, right);
            return root;
        }

        public TreeNode balanceBST(TreeNode root) {
            if (root == null) return null;
            dfs(root);
            System.out.println(values);
            return create(0, values.size());
        }
    }

    public static void main(String[] args) {
        Solution s = new P1382().new Solution();
        var ans = s.balanceBST(new TreeNode("[1,null,2,null,3,null,4,null,null]"));
        System.out.println(ans);
    }
}
