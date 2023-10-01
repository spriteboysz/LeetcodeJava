package leetcode.LCP;

import leetcode.common.ListNode;

import java.util.ArrayList;
import java.util.List;

/**
 * Author: Deean
 * Date: 2023-09-30 16:50
 * FileName: src/main/java/leetcode/LCP
 * Description:LCR 140. 训练计划 II
 */

public class LCR0140 {
    // code beginning
    class Solution {
        public ListNode trainingPlan(ListNode head, int cnt) {
            if (head == null) return null;
            List<ListNode> nodes = new ArrayList<>();
            while (head != null) {
                nodes.add(head);
                head = head.next;
            }
            return nodes.get(nodes.size() - cnt);
        }
    }

    public static void main(String[] args) {
        Solution s = new LCR0140().new Solution();
        var ans = s.trainingPlan(new ListNode("[2,4,7,8]"), 1);
        System.out.println(ans);
    }
}
