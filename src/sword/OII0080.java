package sword;

import java.util.ArrayList;
import java.util.List;

/**
 * Author: Deean
 * Date: 2022-07-23 11:11
 * LastEditTime: 2022-07-23 11:11
 * Description: 剑指 Offer II 080. 含有 k 个元素的组合
 */

public class OII0080 {
    // code beginning
    class Solution {
        List<List<Integer>> paths = new ArrayList<>();
        List<Integer> path = new ArrayList<>();

        public List<List<Integer>> combine(int n, int k) {
            backtrace(n, k, 1);
            return paths;
        }

        private void backtrace(int n, int k, int start) {
            if (path.size() == k) {
                paths.add(new ArrayList<>(path));
                return;
            }
            for (int i = start; i <= n; i++) {
                path.add(i);
                backtrace(n, k, i + 1);
                path.remove(path.size() - 1);
            }
        }
    }

    public static void main(String[] args) {
        Solution s = new OII0080().new Solution();
        Object ans = s.combine(4, 2);
        System.out.println(ans);
    }
}