package leetcode.editor.cn.interview;

import leetcode.editor.cn.common.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * Author: Deean
 * Date: 2022-08-28 16:52
 * FileName: src/leetcode/editor/cn/interview
 * Description: 面试题 04.05. 合法二叉搜索树
 */

public class M00040005 {
    // code beginning
    class Solution {
        List<Integer> values = new ArrayList<>();

        public boolean isValidBST(TreeNode root) {
            dfs(root);
            for (int i = 1; i < values.size(); i++) {
                if (values.get(i) <= values.get(i - 1)) return false;
            }
            return true;
        }

        private void dfs(TreeNode root) {
            if (root == null) return;
            dfs(root.left);
            values.add(root.val);
            dfs(root.right);
        }
    }

    public static void main(String[] args) {
        Solution s = new M00040005().new Solution();
        Object ans = s.isValidBST(new TreeNode("[5,1,4,null,null,3,6]"));
        System.out.println(ans);
    }
}