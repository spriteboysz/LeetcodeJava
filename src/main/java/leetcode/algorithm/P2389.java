package leetcode.algorithm;

import java.util.Arrays;

/**
 * Author: Deean
 * Date: 2023-09-09 20:57
 * FileName: src/leetcode/algorithm
 * Description:2389. 和有限的最长子序列
 */

public class P2389 {
    // code beginning
    class Solution {
        public int[] answerQueries(int[] nums, int[] queries) {
            Arrays.sort(nums);
            int n = nums.length, m = queries.length, cur = 0;
            int[] pref = new int[n], ans = new int[m];
            for (int i = 0; i < n; i++) {
                cur += nums[i];
                pref[i] = cur;
            }
            for (int j = 0; j < m; j++) {
                if (queries[j] < pref[0]) {
                    ans[j] = 0;
                } else if (queries[j] >= pref[n - 1]) {
                    ans[j] = n;
                } else {
                    for (int i = 0; i < n; i++) {
                        if (pref[i] > queries[j]) {
                            ans[j] = i;
                            break;
                        }
                    }
                }
            }
            return ans;
        }
    }

    public static void main(String[] args) {
        Solution s = new P2389().new Solution();
        var ans = s.answerQueries(new int[]{4, 5, 2, 1}, new int[]{3, 10, 21});
        System.out.println(Arrays.toString(ans));
    }
}
