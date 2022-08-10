package leetcode.editor.cn.algorithm;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/**
 * Author: Deean
 * Date: 2022-08-10 21:29
 * FileName: src/leetcode/editor/cn/algorithm
 * Description: 2363. 合并相似的物品
 */

public class P2363 {
    // code beginning
    class Solution {
        public List<List<Integer>> mergeSimilarItems(int[][] items1, int[][] items2) {
            Map<Integer, Integer> map = new TreeMap<>();
            for (int[] item : items1) {
                map.put(item[0], item[1]);
            }
            for (int[] item : items2) {
                map.put(item[0], map.getOrDefault(item[0], 0) + item[1]);
            }
            List<List<Integer>> items = new ArrayList<>();
            for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
                List<Integer> item = new ArrayList<>(List.of(new Integer[]{entry.getKey(), entry.getValue()}));
                items.add(item);
            }
            return items;
        }
    }

    public static void main(String[] args) {
        Solution s = new P2363().new Solution();
        Object ans = s.mergeSimilarItems(new int[][]{{1, 1}, {3, 2}, {2, 3}}, new int[][]{{2, 1}, {3, 2}, {1, 3}});
        System.out.println(ans);
    }
}