package leetcode.LCP;

import leetcode.common.ListNode;

import java.util.HashSet;
import java.util.Set;

/**
 * Author: Deean
 * Date: 2023-09-30 22:12
 * FileName: src/main/java/leetcode/LCP
 * Description:LCR 171. 训练计划 V
 */

public class LCR0171 {
    // code beginning
    class Solution {
        ListNode getIntersectionNode(ListNode headA, ListNode headB) {
            Set<ListNode> seen = new HashSet<>();
            while (headA != null) {
                seen.add(headA);
                headA = headA.next;
            }
            while (headB != null) {
                if (seen.contains(headB)) {
                    return headB;
                }
                seen.add(headB);
                headB = headB.next;
            }
            return null;
        }
    }

    public static void main(String[] args) {
        Solution s = new LCR0171().new Solution();
        var ans = s.getIntersectionNode(new ListNode("[4,1,8,4,5]"), new ListNode("[5,0,1,8,4,5]"));
        System.out.println(ans);
    }
}
