package leetcode.editor.cn.algorithm;

import leetcode.editor.cn.common.ListNode;

/**
 * Author: Deean
 * Date: 2022-07-16 10:37
 * LastEditTime: 2022-07-16 10:37
 * Description: 203. 移除链表元素
 */

public class P0203 {
    // code beginning
    class Solution {
        public ListNode removeElements(ListNode head, int val) {
            ListNode dummy = new ListNode(-1);
            dummy.next = head;
            ListNode temp = dummy;
            while (temp.next != null) {
                if (temp.next.val == val) {
                    temp.next = temp.next.next;
                } else {
                    temp = temp.next;
                }
            }
            return dummy.next;
        }
    }

    public static void main(String[] args) {
        Solution s = new P0203().new Solution();
        Object ans = s.removeElements(new ListNode(new int[]{1, 2, 3, 4, 5, 6}), 6);
        System.out.println(ans);
        ans = s.removeElements(new ListNode(new int[0]), 1);
        System.out.println(ans);
        ans = s.removeElements(new ListNode(new int[]{7, 7, 7, 7, 7, 7}), 7);
        System.out.println(ans);
    }
}