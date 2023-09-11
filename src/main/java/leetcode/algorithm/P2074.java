package leetcode.algorithm;

import leetcode.common.ListNode;

import java.util.ArrayList;
import java.util.List;

/**
 * Author: Deean
 * Date: 2023-09-10 12:48
 * FileName: src/leetcode/algorithm
 * Description:2074. 反转偶数长度组的节点
 */

public class P2074 {
    // code beginning
    class Solution {
        public ListNode reverseEvenLengthGroups(ListNode head) {
            if (head == null) return null;
            List<ListNode> nodes = new ArrayList<>();
            while (head != null) {
                nodes.add(head);
                head = head.next;
            }
            for (int i = 0, n = nodes.size(), size = 0; i < n; i += size) {
                size = Math.min(++size, n - i);
                if (size % 2 == 1) continue;
                for (int j = 0; j < size / 2; j++) {
                    var node = nodes.get(i + j);
                    nodes.set(i + j, nodes.get(i + size - j - 1));
                    nodes.set(i + size - j - 1, node);
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
        Solution s = new P2074().new Solution();
        var ans = s.reverseEvenLengthGroups(new ListNode("[5,2,6,3,9,1,7,3,8,4]"));
        System.out.println(ans);
    }
}
