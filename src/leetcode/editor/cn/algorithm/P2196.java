package leetcode.editor.cn.algorithm;

import leetcode.editor.cn.common.TreeNode;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * Author: Deean
 * Date: 2022-08-23 23:31
 * FileName: src/leetcode/editor/cn/algorithm
 * Description: 2196. 根据描述创建二叉树
 */

public class P2196 {
    // code beginning
    class Solution {
        public TreeNode createBinaryTree(int[][] descriptions) {
            Set<Integer> children = new HashSet<>();
            Map<Integer, TreeNode> map = new HashMap<>();
            for (int[] description : descriptions) {
                int pVal = description[0], cVal = description[1];
                TreeNode pNode = map.get(pVal);
                if (pNode == null) {
                    pNode = new TreeNode(pVal);
                    map.put(pVal, pNode);
                }
                TreeNode cNode = map.get(cVal);
                if (cNode == null) {
                    cNode = new TreeNode(cVal);
                    map.put(cVal, cNode);
                }
                children.add(cVal);
                if (description[2] == 1) {
                    pNode.left = cNode;
                } else {
                    pNode.right = cNode;
                }
            }
            TreeNode root = null;
            for (int v : map.keySet()) {
                if (!children.contains(v)) {
                    root = map.get(v);
                    break;
                }
            }
            return root;
        }
    }

    public static void main(String[] args) {
        Solution s = new P2196().new Solution();
        Object ans = s.createBinaryTree(new int[][]{{1, 2, 1}, {2, 3, 0}, {3, 4, 1}});
        System.out.println(ans);
    }
}