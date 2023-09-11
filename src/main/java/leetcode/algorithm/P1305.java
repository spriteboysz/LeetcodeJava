package leetcode.algorithm;

import leetcode.common.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * Author: Deean
 * Date: 2022-07-17 17:39
 * LastEditTime: 2022-07-17 17:39
 * Description: 1305. 两棵二叉搜索树中的所有元素
 */

public class P1305 {
    // code beginning
    class Solution {
        public List<Integer> getAllElements(TreeNode root1, TreeNode root2) {
            List<Integer> value = new ArrayList<>();
            List<Integer> value1 = new ArrayList<>(), value2 = new ArrayList<>();
            dfs(root1, value1);
            dfs(root2, value2);
            int i = 0, j = 0, n1 = value1.size(), n2 = value2.size();
            while (i < n1 || j < n2) {
                int a = i < n1 ? value1.get(i) : Integer.MAX_VALUE;
                int b = j < n2 ? value2.get(j) : Integer.MAX_VALUE;
                if (a <= b) {
                    value.add(a);
                    i++;
                } else {
                    value.add(b);
                    j++;
                }
            }
            return value;
        }

        private void dfs(TreeNode node, List<Integer> value) {
            if (node == null) return;
            dfs(node.left, value);
            value.add(node.val);
            dfs(node.right, value);
        }
    }

    public static void main(String[] args) {
        Solution s = new P1305().new Solution();
        Object ans = s.getAllElements(new TreeNode("[1,null,8]"), new TreeNode("[8,1]"));
        System.out.println(ans);
    }
}