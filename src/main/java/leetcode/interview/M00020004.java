package leetcode.interview;

import leetcode.common.ListNode;

import java.util.ArrayList;
import java.util.List;

/**
 * Author: Deean
 * Date: 2023-09-17 14:30
 * FileName: src/main/java/leetcode/interview
 * Description:面试题 02.04. 分割链表
 */

public class M00020004 {
    // code beginning
    class Solution {
        public ListNode partition(ListNode head, int x) {
            if (head == null || head.next == null) return head;
            List<ListNode> nodes = new ArrayList<>();
            List<ListNode> gt = new ArrayList<>();
            while (head != null) {
                if (head.val < x) {
                    nodes.add(head);
                } else {
                    gt.add(head);
                }
                head = head.next;
            }
            nodes.addAll(gt);
            for (int i = 0; i < nodes.size() - 1; i++) {
                nodes.get(i).next = nodes.get(i + 1);
            }
            nodes.get(nodes.size() - 1).next = null;
            return nodes.get(0);
        }
    }

    public static void main(String[] args) {
        Solution s = new M00020004().new Solution();
        var ans = s.partition(new ListNode("[1,4,3,2,5,2]"), 3);
        System.out.println(ans);
    }
}
