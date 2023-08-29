package algorithm;

import common.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * Author: Deean
 * Date: 2022-08-19 21:53
 * FileName: src/leetcode/editor/cn/algorithm
 * Description: 257. 二叉树的所有路径
 */

public class P0257 {
    // code beginning
    class Solution {
        public List<String> binaryTreePaths(TreeNode root) {
            List<String> paths = new ArrayList<>();
            dfs(root, "", paths);
            return paths;
        }

        private void dfs(TreeNode root, String path, List<String> paths) {
            if (root == null) return;
            StringBuilder builder = new StringBuilder(path);
            builder.append(root.val);
            if (root.left == null && root.right == null) {
                paths.add(builder.toString());
            } else {
                builder.append("->");
                dfs(root.left, builder.toString(), paths);
                dfs(root.right, builder.toString(), paths);
            }
        }
    }

    public static void main(String[] args) {
        Solution s = new P0257().new Solution();
        Object ans = s.binaryTreePaths(new TreeNode("[1,2,3,null,5]"));
        System.out.println(ans);
    }
}