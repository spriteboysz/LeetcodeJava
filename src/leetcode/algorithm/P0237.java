package leetcode.algorithm;

import leetcode.common.ListNode;

/**
 * Author: Deean
 * Date: 2022-06-26 22:45
 * LastEditTime: 2022-06-26 22:45
 * Description: 237. 删除链表中的节点
 */

public class P0237 {
    // code beginning
    class Solution {
        public void deleteNode(ListNode node) {
            node.val = node.next.val;
            node.next = node.next.next;
        }
    }

    public static void main(String[] args) {
        Solution s = new P0237().new Solution();
        s.deleteNode(new ListNode(5));
    }
}