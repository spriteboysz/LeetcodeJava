package leetcode.editor.cn.algorithm;

import leetcode.editor.cn.common.ListNode;

/**
 * Author: Deean
 * Date: 2022-07-10 16:05
 * LastEditTime: 2022-07-10 16:05
 * Description: 206. 反转链表
 */

public class P0206 {
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
        Solution s = new P0206().new Solution();
        Object ans = s.reverseList(new ListNode(new int[]{1, 2, 3, 4, 5}));
        System.out.println(ans);
    }
}