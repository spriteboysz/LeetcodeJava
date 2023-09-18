package leetcode.LCP;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Author: Deean
 * Date: 2023-09-17 21:57
 * FileName: src/main/java/leetcode/LCP
 * Description:LCR 084. 全排列 II
 */

public class LCR0084 {
    // code beginning
    class Solution {
        boolean[] visited;

        public void backtrack(int[] nums, List<List<Integer>> paths, int index, List<Integer> path) {
            if (index == nums.length) {
                paths.add(new ArrayList<>(path));
                return;
            }
            for (int i = 0; i < nums.length; ++i) {
                if (visited[i] || (i > 0 && nums[i] == nums[i - 1] && !visited[i - 1])) {
                    continue;
                }
                path.add(nums[i]);
                visited[i] = true;
                backtrack(nums, paths, index + 1, path);
                visited[i] = false;
                path.remove(index);
            }
        }

        public List<List<Integer>> permuteUnique(int[] nums) {
            List<List<Integer>> paths = new ArrayList<>();
            List<Integer> path = new ArrayList<>();
            visited = new boolean[nums.length];
            Arrays.sort(nums);
            backtrack(nums, paths, 0, path);
            return paths;
        }
    }

    public static void main(String[] args) {
        Solution s = new LCR0084().new Solution();
        var ans = s.permuteUnique(new int[]{1, 2, 3});
        System.out.println(ans);
    }
}
