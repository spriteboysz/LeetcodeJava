package leetcode.editor.cn.algorithm;


/**
 * Author: @Deean
 * Date: 2022-06-22 23:09
 * LastEditTime: 2022-06-22 23:09
 * Description: 基础数据结构
 */

//Definition for a binary tree node.*
public class TreeNode {
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


    @Override
    public String toString() {
        return "TreeNode{" +
                "val=" + val +
                ", left=" + left +
                ", right=" + right +
                '}';
    }

    public static void main(String[] args) {
        //TreeNode tree = new TreeNode(ArrayList(new int[]{1, 2, 3, null, 4}));
        //System.out.println(tree);
    }
}
