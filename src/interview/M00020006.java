package interview;

import common.ListNode;

import java.util.ArrayList;
import java.util.List;

/**
 * Author: Deean
 * Date: 2022-08-13 21:00
 * FileName: src/leetcode/editor/cn/interview
 * Description: 面试题 02.06. 回文链表
 */

public class M00020006 {
    // code beginning
    class Solution {
        public boolean isPalindrome(ListNode head) {
            if (head == null) return true;
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
        Solution s = new M00020006().new Solution();
        Object ans = s.isPalindrome(new ListNode(new int[]{1, 2, 2, 1}));
        System.out.println(ans);
    }
}