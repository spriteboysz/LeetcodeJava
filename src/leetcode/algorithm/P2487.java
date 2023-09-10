package leetcode.algorithm;

import leetcode.common.ListNode;

import java.util.ArrayList;
import java.util.List;

/**
 * Author: Deean
 * Date: 2023-09-08 22:05
 * FileName: src/leetcode/algorithm
 * Description:2487. 从链表中移除节点
 */

public class P2487 {
    // code beginning
    class Solution {
        public ListNode removeNodes(ListNode head) {
            if (head.next == null) return head;
            List<ListNode> nodes = new ArrayList<>();
            while (head != null) {
                nodes.add(head);
                head = head.next;
            }
            int maximum = nodes.get(nodes.size() - 1).val;
            for (int i = nodes.size() - 2; i >= 0; i--) {
                if (nodes.get(i).val >= maximum) {
                    maximum = nodes.get(i).val;
                } else {
                    nodes.remove(i);
                }
            }
            for (int i = 1, n = nodes.size(); i < n; i++) {
                nodes.get(i - 1).next = nodes.get(i);
            }
            nodes.get(nodes.size() - 1).next = null;
            return nodes.get(0);
        }
    }

    public static void main(String[] args) {
        Solution s = new P2487().new Solution();
        var ans = s.removeNodes(new ListNode("[5,2,13,3,8]"));
        System.out.println(ans);
    }
}
