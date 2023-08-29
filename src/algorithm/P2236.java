package algorithm;

import common.TreeNode;

/**
 * Author: Deean
 * Date: 2022-06-29 22:27
 * LastEditTime: 2022-06-29 22:27
 * Description: 2236. 判断根结点是否等于子结点之和
 */

public class P2236 {
    // code beginning
    class Solution {
        public boolean checkTree(TreeNode root) {
            return root.val == root.left.val + root.right.val;
        }
    }

    public static void main(String[] args) {
        Solution s = new P2236().new Solution();
        Object ans = s.checkTree(null);
        System.out.println(ans);
    }
}