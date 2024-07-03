package leetcode.algorithm;

import java.util.Arrays;

/**
 * Author: Deean
 * Date: 2024-06-29 22:16
 * FileName: src/main/java/leetcode/algorithm
 * Description: 3074. 重新分装苹果
 */

public class P3074 {
    // code beginning
    class Solution {
        public int minimumBoxes(int[] apple, int[] capacity) {
            int sum = 0;
            for (int num : apple) {
                sum += num;
            }
            Arrays.sort(capacity);
            int cnt = 0;
            for (int i = 0, m = capacity.length; i < m; i++) {
                if (sum > 0) {
                    sum -= capacity[m - 1 - i];
                    cnt++;
                } else {
                    break;
                }
            }
            return cnt;
        }
    }

    public static void main(String[] args) {
        Solution s = new P3074().new Solution();
        var ans = s.minimumBoxes(new int[]{1, 3, 2}, new int[]{4, 3, 1, 5, 2});
        System.out.println(ans);
    }
}
