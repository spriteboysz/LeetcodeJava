package algorithm;

/**
 * Author: Deean
 * Date: 2022-07-27 21:58
 * LastEditTime: 2022-07-27 21:58
 * Description: 2249. 统计圆内格点数目
 */

public class P2249 {
    // code beginning
    class Solution {
        public int countLatticePoints(int[][] circles) {
            int minX = Integer.MAX_VALUE, minY = Integer.MAX_VALUE;
            int maxX = Integer.MIN_VALUE, maxY = Integer.MIN_VALUE;
            for (int[] circle : circles) {
                minX = Math.min(minX, circle[0] - circle[2]);
                maxX = Math.max(maxX, circle[0] + circle[2]);
                minY = Math.min(minY, circle[1] - circle[2]);
                maxY = Math.max(maxY, circle[1] + circle[2]);
            }
            int count = 0;
            for (int i = minX; i <= maxX; i++) {
                for (int j = minY; j <= maxY; j++) {
                    for (int[] circle : circles) {
                        if ((i - circle[0]) * (i - circle[0]) + (j - circle[1]) * (j - circle[1]) <= circle[2] * circle[2]) {
                            count++;
                            break;
                        }
                    }
                }
            }
            return count;
        }
    }

    public static void main(String[] args) {
        Solution s = new P2249().new Solution();
        Object ans = s.countLatticePoints(new int[][]{{2, 2, 2}, {3, 4, 1}});
        System.out.println(ans);
    }
}