package leetcode.editor.cn.algorithm;

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
}

public class DataStructure {

    public static void main(String[] args) {
        ListNode[] nodes = new ListNode[5];
        nodes[0] = new ListNode(0);
        for (int i = 1; i < nodes.length; i++) {
            nodes[i] = new ListNode(i);
            nodes[i - 1].next = nodes[i];
        }
        nodes[nodes.length - 1].next = null;

        for (ListNode node : nodes) {
            System.out.println(node.val);
        }

    }
}