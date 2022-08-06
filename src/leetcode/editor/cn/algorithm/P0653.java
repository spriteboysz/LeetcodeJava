package leetcode.editor.cn.algorithm;

import leetcode.editor.cn.common.TreeNode;

import java.util.HashSet;
import java.util.Set;

/**
 * Author: Deean
 * Date: 2022-08-06 08:28
 * Description: 653. 两数之和 IV - 输入 BST
 */

public class P0653 {
    // code beginning
    class Solution {
        Set<Integer> set = new HashSet<>();

        public boolean findTarget(TreeNode root, int k) {
            if (root == null) return false;
            if (set.contains(k - root.val)) return true;
            set.add(root.val);
            return findTarget(root.left, k) || findTarget(root.right, k);
        }
    }

    public static void main(String[] args) {
        Solution s = new P0653().new Solution();
        Object ans = s.findTarget(new TreeNode("[5,3,6,2,4,null,7]"), 9);
        System.out.println(ans);
    }
}