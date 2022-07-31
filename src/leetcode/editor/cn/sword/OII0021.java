package leetcode.editor.cn.sword;

import leetcode.editor.cn.common.ListNode;

/**
 * Author: Deean
 * Date: 2022-07-31 22:20
 * LastEditTime: 2022-07-31 22:20
 * Description: 剑指 Offer II 021. 删除链表的倒数第 n 个结点
 */

public class OII0021 {
    // code beginning
    class Solution {
        public ListNode removeNthFromEnd(ListNode head, int n) {
            ListNode fast = head, slow = head;
            for (int i = 0; i < n; i++) {
                fast = fast.next;
            }
            if (fast == null) return head.next;
            while (fast.next != null) {
                fast = fast.next;
                slow = slow.next;
            }
            slow.next = slow.next.next;
            return head;
        }
    }

    public static void main(String[] args) {
        Solution s = new OII0021().new Solution();
        Object ans = s.removeNthFromEnd(new ListNode(new int[]{1, 2, 3, 4, 5}), 2);
        System.out.println(ans);
    }
}