package leetcode.sword;

import leetcode.common.ListNode;

import java.util.ArrayList;
import java.util.List;

/**
 * Author: Deean
 * Date: 2022-07-29 00:28
 * LastEditTime: 2022-07-29 00:28
 * Description: 剑指 Offer II 027. 回文链表
 */

public class OII0027 {
    // code beginning
    class Solution {
        public boolean isPalindrome(ListNode head) {
            List<Integer> value1 = new ArrayList<>(), value2 = new ArrayList<>();
            while (head != null) {
                value1.add(head.val);
                value2.add(0, head.val);
                head = head.next;
            }
            return value1.equals(value2);
        }
    }

    public static void main(String[] args) {
        Solution s = new OII0027().new Solution();
        Object ans = s.isPalindrome(new ListNode(new int[]{1, 2, 3, 3, 2, 1}));
        System.out.println(ans);
    }
}