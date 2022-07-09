package leetcode.editor.cn.algorithm;

import leetcode.editor.cn.common.ListNode;

/**
 * Author: Deean
 * Date: 2022-07-09 23:50
 * LastEditTime: 2022-07-09 23:50
 * Description: 876. 链表的中间结点
 */

public class P0876 {
    // code beginning
    class Solution {
        public ListNode middleNode(ListNode head) {
            ListNode fast = head, slow = head;
            while (fast != null && fast.next != null) {
                fast = fast.next.next;
                slow = slow.next;
            }
            return slow;
        }
    }

    public static void main(String[] args) {
        Solution s = new P0876().new Solution();
        Object ans = s.middleNode(new ListNode(new int[]{1, 2, 3, 4, 5}));
        System.out.println(ans);
        ans = s.middleNode(new ListNode(new int[]{1, 2, 3, 4, 5, 6}));
        System.out.println(ans);
    }
}