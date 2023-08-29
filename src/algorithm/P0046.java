package algorithm;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * Author: Deean
 * Date: 2022-07-23 14:13
 * LastEditTime: 2022-07-23 14:13
 * Description: 46. 全排列
 */

public class P0046 {
    // code beginning
    class Solution {
        List<List<Integer>> paths = new ArrayList<>();
        LinkedList<Integer> path = new LinkedList<>();
        boolean[] visited;

        public List<List<Integer>> permute(int[] nums) {
            if (nums.length == 0) return paths;
            visited = new boolean[nums.length];
            backtrace(nums);
            return paths;
        }

        private void backtrace(int[] nums) {
            if (path.size() == nums.length) {
                paths.add(new ArrayList<>(path));
                return;
            }
            for (int i = 0; i < nums.length; i++) {
                if (visited[i]) continue;
                visited[i] = true;
                path.add(nums[i]);
                backtrace(nums);
                path.removeLast();
                visited[i] = false;
            }
        }
    }

    public static void main(String[] args) {
        Solution s = new P0046().new Solution();
        Object ans = s.permute(new int[]{1, 2, 3});
        System.out.println(ans);
    }
}