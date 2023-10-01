package leetcode.LCP;

import leetcode.common.ListNode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Author: Deean
 * Date: 2023-09-30 16:59
 * FileName: src/main/java/leetcode/LCP
 * Description:LCR 142. 训练计划 IV
 */

public class LCR0142 {
    // code beginning
    class Solution {
        public ListNode trainningPlan(ListNode l1, ListNode l2) {
            if (l1 == null) return l2;
            if (l2 == null) return l1;
            List<ListNode> nodes = new ArrayList<>();
            while (l1 != null) {
                nodes.add(l1);
                l1 = l1.next;
            }
            while (l2 != null) {
                nodes.add(l2);
                l2 = l2.next;
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
        Solution s = new LCR0142().new Solution();
        var ans = s.trainningPlan(new ListNode("[1,2,4]"), new ListNode("[1,3,4]"));
        System.out.println(ans);
    }
}
