package leetcode.algorithm;

import leetcode.common.ListNode;

import java.util.ArrayList;
import java.util.List;

/**
 * Author: Deean
 * Date: 2023-09-16 15:36
 * FileName: src/main/java/leetcode/algorithm
 * Description:86. 分隔链表
 */

public class P0086 {
    // code beginning
    class Solution {
        public ListNode partition(ListNode head, int x) {
            if (head == null) return null;
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
            for (int i = 0, n = nodes.size(); i < n - 1; i++) {
                nodes.get(i).next = nodes.get(i + 1);
            }
            nodes.get(nodes.size() - 1).next = null;
            return nodes.get(0);
        }
    }

    public static void main(String[] args) {
        Solution s = new P0086().new Solution();
        var ans = s.partition(new ListNode("[1,4,3,2,5,2]"), 3);
        System.out.println(ans);
    }
}
