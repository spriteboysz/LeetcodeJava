package algorithm;

import java.util.*;

/**
 * Author: Deean
 * Date: 2022-07-24 18:33
 * LastEditTime: 2022-07-24 18:33
 * Description: 2225. 找出输掉零场或一场比赛的玩家
 */

public class P2225 {
    // code beginning
    class Solution {
        public List<List<Integer>> findWinners(int[][] matches) {
            Map<Integer, Integer> map = new HashMap<>();
            for (int[] match : matches) {
                map.put(match[0], map.getOrDefault(match[0], 0));
                map.put(match[1], map.getOrDefault(match[1], 0) + 1);
            }
            List<Integer> lost0 = new ArrayList<>(), lost1 = new ArrayList<>();
            for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
                if (entry.getValue() == 0) lost0.add(entry.getKey());
                if (entry.getValue() == 1) lost1.add(entry.getKey());
            }
            List<List<Integer>> winner = new ArrayList<>();
            Collections.sort(lost0);
            Collections.sort(lost1);
            winner.add(lost0);
            winner.add(lost1);
            return winner;
        }
    }

    public static void main(String[] args) {
        Solution s = new P2225().new Solution();
        Object ans = s.findWinners(new int[][]{{2, 3}, {1, 3}, {5, 4}, {6, 4}});
        System.out.println(ans);
    }
}