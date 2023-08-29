package sword;

import common.ListNode;

/**
 * Author: Deean
 * Date: 2022-07-10 11:46
 * LastEditTime: 2022-07-10 11:46
 * Description: 剑指 Offer 24. 反转链表
 */

public class O0024 {
    // code beginning
    class Solution {
        public ListNode reverseList(ListNode head) {
            ListNode pre = null, cur = head;
            while (cur != null) {
                ListNode next = cur.next;
                cur.next = pre;
                pre = cur;
                cur = next;
            }
            return pre;
        }
    }

    public static void main(String[] args) {
        Solution s = new O0024().new Solution();
        Object ans = s.reverseList(new ListNode(new int[]{1, 2, 3, 4, 5}));
        System.out.println(ans);
    }
}