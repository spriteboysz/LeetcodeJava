package leetcode.algorithm;

import leetcode.common.ListNode;

/**
 * Author: Deean
 * Date: 2022-06-26 10:19
 * LastEditTime: 2022-06-26 10:19
 * Description: .
 */

public class P0083 {
    // code beginning
    class Solution {
        public ListNode deleteDuplicates(ListNode head) {
            if (head == null) return null;
            ListNode cur = head;
            while (cur.next != null) {
                if (cur.val == cur.next.val) {
                    cur.next = cur.next.next;
                } else {
                    cur = cur.next;
                }
            }
            return head;
        }
    }

    public static void main(String[] args) {
        Solution s = new P0083().new Solution();
        Object ans = s.deleteDuplicates(new ListNode(new int[]{1, 2, 2, 3}));
        System.out.println(ans);
    }
}