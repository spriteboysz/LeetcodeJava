package leetcode.editor.cn.interview;

import leetcode.editor.cn.common.TreeNode;

/**
 * Author: Deean
 * Date: 2022-08-28 17:10
 * FileName: src/leetcode/editor/cn/interview
 * Description: 面试题 04.12. 求和路径
 */

public class M00040012 {
    // code beginning
    class Solution {
        public int pathSum(TreeNode root, int sum) {
            if (root == null) return 0;
            int count = rootSum(root, sum);
            count += pathSum(root.left, sum) + pathSum(root.right, sum);
            return count;
        }

        private int rootSum(TreeNode root, int sum) {
            int count = 0;
            if (root == null) return 0;
            int val = root.val;
            if (val == sum) count++;
            count += rootSum(root.left, sum - val);
            count += rootSum(root.right, sum - val);
            return count;
        }
    }

    public static void main(String[] args) {
        Solution s = new M00040012().new Solution();
        Object ans = s.pathSum(new TreeNode("[5,4,8,11,null,13,4,7,2,null,null,5,1]"), 22);
        System.out.println(ans);
    }
}