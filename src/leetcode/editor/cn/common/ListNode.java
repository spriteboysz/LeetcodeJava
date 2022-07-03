package leetcode.editor.cn.common;

import java.util.ArrayList;

/**
 * Author: Deean
 * Date: 2022-06-26 16:07
 * LastEditTime: 2022-06-26 16:07
 * Description: .
 */

//Definition for singly-linked list.
public class ListNode {
    // code beginning
    public int val;
    public ListNode next;

    public ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }

    public ListNode(int[] values) {
        int n = values.length;
        if (n == 0) new ListNode();
        if (n > 0) {
            ListNode[] nodes = new ListNode[n];
            nodes[0] = new ListNode(values[0]);
            for (int i = 1; i < nodes.length; i++) {
                nodes[i] = new ListNode(values[i]);
                nodes[i - 1].next = nodes[i];
            }
            nodes[nodes.length - 1].next = null;
            // ListNode(nodes[0].val, nodes[0].next);
            this.val = nodes[0].val;
            this.next = nodes[0].next;
        }
    }

    @Override
    public String toString() {
        ListNode cur = this;
        ArrayList<Integer> list = new ArrayList<>();
        while (cur != null) {
            list.add(cur.val);
            cur = cur.next;
        }
        return list.toString();
    }

    public static void main(String[] args) {
        ListNode node = new ListNode(0, null);
        System.out.println(node);
        ListNode head = new ListNode(new int[]{1, 2, 3});
        System.out.println(head);
    }
}