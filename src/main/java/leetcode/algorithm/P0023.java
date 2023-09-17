package leetcode.algorithm;

import leetcode.common.ListNode;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 * Author: Deean
 * Date: 2023-09-16 20:09
 * FileName: src/main/java/leetcode/algorithm
 * Description:23. 合并 K 个升序链表
 */

public class P0023 {
    // code beginning
    class Solution {
        public ListNode mergeKLists(ListNode[] lists) {
            if (lists.length == 0) return null;
            List<ListNode> nodes = new ArrayList<>();
            for (ListNode list : lists) {
                var head = list;
                while (head != null) {
                    nodes.add(head);
                    head = head.next;
                }
            }
            if (nodes.isEmpty()) return null;
            nodes.sort(Comparator.comparingInt(n -> n.val));
            for (int i = 0, n = nodes.size(); i < n - 1; i++) {
                nodes.get(i).next = nodes.get(i + 1);
            }
            nodes.get(nodes.size() - 1).next = null;
            return nodes.get(0);
        }
    }

    public static void main(String[] args) {
        Solution s = new P0023().new Solution();
        ListNode list1 = new ListNode("[1,4,5]");
        ListNode list2 = new ListNode("[1,3,4]");
        ListNode list3 = new ListNode("[2,6]");
        ListNode[] lists = new ListNode[]{list1, list2, list3};
        var ans = s.mergeKLists(lists);
        System.out.println(ans);
    }
}
