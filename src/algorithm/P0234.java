package algorithm;

import common.ListNode;

import java.util.ArrayList;

/**
 * Author: Deean
 * Date: 2022-06-26 22:05
 * LastEditTime: 2022-06-26 22:05
 * Description: 234. 回文链表
 */

public class P0234 {
    // code beginning
    class Solution {
        public boolean isPalindrome(ListNode head) {
            ArrayList<Integer> nodes = new ArrayList<>();
            ListNode cur = head;
            while (cur != null) {
                nodes.add(cur.val);
                cur = cur.next;
            }
            int left = 0, right = nodes.size() - 1;
            while (left < right) {
                if (!nodes.get(left++).equals(nodes.get(right--))) return false;
            }
            return true;
        }
    }

    public static void main(String[] args) {
        Solution s = new P0234().new Solution();
        Object ans = s.isPalindrome(new ListNode(new int[]{1, 2, 3, 2, 1}));
        System.out.println(ans);
    }
}