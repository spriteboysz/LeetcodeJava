package leetcode.interview;

import leetcode.common.ListNode;

import java.util.HashSet;
import java.util.Set;

/**
 * Author: Deean
 * Date: 2022-08-10 00:05
 * FileName: src/leetcode/editor/cn/leetcode.interview
 * Description: 面试题 02.08. 环路检测
 */

public class M00020008 {
    // code beginning
    class Solution {
        public ListNode detectCycle(ListNode head) {
            if (head == null) return null;
            Set<ListNode> nodes = new HashSet<>();
            ListNode cur = head;
            while (cur != null) {
                if (nodes.contains(cur)) return cur;
                nodes.add(cur);
                cur = cur.next;
            }
            return null;
        }
    }

    public static void main(String[] args) {
        Solution s = new M00020008().new Solution();
        Object ans = s.detectCycle(new ListNode(new int[]{3, 2, 0, -4}));
        System.out.println(ans);
    }
}