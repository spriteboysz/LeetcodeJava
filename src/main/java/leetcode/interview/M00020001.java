package leetcode.interview;

import leetcode.common.ListNode;

import java.util.HashSet;
import java.util.Set;

/**
 * Author: Deean
 * Date: 2022-07-12 23:54
 * LastEditTime: 2022-07-12 23:54
 * Description: 面试题 02.01. 移除重复节点
 */

public class M00020001 {
    // code beginning
    class Solution {
        public ListNode removeDuplicateNodes(ListNode head) {
            if (head == null) return null;
            Set<Integer> set = new HashSet<>();
            set.add(head.val);
            ListNode pre = head;
            while (pre.next != null) {
                ListNode cur = pre.next;
                if (set.add(cur.val)) {
                    pre = pre.next;
                } else {
                    pre.next = pre.next.next;
                }
            }
            return head;
        }
    }

    public static void main(String[] args) {
        Solution s = new M00020001().new Solution();
        Object ans = s.removeDuplicateNodes(new ListNode(new int[]{1, 1, 1, 2}));
        System.out.println(ans);
    }
}