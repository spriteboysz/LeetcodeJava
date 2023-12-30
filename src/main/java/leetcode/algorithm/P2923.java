package leetcode.algorithm;

/**
 * Author: Deean
 * Date: 2023-12-30 21:57
 * FileName: src/main/java/leetcode/algorithm
 * Description: 2923. 找到冠军 I
 */

public class P2923 {
    // code beginning
    class Solution {
        public int findChampion(int[][] grid) {
            for (int j = 0; ; j++) {
                boolean flag = true;
                for (int[] cols : grid) {
                    if (cols[j] != 0) {
                        flag = false;
                        break;
                    }
                }
                if (flag) {
                    return j;
                }
            }
        }
    }

    public static void main(String[] args) {
        Solution s = new P2923().new Solution();
        var ans = s.findChampion(new int[][]{{0, 0, 1}, {1, 0, 1}, {0, 0, 0}});
        System.out.println(ans);
    }
}
