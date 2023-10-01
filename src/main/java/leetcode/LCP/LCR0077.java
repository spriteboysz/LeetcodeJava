package leetcode.LCP;

import leetcode.common.ListNode;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 * Author: Deean
 * Date: 2023-09-29 22:45
 * FileName: src/main/java/leetcode/algorithm
 * Description:LCR 077. 排序链表
 */

public class LCR0077 {
    // code beginning
    class Solution {
        public ListNode sortList(ListNode head) {
            if (head == null || head.next == null) return head;
            List<ListNode> nodes = new ArrayList<>();
            while (head != null) {
                nodes.add(head);
                head = head.next;
            }
            nodes.sort(Comparator.comparingInt(n -> n.val));
            for (int i = 0; i < nodes.size() - 1; i++) {
                nodes.get(i).next = nodes.get(i + 1);
            }
            nodes.get(nodes.size() - 1).next = null;
            return nodes.get(0);
        }
    }

    public static void main(String[] args) {
        Solution s = new LCR0077().new Solution();
        var ans = s.sortList(new ListNode("[4,2,1,3]"));
        System.out.println(ans);
    }
}
