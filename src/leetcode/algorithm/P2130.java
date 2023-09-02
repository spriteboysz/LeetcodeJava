package leetcode.algorithm;

import leetcode.common.ListNode;

import java.util.ArrayList;
import java.util.List;

/**
 * Author: Deean
 * Date: 2022-07-17 13:54
 * LastEditTime: 2022-07-17 13:54
 * Description: 2130. 链表最大孪生和
 */

public class P2130 {
    // code beginning
    class Solution {
        public int pairSum(ListNode head) {
            List<Integer> values = new ArrayList<>();
            ListNode cur = head;
            while (cur != null) {
                values.add(cur.val);
                cur = cur.next;
            }
            int maxSum = 0;
            for (int i = 0; i < values.size() / 2; i++) {
                maxSum = Math.max(maxSum, values.get(i) + values.get(values.size() - 1 - i));
            }
            return maxSum;
        }
    }

    public static void main(String[] args) {
        Solution s = new P2130().new Solution();
        Object ans = s.pairSum(new ListNode(new int[]{4, 2, 2, 3}));
        System.out.println(ans);
    }
}