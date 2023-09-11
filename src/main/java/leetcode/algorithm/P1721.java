package leetcode.algorithm;

import leetcode.common.ListNode;

import java.util.ArrayList;
import java.util.List;

/**
 * Author: Deean
 * Date: 2023-09-11 23:38
 * FileName: src/leetcode/common
 * Description:1721. 交换链表中的节点
 */

public class P1721 {
    // code beginning
    class Solution {
        public ListNode swapNodes(ListNode head, int k) {
            List<ListNode> nodes = new ArrayList<>();
            while (head != null) {
                nodes.add(head);
                head = head.next;
            }
            int n = nodes.size();
            var node = nodes.get(k - 1);
            nodes.set(k - 1, nodes.get(n - k));
            nodes.set(n - k, node);
            for (int i = 1; i < n; i++) {
                nodes.get(i - 1).next = nodes.get(i);
            }
            nodes.get(n - 1).next = null;
            return nodes.get(0);
        }
    }

    public static void main(String[] args) {
        Solution s = new P1721().new Solution();
        var ans = s.swapNodes(new ListNode("[1,2,3,4,5]"), 2);
        System.out.println(ans);
    }
}
