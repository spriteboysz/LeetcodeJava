package algorithm;

import common.ListNode;

/**
 * Author: Deean
 * Date: 2022-08-26 22:25
 * FileName: src/leetcode/editor/cn/algorithm
 * Description: 92. 反转链表 II
 */

public class P0092 {
    // code beginning
    class Solution {
        public ListNode reverseBetween(ListNode head, int left, int right) {
            ListNode dummy = new ListNode(0);
            dummy.next = head;

            right -= left;
            ListNode hh = dummy;
            while (left-- > 1) hh = hh.next;

            ListNode a = hh.next, b = a.next;
            while (right-- > 0) {
                ListNode tmp = b.next;
                b.next = a;
                a = b;
                b = tmp;
            }

            hh.next.next = b;
            hh.next = a;
            return dummy.next;
        }
    }

    public static void main(String[] args) {
        Solution s = new P0092().new Solution();
        Object ans = s.reverseBetween(new ListNode(new int[]{1, 2, 3, 4, 5}), 2, 4);
        System.out.println(ans);
    }
}