package sword;

import common.ListNode;

/**
 * Author: Deean
 * Date: 2022-07-02 22:09
 * LastEditTime: 2022-07-02 22:09
 * Description: 剑指 Offer 22. 链表中倒数第k个节点
 */

public class O0022 {
    // code beginning
    class Solution {
        public ListNode getKthFromEnd(ListNode head, int k) {
            ListNode fast = head, slow = head;
            while (fast != null && k > 0) {
                fast = fast.next;
                k--;
            }
            while (fast != null) {
                fast = fast.next;
                slow = slow.next;
            }
            return slow;
        }
    }

    public static void main(String[] args) {
        Solution s = new O0022().new Solution();
        Object ans = s.getKthFromEnd(new ListNode(new int[]{1, 2, 3, 4, 5}), 2);
        System.out.println(ans);
    }
}