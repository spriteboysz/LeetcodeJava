package leetcode.LCP;

import leetcode.common.TreeNode;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

/**
 * Author: Deean
 * Date: 2023-09-29 21:54
 * FileName: src/main/java/leetcode/algorithm
 * Description:LCR 048. 二叉树的序列化与反序列化
 */


public class LCR0048 {
    // code beginning
    public class Codec {

        // Encodes a tree to a single string.
        public String serialize(TreeNode root) {
            if (root == null) return "[]";
            List<String> values = new ArrayList<>();
            Deque<TreeNode> queue = new LinkedList<>();
            queue.offer(root);
            while (!queue.isEmpty()) {
                var node = queue.poll();
                if (node != null && !String.valueOf(node.val).equals("null")) {
                    values.add(String.valueOf(node.val));
                    queue.offer(node.left);
                    queue.offer(node.right);
                } else {
                    values.add("null");
                }
            }
            while (values.get(values.size() - 1).equals("null")) {
                values.remove(values.size() - 1);
            }
            return "[" + String.join(",", values) + "]";
        }

        // Decodes your encoded data to tree.
        public TreeNode deserialize(String data) {
            if (data.equals("[]")) return null;
            String[] values = data.substring(1, data.length() - 1).split(",");
            Deque<TreeNode> queue = new LinkedList<>();
            TreeNode root = new TreeNode(Integer.parseInt(values[0]));
            queue.offer(root);
            int index = 1;
            while (!queue.isEmpty()) {
                var node = queue.poll();
                if (index < values.length && !values[index].equals("null")) {
                    node.left = new TreeNode(Integer.parseInt(values[index]));
                    queue.offer(node.left);
                }
                index += 1;
                if (index < values.length && !values[index].equals("null")) {
                    node.right = new TreeNode(Integer.parseInt(values[index]));
                    queue.offer(node.right);
                }
                index += 1;
            }
            return root;
        }
    }

    public static void main(String[] args) {
        Codec codec = new LCR0048().new Codec();
        System.out.println(codec.serialize(codec.deserialize("[1,null,3,4,5,6]")));
    }
}
