package leetcode.interview;

import leetcode.common.ListNode;

import java.util.HashSet;
import java.util.Set;

/**
 * Author: Deean
 * Date: 2022-07-15 22:58
 * LastEditTime: 2022-07-15 22:58
 * Description: 面试题 02.07. 链表相交
 */

public class M00020007 {
    // code beginning
    class Solution {
        public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
            Set<ListNode> set = new HashSet<>();
            ListNode cur = headA;
            while (cur != null) {
                set.add(cur);
                cur = cur.next;
            }
            cur = headB;
            while (cur != null) {
                if (set.contains(cur)) {
                    return cur;
                }
                cur = cur.next;
            }
            return null;
        }
    }

    public static void main(String[] args) {
        Solution s = new M00020007().new Solution();
        Object ans = s.getIntersectionNode(new ListNode(new int[]{4, 1, 8, 4, 5}), new ListNode(new int[]{5, 0, 1, 8, 4,
                5}));
        System.out.println(ans);
    }
}