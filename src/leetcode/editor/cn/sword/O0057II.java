package leetcode.editor.cn.sword;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Author: Deean
 * Date: 2022-07-07 23:40
 * LastEditTime: 2022-07-07 23:40
 * Description: 剑指 Offer 57 - II. 和为s的连续正数序列
 */

public class O0057II {
    // code beginning
    class Solution {
        public int[][] findContinuousSequence(int target) {
            int left = 1, right = 1, sum = 0;
            List<int[]> res = new ArrayList<>();

            while (left <= target / 2) {
                if (sum < target) {
                    sum += right;
                    right++;
                } else if (sum > target) {
                    sum -= left;
                    left++;
                } else {
                    int[] arr = new int[right - left];
                    for (int k = left; k < right; k++) {
                        arr[k - left] = k;
                    }
                    res.add(arr);
                    sum -= left;
                    left++;
                }
            }
            return res.toArray(new int[res.size()][]);
        }
    }

    public static void main(String[] args) {
        Solution s = new O0057II().new Solution();
        int[][] ans = s.findContinuousSequence(15);
        System.out.println(Arrays.toString(ans));
    }
}