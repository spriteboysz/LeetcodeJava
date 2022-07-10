package leetcode.editor.cn.sword;

import leetcode.editor.cn.common.ListNode;

/**
 * Author: Deean
 * Date: 2022-07-10 16:09
 * LastEditTime: 2022-07-10 16:09
 * Description: 剑指 Offer 25. 合并两个排序的链表
 */

public class O0025 {
    // code beginning
    class Solution {
        public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
            if (l1 == null) return l2;
            if (l2 == null) return l1;
            if (l1.val < l2.val) {
                l1.next = mergeTwoLists(l1.next, l2);
                return l1;
            } else {
                l2.next = mergeTwoLists(l1, l2.next);
                return l2;
            }
        }
    }

    public static void main(String[] args) {
        Solution s = new O0025().new Solution();
        Object ans = s.mergeTwoLists(new ListNode(new int[]{1, 2, 4}), new ListNode(new int[]{1, 3, 4}));
        System.out.println(ans);
    }
}