package algorithm;

import common.ListNode;

import java.util.ArrayList;
import java.util.List;

/**
 * Author: Deean
 * Date: 2023-08-29 18:00
 * FileName: src/algorithm
 * Description:2816. 翻倍以链表形式表示的数字
 */

public class P2816 {
    // code beginning
    class Solution {
        public ListNode doubleIt(ListNode head) {
            List<Integer> values = new ArrayList<>();
            while (head != null) {
                values.add(head.val);
                head = head.next;
            }
            int carry = 0;
            for (int i = values.size() - 1; i >= 0; i--) {
                int num = values.get(i) * 2 + carry;
                values.set(i, num % 10);
                carry = num / 10;
            }
            if (carry > 0) {
                values.add(0, carry);
            }
            ListNode dummy = new ListNode(-1);
            ListNode cur = dummy;
            for (Integer value : values) {
                cur.next = new ListNode(value);
                cur = cur.next;
            }
            return dummy.next;
        }
    }

    public static void main(String[] args) {
        Solution s = new P2816().new Solution();
        ListNode head = new ListNode(new int[]{9, 9, 9, 8});
        Object ans = s.doubleIt(head);
        System.out.println(ans);
    }
}
