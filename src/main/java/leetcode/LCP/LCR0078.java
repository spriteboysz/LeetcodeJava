package leetcode.LCP;

import leetcode.common.ListNode;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 * Author: Deean
 * Date: 2023-09-29 22:49
 * FileName: src/main/java/leetcode/algorithm
 * Description:LCR 078. 合并 K 个升序链表
 */

public class LCR0078 {
    // code beginning
    class Solution {
        public ListNode mergeKLists(ListNode[] lists) {
            if (lists == null || lists.length == 0) return null;
            List<ListNode> nodes = new ArrayList<>();
            for (ListNode list : lists) {
                var cur = list;
                while (cur != null) {
                    nodes.add(cur);
                    cur = cur.next;
                }
            }
            if (nodes.isEmpty()) return null;
            nodes.sort(Comparator.comparingInt(n -> n.val));
            for (int i = 0; i < nodes.size() - 1; i++) {
                nodes.get(i).next = nodes.get(i + 1);
            }
            nodes.get(nodes.size() - 1).next = null;
            return nodes.get(0);
        }
    }

    public static void main(String[] args) {
        Solution s = new LCR0078().new Solution();
        ListNode l1 = new ListNode("[1,4,5]");
        ListNode l2 = new ListNode("[1,3,4]");
        ListNode l3 = new ListNode("[2,6]");
        ListNode[] lists = new ListNode[]{l1, l2, l3};
        var ans = s.mergeKLists(lists);
        System.out.println(ans);
    }
}
