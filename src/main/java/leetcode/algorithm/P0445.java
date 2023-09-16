package leetcode.algorithm;

import leetcode.common.ListNode;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * Author: Deean
 * Date: 2023-09-16 11:42
 * FileName: src/main/java/leetcode/algorithm
 * Description:445. 两数相加 II
 */

public class P0445 {
    // code beginning
    class Solution {
        public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
            Deque<Integer> stack1 = new ArrayDeque<>();
            Deque<Integer> stack2 = new ArrayDeque<>();
            while (l1 != null) {
                stack1.push(l1.val);
                l1 = l1.next;
            }
            while (l2 != null) {
                stack2.push(l2.val);
                l2 = l2.next;
            }
            int carry = 0;
            ListNode sum = null;
            while (!stack1.isEmpty() || !stack2.isEmpty() || carry != 0) {
                int a = stack1.isEmpty() ? 0 : stack1.pop();
                int b = stack2.isEmpty() ? 0 : stack2.pop();
                carry += a + b;
                ListNode node = new ListNode(carry % 10);
                carry /= 10;
                node.next = sum;
                sum = node;
            }
            return sum;
        }
    }

    public static void main(String[] args) {
        Solution s = new P0445().new Solution();
        var ans = s.addTwoNumbers(new ListNode("[7,2,4,3]"), new ListNode("[5,6,4]"));
        System.out.println(ans);
    }
}
