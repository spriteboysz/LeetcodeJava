package leetcode.algorithm;

import leetcode.common.TreeNode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Author: Deean
 * Date: 2023-09-16 08:44
 * FileName: src/main/java/leetcode/algorithm
 * Description:701. 二叉搜索树中的插入操作
 */

public class P0701 {
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

        public TreeNode insertIntoBST(TreeNode root, int val) {
            dfs(root);
            values.add(val);
            Collections.sort(values);
            return create(0, values.size());
        }
    }

    public static void main(String[] args) {
        Solution s = new P0701().new Solution();
        var ans = s.insertIntoBST(new TreeNode("[40,20,60,10,30,50,70]"), 25);
        System.out.println(ans);
    }
}
