package leetcode.algorithm;

import leetcode.common.ListNode;

import java.util.HashSet;
import java.util.Set;

/**
 * Author: Deean
 * Date: 2022-08-09 23:38
 * FileName: src/leetcode/editor/cn/leetcode.algorithm
 * Description: 141. 环形链表
 */

public class P0141 {
    // code beginning
    class Solution {
        public boolean hasCycle(ListNode head) {
            Set<ListNode> nodes = new HashSet<>();
            ListNode cur = head;
            while (cur != null) {
                if (nodes.contains(cur)) return true;
                nodes.add(cur);
                cur = cur.next;
            }
            return false;
        }
    }

    public static void main(String[] args) {
        Solution s = new P0141().new Solution();
        Object ans = s.hasCycle(new ListNode(new int[]{3, 2, 0, -4}));
        System.out.println(ans);
    }
}