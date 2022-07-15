package leetcode.editor.cn.algorithm;

import leetcode.editor.cn.common.ListNode;

import java.util.HashSet;
import java.util.Set;

/**
 * Author: Deean
 * Date: 2022-07-15 23:44
 * LastEditTime: 2022-07-15 23:44
 * Description: 160. 相交链表
 */

public class P0160 {
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
        Solution s = new P0160().new Solution();
        Object ans = s.getIntersectionNode(new ListNode(new int[]{4, 1, 8, 4, 5}), new ListNode(new int[]{5, 0, 1, 8, 4,
                5}));
        System.out.println(ans);
    }
}