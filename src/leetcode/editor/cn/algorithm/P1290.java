package leetcode.editor.cn.algorithm;

import leetcode.editor.cn.common.ListNode;

/**
 * Author: Deean
 * Date: 2022-07-01 23:09
 * LastEditTime: 2022-07-01 23:09
 * Description: 1290. 二进制链表转整数
 */

public class P1290 {
    // code beginning
    class Solution {
        public int getDecimalValue(ListNode head) {
            int value = 0;
            while (head != null) {
                value = value << 1;
                value += head.val;
                head = head.next;
            }
            return value;
        }
    }

    public static void main(String[] args) {
        Solution s = new P1290().new Solution();
        Object ans = s.getDecimalValue(new ListNode(new int[]{1, 0, 0, 1, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0}));
        System.out.println(ans); // 18880
    }
}