package leetcode.algorithm;

import leetcode.common.ListNode;

import java.util.ArrayList;
import java.util.List;

/**
 * Author: Deean
 * Date: 2023-09-16 16:42
 * FileName: src/main/java/leetcode/algorithm
 * Description:61. 旋转链表
 */

public class P0061 {
    // code beginning
    class Solution {
        public ListNode rotateRight(ListNode head, int k) {
            if (head == null || k == 0) return head;
            List<ListNode> nodes = new ArrayList<>();
            while (head != null) {
                nodes.add(head);
                head = head.next;
            }
            int n = nodes.size();
            k %= n;
            if (k == 0) return nodes.get(0);
            nodes.get(n - 1).next = nodes.get(0);
            nodes.get(n - k - 1).next = null;
            return nodes.get(n - k);
        }
    }

    public static void main(String[] args) {
        Solution s = new P0061().new Solution();
        var ans = s.rotateRight(new ListNode("[1,2,3,4,5]"), 2);
        System.out.println(ans);
    }
}
