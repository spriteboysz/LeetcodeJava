package leetcode.LCP;

import leetcode.common.ListNode;

/**
 * Author: Deean
 * Date: 2023-09-28 22:31
 * FileName: src/main/java/leetcode/LCP
 * Description:LCR 021. 删除链表的倒数第 N 个结点
 */

public class LCR0021 {
    // code beginning
    class Solution {
        public ListNode removeNthFromEnd(ListNode head, int n) {
            ListNode dummy = new ListNode(0, head);
            ListNode fast = head, slow = dummy;
            while (n > 0) {
                fast = fast.next;
                n--;
            }
            while (fast != null) {
                fast = fast.next;
                slow = slow.next;
            }
            slow.next = slow.next.next;
            return dummy.next;
        }
    }

    public static void main(String[] args) {
        Solution s = new LCR0021().new Solution();
        var ans = s.removeNthFromEnd(new ListNode("[1,2,3,4,5]"), 2);
        System.out.println(ans);
    }
}
