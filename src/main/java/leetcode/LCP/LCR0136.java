package leetcode.LCP;

import leetcode.common.ListNode;

import java.util.ArrayList;
import java.util.List;

/**
 * Author: Deean
 * Date: 2023-09-30 17:15
 * FileName: src/main/java/leetcode/LCP
 * Description:LCR 136. 删除链表的节点
 */

public class LCR0136 {
    // code beginning
    class Solution {
        public ListNode deleteNode(ListNode head, int val) {
            if (head == null) return null;
            List<ListNode> nodes = new ArrayList<>();
            while (head != null) {
                if (head.val != val) {
                    nodes.add(head);
                }
                head = head.next;
            }
            if (nodes.isEmpty()) return null;
            for (int i = 0, n = nodes.size(); i < n - 1; i++) {
                nodes.get(i).next = nodes.get(i + 1);
            }
            nodes.get(nodes.size() - 1).next = null;
            return nodes.get(0);
        }
    }

    public static void main(String[] args) {
        Solution s = new LCR0136().new Solution();
        var ans = s.deleteNode(new ListNode("[4,5,1,9]"), 5);
        System.out.println(ans);
    }
}
