package leetcode.algorithm;

import leetcode.common.Utils;

import java.util.Arrays;

/**
 * Author: Deean
 * Date: 2023-09-15 22:14
 * FileName: src/main/java/leetcode/algorithm
 * Description:973. 最接近原点的 K 个点
 */

public class P0973 {
    // code beginning
    class Solution {
        public int[][] kClosest(int[][] points, int k) {
            Arrays.sort(points, (p1, p2) ->
                    p1[0] * p1[0] + p1[1] * p1[1] - p2[0] * p2[0] - p2[1] * p2[1]
            );
            return Arrays.copyOfRange(points, 0, k);
        }
    }

    public static void main(String[] args) {
        Solution s = new P0973().new Solution();
        var ans = s.kClosest(Utils.to2DArray("[[3,3],[5,-1],[-2,4]]"), 2);
        System.out.println(Arrays.deepToString(ans));
    }
}
