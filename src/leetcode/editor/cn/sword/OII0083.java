package leetcode.editor.cn.sword;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Author: Deean
 * Date: 2022-07-17 13:22
 * LastEditTime: 2022-07-17 13:22
 * Description: 剑指 Offer II 083. 没有重复元素集合的全排列
 */

public class OII0083 {
    // code beginning
    class Solution {
        public List<List<Integer>> permute(int[] nums) {
            List<List<Integer>> paths = new ArrayList<>();
            List<Integer> path = new ArrayList<>();
            for (int num : nums) {
                path.add(num);
            }
            backtrack(nums.length, path, paths, 0);
            return paths;
        }

        private void backtrack(int n, List<Integer> path, List<List<Integer>> paths, int init) {
            if (init == n) paths.add(new ArrayList<>(path));
            for (int i = init; i < n; i++) {
                // 动态维护数组
                Collections.swap(path, init, i);
                // 继续递归填下一个数
                backtrack(n, path, paths, init + 1);
                // 撤销操作
                Collections.swap(path, init, i);
            }
        }
    }

    public static void main(String[] args) {
        Solution s = new OII0083().new Solution();
        Object ans = s.permute(new int[]{1, 2, 3});
        System.out.println(ans);
    }
}