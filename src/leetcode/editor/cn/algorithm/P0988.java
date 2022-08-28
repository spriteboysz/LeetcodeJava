package leetcode.editor.cn.algorithm;

import leetcode.editor.cn.common.TreeNode;

/**
 * Author: Deean
 * Date: 2022-08-28 17:37
 * FileName: src/leetcode/editor/cn/algorithm
 * Description: 988. 从叶结点开始的最小字符串
 */

public class P0988 {
    // code beginning
    class Solution {
        String s = "~";

        public String smallestFromLeaf(TreeNode root) {
            backtrace(root, new StringBuilder());
            return s;
        }

        private void backtrace(TreeNode node, StringBuilder path) {
            if (node == null) return;
            path.append((char) (node.val + 'a'));
            if (node.left == null && node.right == null) {
                path.reverse();
                String t = path.toString();
                path.reverse();
                if (t.compareTo(s) < 0) s = t;
            }
            backtrace(node.left, path);
            backtrace(node.right, path);
            path.deleteCharAt(path.length() - 1);
        }
    }

    public static void main(String[] args) {
        Solution s = new P0988().new Solution();
        Object ans = s.smallestFromLeaf(new TreeNode("[25,1,3,1,3,0,2]"));
        System.out.println(ans);
    }
}