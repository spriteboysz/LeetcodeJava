package leetcode.LCP;

import leetcode.common.Utils;

/**
 * Author: Deean
 * Date: 2023-09-30 22:04
 * FileName: src/main/java/leetcode/LCP
 * Description:LCR 166. 珠宝的最高价值
 */

public class LCR0166 {
    // code beginning
    class Solution {
        public int jewelleryValue(int[][] frame) {
            int m = frame.length, n = frame[0].length;
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    if (i == 0 && j == 0) continue;
                    if (i == 0) {
                        frame[i][j] += frame[i][j - 1];
                    } else if (j == 0) {
                        frame[i][j] += frame[i - 1][j];
                    } else {
                        frame[i][j] += Math.max(frame[i - 1][j], frame[i][j - 1]);
                    }
                }
            }
            return frame[m - 1][n - 1];
        }
    }

    public static void main(String[] args) {
        Solution s = new LCR0166().new Solution();
        var ans = s.jewelleryValue(Utils.to2DArray("[[1,3,1],[1,5,1],[4,2,1]]"));
        System.out.println(ans);
    }
}
