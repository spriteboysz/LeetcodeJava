package algorithm;

/**
 * Author: Deean
 * Date: 2022-07-08 22:17
 * LastEditTime: 2022-07-08 22:17
 * Description: 1252. 奇数值单元格的数目
 */

public class P1252 {
    // code beginning
    class Solution {
        public int oddCells(int m, int n, int[][] indices) {
            int[] row = new int[m], col = new int[n];
            for (int[] index : indices) {
                row[index[0]]++;
                col[index[1]]++;
            }
            int count = 0;
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    if ((row[i] + col[j]) % 2 == 1) count++;
                }
            }
            return count;
        }
    }

    public static void main(String[] args) {
        Solution s = new P1252().new Solution();
        Object ans = s.oddCells(2, 2, new int[][]{{1, 1}, {0, 0}});
        System.out.println(ans);
    }
}