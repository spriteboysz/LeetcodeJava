package leetcode.algorithm;

import leetcode.common.ListNode;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 * Author: Deean
 * Date: 2023-09-16 15:32
 * FileName: src/main/java/leetcode/algorithm
 * Description:147. 对链表进行插入排序
 */

public class P0147 {
    // code beginning
    class Solution {
        public ListNode insertionSortList(ListNode head) {
            List<ListNode> nodes = new ArrayList<>();
            while (head != null) {
                nodes.add(head);
                head = head.next;
            }
            nodes.sort(Comparator.comparingInt(n -> n.val));
            for (int i = 0, n = nodes.size(); i < n - 1; i++) {
                nodes.get(i).next = nodes.get(i + 1);
            }
            nodes.get(nodes.size() - 1).next = null;
            return nodes.get(0);
        }
    }

    public static void main(String[] args) {
        Solution s = new P0147().new Solution();
        var ans = s.insertionSortList(new ListNode("[-1,5,3,4,0]"));
        System.out.println(ans);
    }
}
