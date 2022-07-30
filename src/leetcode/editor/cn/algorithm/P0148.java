package leetcode.editor.cn.algorithm;

import leetcode.editor.cn.common.ListNode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Author: Deean
 * Date: 2022-07-30 22:21
 * LastEditTime: 2022-07-30 22:21
 * Description: 148. 排序链表
 */

public class P0148 {
    // code beginning
    class Solution {
        public ListNode sortList(ListNode head) {
            if (head == null) return null;
            List<Integer> values = new ArrayList<>();
            ListNode cur = head;
            while (cur.next != null) {
                values.add(cur.val);
                cur = cur.next;
            }
            values.add(cur.val);

            Collections.sort(values);
            cur = head;
            for (Integer value : values) {
                ListNode temp = new ListNode(value);
                assert cur != null;
                cur.val = temp.val;
                cur = cur.next;
            }
            return head;
        }
    }

    public static void main(String[] args) {
        Solution s = new P0148().new Solution();
        Object ans = s.sortList(new ListNode(new int[]{-1, 5, 3, 4, 0}));
        System.out.println(ans);
    }
}