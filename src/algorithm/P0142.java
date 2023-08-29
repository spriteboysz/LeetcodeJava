package algorithm;

import common.ListNode;

import java.util.HashSet;
import java.util.Set;

/**
 * Author: Deean
 * Date: 2022-08-09 23:47
 * FileName: src/leetcode/editor/cn/algorithm
 * Description: 142. 环形链表 II
 */

public class P0142 {
    // code beginning
    class Solution {
        public ListNode detectCycle(ListNode head) {
            if (head == null) return null;
            Set<ListNode> nodes = new HashSet<>();
            ListNode cur = head;
            while (cur != null) {
                if (nodes.contains(cur)) return cur;
                nodes.add(cur);
                cur = cur.next;
            }
            return null;
        }
    }

    public static void main(String[] args) {
        Solution s = new P0142().new Solution();
        Object ans = s.detectCycle(new ListNode(new int[]{3, 2, 0, -4}));
        System.out.println(ans);
    }
}