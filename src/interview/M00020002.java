package interview;

import common.ListNode;

/**
 * Author: Deean
 * Date: 2022-07-03 16:51
 * LastEditTime: 2022-07-03 16:51
 * Description: 面试题 02.02. 返回倒数第 k 个节点
 */

public class M00020002 {
    // code beginning
    class Solution {
        public int kthToLast(ListNode head, int k) {
            ListNode fast = head, slow = head;
            while (fast != null && k > 0) {
                fast = fast.next;
                k--;
            }
            while (fast != null) {
                fast = fast.next;
                slow = slow.next;
            }
            return slow != null ? slow.val : 0;
        }
    }

    public static void main(String[] args) {
        Solution s = new M00020002().new Solution();
        Object ans = s.kthToLast(new ListNode(new int[]{1, 2, 3, 4, 5}), 2);
        System.out.println(ans);
    }
}