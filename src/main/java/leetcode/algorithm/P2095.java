package leetcode.algorithm;

import leetcode.common.ListNode;

/**
 * Author: Deean
 * Date: 2023-09-10 11:30
 * FileName: src/leetcode/algorithm
 * Description:2095. 删除链表的中间节点
 */

public class P2095 {
    // code beginning
    class Solution {
        public ListNode deleteMiddle(ListNode head) {
            if (head == null || head.next == null) return null;
            ListNode slow = head;
            ListNode fast = head.next;
            while (fast.next != null && fast.next.next != null) {
                slow = slow.next;
                fast = fast.next.next;
            }
            slow.next = slow.next.next;
            return head;
        }
    }

    public static void main(String[] args) {
        Solution s = new P2095().new Solution();
        var ans = s.deleteMiddle(new ListNode("[1,3,4,7,1,2,6]"));
        System.out.println(ans);
    }
}
