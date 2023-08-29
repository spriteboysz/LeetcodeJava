package sword;

import common.ListNode;

import java.util.HashSet;
import java.util.Set;

/**
 * Author: Deean
 * Date: 2022-07-31 22:27
 * LastEditTime: 2022-07-31 22:27
 * Description: 剑指 Offer II 022. 链表中环的入口节点
 */

public class OII0022 {
    // code beginning
    class Solution {
        public ListNode detectCycle(ListNode head) {
            Set<ListNode> set = new HashSet<>();
            while (head != null) {
                if (set.contains(head)) {
                    return head;
                } else {
                    set.add(head);
                }
                head = head.next;
            }
            return null;
        }
    }

    public static void main(String[] args) {
        Solution s = new OII0022().new Solution();
        Object ans = s.detectCycle(new ListNode(new int[]{3, 2, 0, -4}));
        System.out.println(ans);
    }
}