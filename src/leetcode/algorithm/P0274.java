package leetcode.algorithm;

import java.util.Arrays;

/**
 * Author: Deean
 * Date: 2022-08-28 15:55
 * FileName: src/leetcode/editor/cn/leetcode.algorithm
 * Description: 274. H 指数
 */

public class P0274 {
    // code beginning
    class Solution {
        public int hIndex(int[] citations) {
            Arrays.sort(citations);
            int h = 0, i = citations.length - 1;
            while (i >= 0 && citations[i] > h) {
                h++;
                i--;
            }
            return h;
        }
    }

    public static void main(String[] args) {
        Solution s = new P0274().new Solution();
        Object ans = s.hIndex(new int[]{1, 3, 1});
        System.out.println(ans);
    }
}