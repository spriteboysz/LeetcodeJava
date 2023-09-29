package leetcode.algorithm;

import leetcode.common.ListNode;

import java.util.ArrayList;
import java.util.List;

/**
 * Author: Deean
 * Date: 2023-09-28 23:18
 * FileName: src/main/java/leetcode/algorithm
 * Description:LCR 026. 重排链表
 */

public class LCR0026 {
    // code beginning
    class Solution {
        public void reorderList(ListNode head) {
            ListNode cur = head;
            List<ListNode> nodes1 = new ArrayList<>();
            while (cur != null) {
                nodes1.add(cur);
                cur = cur.next;
            }
            int n = nodes1.size();
            List<ListNode> nodes2 = new ArrayList<>();
            for (int i = 0; i <= n / 2; i++) {
                nodes2.add(nodes1.get(i));
                if (i != n / 2) {
                    nodes2.add(nodes1.get(n - 1 - i));
                }
            }
            for (int i = 0; i < n - 1; i++) {
                nodes2.get(i).next = nodes2.get(i + 1);
            }
            nodes2.get(n - 1).next = null;
            System.out.println(head);
        }
    }

    public static void main(String[] args) {
        Solution s = new LCR0026().new Solution();
        s.reorderList(new ListNode("[1,2,3,4]"));
    }
}
