package leetcode.editor.cn.interview;

import leetcode.editor.cn.common.ListNode;
import leetcode.editor.cn.common.TreeNode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * Author: Deean
 * Date: 2022-08-10 22:44
 * FileName: src/leetcode/editor/cn/interview
 * Description: 面试题 04.03. 特定深度节点链表
 */

public class M00040003 {
    // code beginning
    class Solution {
        public ListNode[] listOfDepth(TreeNode tree) {
            if (tree == null) return null;
            List<ListNode> nodes = new ArrayList<>();
            LinkedList<TreeNode> queue = new LinkedList<>();
            queue.offer(tree);
            while (!queue.isEmpty()) {
                ListNode head = new ListNode(0), cur = head;
                for (int size = queue.size(); size > 0; size--) {
                    TreeNode treeNode = queue.removeFirst();
                    cur.next = new ListNode(treeNode.val);
                    cur = cur.next;
                    if (treeNode.left != null) queue.addLast(treeNode.left);
                    if (treeNode.right != null) queue.addLast(treeNode.right);
                }
                nodes.add(head.next);
            }
            ListNode[] listNodes = new ListNode[nodes.size()];
            for (int i = 0; i < nodes.size(); i++) {
                listNodes[i] = nodes.get(i);
            }
            return listNodes;
        }
    }

    public static void main(String[] args) {
        Solution s = new M00040003().new Solution();
        ListNode[] ans = s.listOfDepth(new TreeNode("[1,2,3,4,5,null,7,8]"));
        System.out.println(Arrays.toString(ans));
    }
}