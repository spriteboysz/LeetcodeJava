package leetcode.editor.cn.interview;

import leetcode.editor.cn.common.ListNode;

import java.util.HashSet;
import java.util.Set;

/**
 * Author: Deean
 * Date: 2022-07-23 22:12
 * LastEditTime: 2022-07-23 22:12
 * Description: 面试题52. 两个链表的第一个公共节点
 */

public class M00520000 {
    // code beginning
    class Solution {
        public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
            Set<ListNode> visited = new HashSet<>();
            ListNode temp = headA;
            while (temp != null) {
                visited.add(temp);
                temp = temp.next;
            }
            temp = headB;
            while (temp != null) {
                if (visited.contains(temp)) {
                    return temp;
                }
                temp = temp.next;
            }
            return null;
        }
    }

    public static void main(String[] args) {
        Solution s = new M00520000().new Solution();
        Object ans = s.getIntersectionNode(new ListNode(new int[]{0, 9, 1, 2, 4}), new ListNode(new int[]{3, 2, 4}));
        System.out.println(ans);
    }
}