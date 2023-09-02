package leetcode.algorithm;

import leetcode.common.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * Author: Deean
 * Date: 2022-07-17 16:30
 * LastEditTime: 2022-07-17 16:30
 * Description: 173. 二叉搜索树迭代器
 */

public class P0173 {
    // code beginning
    class BSTIterator {
        private final List<Integer> values;
        private int index;

        public BSTIterator(TreeNode root) {
            values = new ArrayList<>();
            index = 0;
            dfs(root);
        }

        private void dfs(TreeNode node) {
            if (node == null) return;
            dfs(node.left);
            values.add(node.val);
            dfs(node.right);
        }

        public int next() {
            return values.get(index++);
        }

        public boolean hasNext() {
            return index < values.size();
        }
    }

    public static void main(String[] args) {
        BSTIterator bSTIterator = new P0173().new BSTIterator(new TreeNode("[7,3,15,null,null,9,20]"));
        System.out.println(bSTIterator.next());    // 返回 3
        System.out.println(bSTIterator.next());    // 返回 7
        System.out.println(bSTIterator.hasNext()); // 返回 True
        System.out.println(bSTIterator.next());    // 返回 9
        System.out.println(bSTIterator.hasNext()); // 返回 True
        System.out.println(bSTIterator.next());    // 返回 15
        System.out.println(bSTIterator.hasNext()); // 返回 True
        System.out.println(bSTIterator.next());    // 返回 20
        System.out.println(bSTIterator.hasNext()); // 返回 False
    }
}