package leetcode.algorithm;

/**
 * Author: Deean
 * Date: 2023-09-18 23:02
 * FileName: src/main/java/leetcode/algorithm
 * Description:2305. 公平分发饼干
 */

public class P2305 {
    // code beginning
    class Solution {
        public int distributeCookies(int[] cookies, int k) {
            int[] parts = new int[k];
            return dfs(cookies, 0, parts, 0);
        }

        private int dfs(int[] cookies, int index, int[] parts, int max) {
            if (index == cookies.length) return max;
            int ans = Integer.MAX_VALUE;
            for (int i = 0; i < parts.length; i++) {
                parts[i] += cookies[index];
                ans = Math.min(dfs(cookies, index + 1, parts, Math.max(parts[i], max)), ans);
                parts[i] -= cookies[index];
            }
            return ans;
        }
    }

    public static void main(String[] args) {
        Solution s = new P2305().new Solution();
        var ans = s.distributeCookies(new int[]{6, 1, 3, 2, 2, 4, 1, 2}, 3);
        System.out.println(ans);
    }
}
