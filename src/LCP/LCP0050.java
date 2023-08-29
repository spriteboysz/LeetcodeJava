package LCP;

/**
 * Author: Deean
 * Date: 2022-07-15 23:07
 * LastEditTime: 2022-07-15 23:07
 * Description: LCP 50. 宝石补给
 */

public class LCP0050 {
    // code beginning
    class Solution {
        public int giveGem(int[] gem, int[][] operations) {
            for (int[] operation : operations) {
                int src = operation[0], dst = operation[1];
                int given = gem[src] / 2;
                gem[src] = gem[src] - given;
                gem[dst] += given;
                // System.out.println(Arrays.toString(gem));
            }
            int max = Integer.MIN_VALUE, min = Integer.MAX_VALUE;
            for (int cost : gem) {
                max = Math.max(max, cost);
                min = Math.min(min, cost);
            }
            return max - min;
        }
    }

    public static void main(String[] args) {
        Solution s = new LCP0050().new Solution();
        Object ans = s.giveGem(new int[]{100, 0, 50, 100}, new int[][]{{0, 2}, {0, 1}, {3, 0}, {3, 0}});
        System.out.println(ans);
    }
}