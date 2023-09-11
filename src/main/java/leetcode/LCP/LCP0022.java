package leetcode.LCP;

/**
 * Author: Deean
 * Date: 2022-08-23 23:49
 * FileName: src/leetcode/editor/cn/leetcode.LCP
 * Description: leetcode.LCP 22. 黑白方格画
 */

public class LCP0022 {
    // code beginning
    class Solution {
        public int paintingPlan(int n, int k) {
            if (k == 0 || k == n * n) return 1;
            int count = 0;
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    if (i * n + j * n - i * j == k) {
                        count += combination(n, i) * combination(n, j);
                    }
                }
            }
            return count;
        }

        private int combination(int n, int m) {
            int count = 1;
            for (int i = n; i > m; i--) count *= i;
            for (int i = n - m; i > 0; i--) count /= i;
            return count;
        }
    }


    public static void main(String[] args) {
        Solution s = new LCP0022().new Solution();
        Object ans = s.paintingPlan(2, 1);
        System.out.println(ans);
        ans = s.paintingPlan(2, 4);
        System.out.println(ans);
    }
}