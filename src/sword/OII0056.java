package sword;

import common.TreeNode;

import java.util.HashSet;
import java.util.Set;

/**
 * Author: Deean
 * Date: 2022-07-08 22:28
 * LastEditTime: 2022-07-08 22:28
 * Description: 剑指 Offer II 056. 二叉搜索树中两个节点之和
 */

public class OII0056 {
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
        Solution s = new OII0056().new Solution();
        Object ans = s.findTarget(new TreeNode("[8,6,10,5,7,9,11]"), 22);
        System.out.println(ans);
    }
}