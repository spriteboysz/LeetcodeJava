package leetcode.interview;

import leetcode.common.ListNode;

/**
 * Author: Deean
 * Date: 2023-09-17 14:36
 * FileName: src/main/java/leetcode/interview
 * Description:面试题 02.05. 链表求和
 */

public class M00020005 {
    // code beginning
    class Solution {
        public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
            ListNode dummy = new ListNode(-1);
            ListNode cur = dummy;
            int carry = 0;
            while (l1 != null || l2 != null || carry != 0) {
                int a = 0, b = 0;
                if (l1 != null) {
                    a = l1.val;
                    l1 = l1.next;
                }
                if (l2 != null) {
                    b = l2.val;
                    l2 = l2.next;
                }
                carry += a + b;
                cur.next = new ListNode(carry % 10);
                cur = cur.next;
                carry /= 10;
            }
            return dummy.next;
        }
    }

    public static void main(String[] args) {
        var l1 = new ListNode("[7,1,6]");
        var l2 = new ListNode("[5,9,2]");
        Solution s = new M00020005().new Solution();
        var ans = s.addTwoNumbers(l1, l2);
        System.out.println(ans);
    }
}
