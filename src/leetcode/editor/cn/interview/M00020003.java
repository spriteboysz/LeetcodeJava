package leetcode.editor.cn.interview;

import leetcode.editor.cn.algorithm.ListNode;

/**
 * Author: Deean
 * Date: 2022-07-02 20:57
 * LastEditTime: 2022-07-02 20:57
 * Description: .
 */

public class M00020003 {
    // code beginning
    class Solution {
        public void deleteNode(ListNode node) {
            node.val = node.next.val;
            node.next = node.next.next;
        }
    }

    public static void main(String[] args) {
        Solution s = new M00020003().new Solution();
        s.deleteNode(new ListNode(new int[]{1, 2, 3}));
    }
}