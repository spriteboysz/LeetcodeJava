package leetcode.algorithm;

import leetcode.common.ListNode;

/**
 * Author: Deean
 * Date: 2022-08-21 22:42
 * FileName: src/leetcode/editor/cn/leetcode.algorithm
 * Description: 2181. 合并零之间的节点
 */

public class P2181 {
    // code beginning
    class Solution {
        public ListNode mergeNodes(ListNode head) {
            ListNode node = new ListNode();
            ListNode cur = node;
            int count = 0;
            head = head.next;
            while (head != null) {
                if (head.val == 0) {
                    cur.next = new ListNode(count);
                    cur = cur.next;
                    count = 0;
                } else {
                    count += head.val;
                }
                head = head.next;
            }
            return node.next;
        }
    }

    public static void main(String[] args) {
        Solution s = new P2181().new Solution();
        Object ans = s.mergeNodes(new ListNode(new int[]{0, 1, 0, 3, 0, 2, 2, 0}));
        System.out.println(ans);
    }
}