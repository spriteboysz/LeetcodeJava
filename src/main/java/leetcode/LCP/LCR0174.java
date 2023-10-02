package leetcode.LCP;

import leetcode.common.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * Author: Deean
 * Date: 2023-10-01 17:52
 * FileName: src/main/java/leetcode/LCP
 * Description:LCR 174. 寻找二叉搜索树中的目标节点
 */

public class LCR0174 {
    // code beginning
    class Solution {
        List<Integer> values = new ArrayList<>();

        private void dfs(TreeNode root) {
            if (root == null) return;
            dfs(root.left);
            values.add(root.val);
            dfs(root.right);
        }

        public int findTargetNode(TreeNode root, int cnt) {
            dfs(root);
            return values.get(values.size() - cnt);
        }
    }

    public static void main(String[] args) {
        Solution s = new LCR0174().new Solution();
        var ans = s.findTargetNode(new TreeNode("[7,3,9,1,5]"), 2);
        System.out.println(ans);
    }
}
