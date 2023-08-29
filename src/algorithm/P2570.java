/**
 * Author: Deean
 * Date: 2023-02-25 23:37
 * LastEditTime: 2023-02-25 23:37
 * Description: P2570
 */

package algorithm;

import java.util.*;

public class P2570 {
    class Solution {
        public int[][] mergeArrays(int[][] nums1, int[][] nums2) {
            HashMap<Integer, Integer> map = new HashMap<>();
            for (int[] num : nums1) {
                map.put(num[0], map.getOrDefault(num[0], 0) + num[1]);
            }
            for (int[] num : nums2) {
                map.put(num[0], map.getOrDefault(num[0], 0) + num[1]);
            }

            List<Integer> keys = new ArrayList<>(map.keySet());
            Collections.sort(keys);
            int[][] rs = new int[keys.size()][2];
            for (int i = 0; i < keys.size(); i++) {
                rs[i][0] = keys.get(i);
                rs[i][1] = map.get(keys.get(i));
            }
            return rs;
        }
    }

    public static void main(String[] args) {
        P2570.Solution solution = new P2570().new Solution();
        int[][] ans = solution.mergeArrays(new int[][]{{1, 2}, {2, 3}, {4, 5}}, new int[][]{{1, 4}, {3, 2}, {4, 1}});
        System.out.println(Arrays.toString(ans));
    }
}
