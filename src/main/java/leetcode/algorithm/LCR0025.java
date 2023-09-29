package leetcode.algorithm;

import leetcode.common.ListNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * Author: Deean
 * Date: 2023-09-28 23:09
 * FileName: src/main/java/leetcode/algorithm
 * Description:LCR 025. 两数相加 II
 */

public class LCR0025 {
    // code beginning
    class Solution {
        public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
            Stack<Integer> stack1 = new Stack<>(), stack2 = new Stack<>();
            while (l1 != null) {
                stack1.push(l1.val);
                l1 = l1.next;
            }
            while (l2 != null) {
                stack2.push(l2.val);
                l2 = l2.next;
            }
            int carry = 0;
            List<Integer> sum = new ArrayList<>();
            while (!stack1.isEmpty() || !stack2.isEmpty() || carry > 0) {
                if (!stack1.isEmpty()) {
                    carry += stack1.pop();
                }
                if (!stack2.isEmpty()) {
                    carry += stack2.pop();
                }
                sum.add(carry % 10);
                carry /= 10;
            }
            ListNode dummy = new ListNode(-1);
            ListNode cur = dummy;
            for (int i = sum.size() - 1; i >= 0; i--) {
                cur.next = new ListNode(sum.get(i));
                cur = cur.next;
            }
            return dummy.next;
        }
    }

    public static void main(String[] args) {
        Solution s = new LCR0025().new Solution();
        var ans = s.addTwoNumbers(new ListNode("[7,2,4,3]"), new ListNode("[5,6,4]"));
        System.out.println(ans);
    }
}
