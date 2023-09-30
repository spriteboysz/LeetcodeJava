package leetcode.LCP;

import leetcode.common.ListNode;

import java.util.ArrayList;
import java.util.List;

/**
 * Author: Deean
 * Date: 2023-09-28 23:03
 * FileName: src/main/java/leetcode/algorithm
 * Description:LCR 024. 反转链表
 */

public class LCR0024 {
    // code beginning
    class Solution {
        public ListNode reverseList(ListNode head) {
            if (head == null || head.next == null) {
                return head;
            }
            List<ListNode> nodes = new ArrayList<>();
            while (head != null) {
                nodes.add(head);
                head = head.next;
            }
            for (int i = nodes.size() - 1; i > 0; i--) {
                nodes.get(i).next = nodes.get(i - 1);
            }
            nodes.get(0).next = null;
            return nodes.get(nodes.size() - 1);
        }
    }

    public static void main(String[] args) {
        Solution s = new LCR0024().new Solution();
        var ans = s.reverseList(new ListNode("[1,2,3,4,5]"));
        System.out.println(ans);
    }
}
