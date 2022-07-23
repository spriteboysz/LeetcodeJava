package leetcode.editor.cn.algorithm;

import java.util.HashMap;
import java.util.Map;

/**
 * Author: Deean
 * Date: 2022-07-23 14:48
 * LastEditTime: 2022-07-23 14:48
 * Description: 447. 回旋镖的数量
 */

public class P0447 {
    // code beginning
    class Solution {
        public int numberOfBoomerangs(int[][] points) {
            int sum = 0;
            for (int[] p1 : points) {
                Map<Integer, Integer> count = new HashMap<>();
                for (int[] p2 : points) {
                    int dis2 = (p1[0] - p2[0]) * (p1[0] - p2[0]) + (p1[1] - p2[1]) * (p1[1] - p2[1]);
                    count.put(dis2, count.getOrDefault(dis2, 0) + 1);
                }
                for (Map.Entry<Integer, Integer> entry : count.entrySet()) {
                    sum += entry.getValue() * (entry.getValue() - 1);
                }
            }
            return sum;
        }
    }

    public static void main(String[] args) {
        Solution s = new P0447().new Solution();
        Object ans = s.numberOfBoomerangs(new int[][]{{1, 1}, {2, 2}, {3, 3}});
        System.out.println(ans);
    }
}