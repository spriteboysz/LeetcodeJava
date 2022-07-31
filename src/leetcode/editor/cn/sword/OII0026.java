package leetcode.editor.cn.sword;

import leetcode.editor.cn.common.ListNode;

import java.util.ArrayList;
import java.util.List;

/**
 * Author: Deean
 * Date: 2022-07-31 22:56
 * LastEditTime: 2022-07-31 22:56
 * Description: 剑指 Offer II 026. 重排链表
 */

public class OII0026 {
    // code beginning
    class Solution {
        public void reorderList(ListNode head) {
            if (head == null) return;
            List<ListNode> nodes = new ArrayList<>();
            ListNode cur = head;
            while (cur != null) {
                nodes.add(cur);
                cur = cur.next;
            }
            int left = 0, right = nodes.size() - 1;
            while (left < right) {
                nodes.get(left).next = nodes.get(right);
                left++;
                if (left == right) {
                    break;
                }
                nodes.get(right).next = nodes.get(left);
                right--;
            }
            nodes.get(left).next = null;
            // System.out.println(head);
        }
    }

    public static void main(String[] args) {
        Solution s = new OII0026().new Solution();
        s.reorderList(new ListNode(new int[]{1, 2, 3, 4}));
        s.reorderList(new ListNode(new int[]{1, 2, 3, 4, 5}));

    }
}