package leetcode.algorithm;

import leetcode.common.ListNode;

/**
 * Author: Deean
 * Date: 2022-06-26 11:19
 * LastEditTime: 2022-06-26 11:19
 * Description: 21. 合并两个有序链表
 */

public class P0021 {
    // code beginning
    class Solution {
        public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
            if (list1 == null) {
                return list2;
            } else if (list2 == null) {
                return list1;
            } else if (list1.val < list2.val) {
                list1.next = mergeTwoLists(list1.next, list2);
                return list1;
            } else {
                list2.next = mergeTwoLists(list1, list2.next);
                return list2;
            }
        }
    }

    public static void main(String[] args) {
        Solution s = new P0021().new Solution();
        ListNode list1 = new ListNode(new int[]{1, 2, 4}), list2 = new ListNode(new int[]{1, 3, 4});
        Object ans = s.mergeTwoLists(list1, list2);
        System.out.println(ans);
    }
}