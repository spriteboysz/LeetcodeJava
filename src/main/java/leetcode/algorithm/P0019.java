package leetcode.algorithm;

import leetcode.common.ListNode;

/**
 * Author: Deean
 * Date: 2022-07-30 22:45
 * LastEditTime: 2022-07-30 22:45
 * Description: 19. 删除链表的倒数第 N 个结点
 */

public class P0019 {
    // code beginning
    class Solution {
        public ListNode removeNthFromEnd(ListNode head, int n) {
            ListNode fast = head, slow = head;
            for (int i = 0; i < n; i++) {
                fast = fast.next;
            }

            if (fast == null) {
                assert head != null;
                return head.next;
            }
            while (fast.next != null) {
                fast = fast.next;
                slow = slow.next;
            }
            slow.next = slow.next.next;
            return head;
        }
    }

    public static void main(String[] args) {
        Solution s = new P0019().new Solution();
        Object ans = s.removeNthFromEnd(new ListNode(new int[]{1, 2, 3, 4, 5}), 2);
        System.out.println(ans);
    }
}