package leetcode.editor.cn.sword;

import leetcode.editor.cn.common.ListNode;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 * Author: Deean
 * Date: 2022-07-31 23:12
 * LastEditTime: 2022-07-31 23:12
 * Description: 剑指 Offer II 077. 链表排序
 */

public class OII0077 {
    // code beginning
    class Solution {
        public ListNode sortList(ListNode head) {
            if (head == null) return null;
            List<ListNode> nodes = new ArrayList<>();
            ListNode cur = head;
            while (cur != null) {
                nodes.add(cur);
                cur = cur.next;
            }

            nodes.sort(Comparator.comparingInt(o -> o.val));
            for (int i = 0; i < nodes.size() - 1; i++) {
                nodes.get(i).next = nodes.get(i + 1);
            }
            nodes.get(nodes.size() - 1).next = null;
            return nodes.get(0);
        }
    }

    public static void main(String[] args) {
        Solution s = new OII0077().new Solution();
        Object ans = s.sortList(new ListNode(new int[]{-1, 5, 3, 4, 0}));
        System.out.println(ans);
    }
}