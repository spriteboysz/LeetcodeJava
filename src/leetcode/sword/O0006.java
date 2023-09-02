package leetcode.sword;

import leetcode.common.ListNode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Author: Deean
 * Date: 2022-07-03 23:40
 * LastEditTime: 2022-07-03 23:40
 * Description: 剑指 Offer 06. 从尾到头打印链表
 */

public class O0006 {
    // code beginning
    class Solution {
        public int[] reversePrint(ListNode head) {
            List<Integer> list = new ArrayList<>();
            while (head != null) {
                list.add(head.val);
                head = head.next;
            }

            int n = list.size();
            int[] values = new int[n];
            for (int i = 0; i < n; i++) {
                values[i] = list.get(n - i - 1);
            }
            return values;
        }
    }

    public static void main(String[] args) {
        Solution s = new O0006().new Solution();
        int[] ans = s.reversePrint(new ListNode(new int[]{1, 3, 2}));
        System.out.println(Arrays.toString(ans));
    }
}