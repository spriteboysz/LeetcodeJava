package leetcode.editor.cn.algorithm;

/**
 * Author: Deean
 * Date: 2022-07-05 23:16
 * LastEditTime: 2022-07-05 23:16
 * Description: 1854. 人口最多的年份
 */

public class P1854 {
    // code beginning
    class Solution {
        public int maximumPopulation(int[][] logs) {
            int[] years = new int[101];
            for (int[] log : logs) {
                for (int year = log[0] - 1950; year < log[1] - 1950; year++) {
                    years[year]++;
                }
            }

            int index = 0, max = -1;
            for (int i = 0; i <= 100; i++) {
                if (years[i] > max) {
                    max = years[i];
                    index = i;
                }
            }
            return index + 1950;
        }
    }

    public static void main(String[] args) {
        Solution s = new P1854().new Solution();
        Object ans = s.maximumPopulation(new int[][]{{1950, 1961}, {1960, 1971}, {1970, 1981}});
        System.out.println(ans);
    }
}