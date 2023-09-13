package leetcode.algorithm;

import leetcode.common.ListNode;

/**
 * Author: Deean
 * Date: 2023-09-12 22:58
 * FileName: src/main/java/leetcode/algorithm
 * Description:1669. 合并两个链表
 */

public class P1669 {
    // code beginning
    class Solution {
        public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
            ListNode pref1 = list1;
            for (int i = 0; i < a - 1; i++) {
                pref1 = pref1.next;
            }
            ListNode pref2 = pref1;
            for (int i = 0; i < b - a + 2; i++) {
                pref2 = pref2.next;
            }
            pref1.next = list2;
            while (list2.next != null) {
                list2 = list2.next;
            }
            list2.next = pref2;
            return list1;
        }
    }

    public static void main(String[] args) {
        Solution s = new P1669().new Solution();
        ListNode list1 = new ListNode("[0,1,2,3,4,5]");
        ListNode list2 = new ListNode("[1000000,1000001,1000002]");
        var ans = s.mergeInBetween(list1, 3, 4, list2);
        System.out.println(ans);
    }
}
