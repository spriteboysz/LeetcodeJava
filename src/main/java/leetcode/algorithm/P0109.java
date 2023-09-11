package leetcode.algorithm;

import leetcode.common.ListNode;
import leetcode.common.TreeNode;

/**
 * Author: Deean
 * Date: 2022-08-26 22:45
 * FileName: src/leetcode/editor/cn/leetcode.algorithm
 * Description: 109. 有序链表转换二叉搜索树
 */

public class P0109 {
    // code beginning
    class Solution {
        private ListNode inOrderNode = null;

        public TreeNode sortedListToBST(ListNode head) {
            inOrderNode = head;
            int n = 0;
            while (inOrderNode != null) {
                inOrderNode = inOrderNode.next;
                n++;
            }
            inOrderNode = head;
            return createBST(0, n - 1);
        }

        private TreeNode createBST(int start, int end) {
            if (start > end) return null;
            int mid = (start + end) / 2;
            TreeNode root = new TreeNode();
            root.left = createBST(start, mid - 1);
            root.val = inOrderNode.val;
            inOrderNode = inOrderNode.next;
            root.right = createBST(mid + 1, end);
            return root;
        }
    }

    public static void main(String[] args) {
        Solution s = new P0109().new Solution();
        Object ans = s.sortedListToBST(new ListNode(new int[]{-10, -3, 0, 5, 9}));
        System.out.println(ans);
    }
}