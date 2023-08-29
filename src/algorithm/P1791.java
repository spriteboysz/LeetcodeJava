package algorithm;

/**
 * Author: Deean
 * Date: 2022-07-01 21:55
 * LastEditTime: 2022-07-01 21:55
 * Description: 1791. 找出星型图的中心节点
 */

public class P1791 {
    // code beginning
    class Solution {
        public int findCenter(int[][] edges) {
            int a = edges[0][0], b = edges[0][1];
            return (a == edges[1][0] || a == edges[1][1]) ? a : b;
        }
    }

    public static void main(String[] args) {
        Solution s = new P1791().new Solution();
        Object ans = s.findCenter(new int[][]{{1, 2}, {5, 1}, {1, 3}, {1, 4}});
        System.out.println(ans);
    }
}