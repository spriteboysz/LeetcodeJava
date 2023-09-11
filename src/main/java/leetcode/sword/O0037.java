package leetcode.sword;

import leetcode.common.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Author: Deean
 * Date: 2022-07-03 22:24
 * LastEditTime: 2022-07-03 22:24
 * Description: 剑指 Offer 37. 序列化二叉树
 */

public class O0037 {
    // code beginning
    class Codec {
        // Encodes a tree to a single string.
        public String serialize(TreeNode root) {
            if (root == null) return "[]";
            StringBuilder res = new StringBuilder("[");
            Queue<TreeNode> queue = new LinkedList<>() {{
                add(root);
            }};
            while (!queue.isEmpty()) {
                TreeNode node = queue.poll();
                if (node != null) {
                    res.append(node.val).append(",");
                    queue.add(node.left);
                    queue.add(node.right);
                } else res.append("#,");
            }
            res.deleteCharAt(res.length() - 1);
            res.append("]");
            return res.toString();
        }

        // Decodes your encoded data to tree.
        public TreeNode deserialize(String data) {
            if (data.equals("[]")) return null;
            String[] values = data.substring(1, data.length() - 1).split(",");
            TreeNode root = new TreeNode(Integer.parseInt(values[0]));
            Queue<TreeNode> queue = new LinkedList<>() {{
                add(root);
            }};
            int i = 1;
            System.out.println("#" + values.length);
            while (!queue.isEmpty()) {
                TreeNode node = queue.poll();
                if (i < values.length && !values[i].equals("#")) {
                    node.left = new TreeNode(Integer.parseInt(values[i]));
                    queue.add(node.left);
                }
                i++;
                if (i < values.length && !values[i].equals("#")) {
                    node.right = new TreeNode(Integer.parseInt(values[i]));
                    queue.add(node.right);
                }
                i++;
            }
            return root;
        }
    }

    public static void main(String[] args) {
        Codec s = new O0037().new Codec();
        TreeNode root = s.deserialize("[1,2,3,#,#,4,5]");
        System.out.println(s.serialize(root));
    }
}