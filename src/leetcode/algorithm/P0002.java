package leetcode.algorithm;

import leetcode.common.ListNode;

/**
 * Author: Deean
 * Date: 2022-08-02 22:56
 * LastEditTime: 2022-08-02 22:56
 * Description: 2. 两数相加
 */

public class P0002 {
    // code beginning
    class Solution {
        public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
            ListNode head = null, cur = null;
            int carry = 0;
            while (l1 != null || l2 != null) {
                int n1 = l1 != null ? l1.val : 0;
                int n2 = l2 != null ? l2.val : 0;
                int sum = n1 + n2 + carry;
                if (head == null) {
                    head = cur = new ListNode(sum % 10);
                } else {
                    cur.next = new ListNode(sum % 10);
                    cur = cur.next;
                }
                carry = sum / 10;
                if (l1 != null) l1 = l1.next;
                if (l2 != null) l2 = l2.next;
            }
            if (carry > 0) cur.next = new ListNode(carry);
            return head;
        }
    }

    public static void main(String[] args) {
        Solution s = new P0002().new Solution();
        Object ans = s.addTwoNumbers(new ListNode(new int[]{9, 9, 9, 9, 9, 9, 9}), new ListNode(new int[]{9, 9, 9, 9, 9, 9, 9}));
        System.out.println(ans);
    }
}