package algorithm;

import java.util.HashMap;
import java.util.Map;

/**
 * Author: Deean
 * Date: 2022-07-24 23:49
 * LastEditTime: 2022-07-24 23:49
 * Description: 1128. 等价多米诺骨牌对的数量
 */

public class P1128 {
    // code beginning
    class Solution {
        public int numEquivDominoPairs(int[][] dominoes) {
            Map<Integer, Integer> map = new HashMap<>();
            for (int[] domino : dominoes) {
                int key = Math.min(domino[0] * 10 + domino[1], domino[0] + domino[1] * 10);
                map.put(key, map.getOrDefault(key, 0) + 1);
            }
            int count = 0;
            for (int num : map.values()) {
                count += num * (num - 1) / 2;
            }
            return count;
        }
    }

    public static void main(String[] args) {
        Solution s = new P1128().new Solution();
        Object ans = s.numEquivDominoPairs(new int[][]{{1, 2}, {2, 1}, {3, 4}, {5, 6}});
        System.out.println(ans);
    }
}