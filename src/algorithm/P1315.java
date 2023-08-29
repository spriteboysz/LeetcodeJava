package algorithm;

import common.TreeNode;

/**
 * Author: Deean
 * Date: 2022-07-19 23:03
 * LastEditTime: 2022-07-19 23:03
 * Description: 1315. 祖父节点值为偶数的节点和
 */

public class P1315 {
    // code beginning
    class Solution {
        public int sumEvenGrandparent(TreeNode root) {
            int sum = 0;
            if (root == null) return sum;
            if (root.val % 2 == 0) {
                if (root.left != null) {
                    if (root.left.left != null) sum += root.left.left.val;
                    if (root.left.right != null) sum += root.left.right.val;
                }
                if (root.right != null) {
                    if (root.right.left != null) sum += root.right.left.val;
                    if (root.right.right != null) sum += root.right.right.val;
                }
            }
            return sum + sumEvenGrandparent(root.left) + sumEvenGrandparent(root.right);
        }
    }

    public static void main(String[] args) {
        Solution s = new P1315().new Solution();
        Object ans = s.sumEvenGrandparent(new TreeNode("[6,7,8,2,7,1,3,9,null,1,4,null,null,null,5]"));
        System.out.println(ans);
    }
}