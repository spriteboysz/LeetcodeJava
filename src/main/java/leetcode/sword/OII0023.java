package leetcode.sword;

import leetcode.common.ListNode;

import java.util.HashSet;
import java.util.Set;

/**
 * Author: Deean
 * Date: 2022-07-15 21:51
 * LastEditTime: 2022-07-15 21:51
 * Description: 剑指 Offer II 023. 两个链表的第一个重合节点
 */

public class OII0023 {
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
        Solution s = new OII0023().new Solution();
        Object ans = s.getIntersectionNode(new ListNode(new int[]{0, 9, 1, 2, 4}), new ListNode(new int[]{3, 2, 4}));
        System.out.println(ans);
    }
}