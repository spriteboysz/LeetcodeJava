package leetcode.algorithm;

import leetcode.common.ListNode;

/**
 * Author: Deean
 * Date: 2023-09-16 14:18
 * FileName: src/main/java/leetcode/algorithm
 * Description:328. 奇偶链表
 */

public class P0328 {
    // code beginning
    class Solution {
        public ListNode oddEvenList(ListNode head) {
            if (head == null) return null;
            ListNode evenhead = head.next;
            ListNode odd = head, even = evenhead;
            while (even != null && even.next != null) {
                odd.next = even.next;
                odd = odd.next;
                even.next = odd.next;
                even = even.next;
            }
            odd.next = evenhead;
            return head;
        }
    }

    public static void main(String[] args) {
        Solution s = new P0328().new Solution();
        var ans = s.oddEvenList(new ListNode("[1,2,3,4,5]"));
        System.out.println(ans);
    }
}
