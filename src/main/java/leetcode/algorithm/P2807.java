package leetcode.algorithm;

import leetcode.common.ListNode;

import java.util.ArrayList;
import java.util.List;

/**
 * Author: Deean
 * Date: 2023-08-29 18:52
 * FileName: src/leetcode.algorithm
 * Description:2807. 在链表中插入最大公约数
 */

public class P2807 {
    // code beginning
    class Solution {
        public int gcd(int x, int y) {
            return x == 0 ? y : gcd(y % x, x);
        }

        public ListNode insertGreatestCommonDivisors(ListNode head) {
            List<Integer> values = new ArrayList<>();
            while (head != null) {
                values.add(head.val);
                values.add(-1);
                head = head.next;
            }
            for (int i = 1; i < values.size() - 1; i += 2) {
                values.set(i, gcd(values.get(i - 1), values.get(i + 1)));
            }

            ListNode dummy = new ListNode(-1);
            ListNode cur = dummy;
            for (int i = 0; i < values.size() - 1; i++) {
                cur.next = new ListNode(values.get(i));
                cur = cur.next;
            }
            return dummy.next;
        }
    }

    public static void main(String[] args) {
        Solution s = new P2807().new Solution();
        ListNode head = new ListNode(new int[]{18, 6, 10, 3});
        Object ans = s.insertGreatestCommonDivisors(head);
        System.out.println(ans);
    }
}
