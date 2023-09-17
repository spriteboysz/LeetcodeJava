package leetcode.algorithm;

import leetcode.common.ListNode;

import java.util.ArrayList;
import java.util.List;

/**
 * Author: Deean
 * Date: 2023-09-16 17:16
 * FileName: src/main/java/leetcode/algorithm
 * Description:25. K 个一组翻转链表
 */

public class P0025 {
    // code beginning
    class Solution {
        public ListNode reverseKGroup(ListNode head, int k) {
            List<ListNode> nodes = new ArrayList<>();
            while (head != null) {
                nodes.add(head);
                head = head.next;
            }
            for (int i = 0, n = nodes.size(); i + k <= n; i += k) {
                for (int j = 0; j < k / 2; j++) {
                    var node = nodes.get(i + j);
                    nodes.set(i + j, nodes.get(i + k - j - 1));
                    nodes.set(i + k - j - 1, node);
                }
            }
            for (int i = 0, n = nodes.size(); i < n - 1; i++) {
                nodes.get(i).next = nodes.get(i + 1);
            }
            nodes.get(nodes.size() - 1).next = null;
            return nodes.get(0);
        }
    }

    public static void main(String[] args) {
        Solution s = new P0025().new Solution();
        var ans = s.reverseKGroup(new ListNode("[1,2,3,4,5]"), 2);
        System.out.println(ans);
    }
}
