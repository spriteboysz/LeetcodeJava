package leetcode.LCP;

import leetcode.common.ListNode;

import java.util.HashSet;
import java.util.Set;

/**
 * Author: Deean
 * Date: 2023-09-28 22:39
 * FileName: src/main/java/leetcode/LCP
 * Description:LCR 022. 环形链表 II
 */

public class LCR0022 {
    // code beginning
    class Solution {
        public ListNode detectCycle(ListNode head) {
            Set<ListNode> seen = new HashSet<>();
            while (head != null) {
                if (seen.contains(head)) {
                    return head;
                }
                seen.add(head);
                head = head.next;
            }
            return null;
        }
    }

    public static void main(String[] args) {
        Solution s = new LCR0022().new Solution();
        var ans = s.detectCycle(new ListNode("[3,2,0,-4]"));
        System.out.println(ans);
    }
}
