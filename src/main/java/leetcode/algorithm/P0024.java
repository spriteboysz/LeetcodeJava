package leetcode.algorithm;

import leetcode.common.ListNode;

import java.util.ArrayList;
import java.util.List;

/**
 * Author: Deean
 * Date: 2023-09-16 20:02
 * FileName: src/main/java/leetcode/algorithm
 * Description:24. 两两交换链表中的节点
 */

public class P0024 {
    // code beginning
    class Solution {
        public ListNode swapPairs(ListNode head) {
            if (head == null || head.next == null) return head;
            List<ListNode> nodes = new ArrayList<>();
            while (head != null) {
                nodes.add(head);
                head = head.next;
            }
            for (int i = 0, n = nodes.size(); i + 2 <= n; i += 2) {
                var node = nodes.get(i);
                nodes.set(i, nodes.get(i + 1));
                nodes.set(i + 1, node);
            }
            for (int i = 0, n = nodes.size(); i < n - 1; i++) {
                nodes.get(i).next = nodes.get(i + 1);
            }
            nodes.get(nodes.size() - 1).next = null;
            return nodes.get(0);
        }
    }

    public static void main(String[] args) {
        Solution s = new P0024().new Solution();
        var ans = s.swapPairs(new ListNode("[1,2,3,4]"));
        System.out.println(ans);
    }
}
