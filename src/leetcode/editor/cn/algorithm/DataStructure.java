package leetcode.editor.cn.algorithm;


import java.util.ArrayList;

/**
 * Author: @Deean
 * Date: 2022-06-22 23:09
 * LastEditTime: 2022-06-22 23:09
 * Description: 基础数据结构
 */


//Definition for singly-linked list.
class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }

    ListNode(int[] values) {
        int n = values.length;
        if (n > 0) {
            ListNode[] nodes = new ListNode[n];
            nodes[0] = new ListNode(values[0]);
            for (int i = 1; i < nodes.length; i++) {
                nodes[i] = new ListNode(values[i]);
                nodes[i - 1].next = nodes[i];
            }
            nodes[nodes.length - 1].next = null;
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
}


//Definition for a binary tree node.*
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {
    }

    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}


public class DataStructure {

    public static void main(String[] args) {
        //ListNode[] nodes = new ListNode[5];
        //nodes[0] = new ListNode(0);
        //for (int i = 1; i < nodes.length; i++) {
        //    nodes[i] = new ListNode(i);
        //    nodes[i - 1].next = nodes[i];
        //}
        //nodes[nodes.length - 1].next = null;
        //
        //for (ListNode node : nodes) {
        //    System.out.println(node.val);
        //}

        ListNode head = new ListNode(new int[]{});
        System.out.println(head);

    }
}