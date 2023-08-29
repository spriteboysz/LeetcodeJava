package sword;

import common.ListNode;

/**
 * Author: Deean
 * Date: 2022-07-10 23:14
 * LastEditTime: 2022-07-10 23:14
 * Description: 剑指 Offer 18. 删除链表的节点
 */

public class O0018 {
    // code beginning
    class Solution {
        public ListNode deleteNode(ListNode head, int val) {
            if (head.val == val) return head.next;
            ListNode pre = head;
            while ((pre.next != null) && (pre.next.val != val)) {
                pre = pre.next;
            }

            if (pre.next != null) {
                pre.next = pre.next.next;
            }
            return head;
        }
    }

    public static void main(String[] args) {
        Solution s = new O0018().new Solution();
        Object ans = s.deleteNode(new ListNode(new int[]{4, 5, 1, 9}), 1);
        System.out.println(ans);
    }
}