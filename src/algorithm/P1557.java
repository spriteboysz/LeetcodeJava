package algorithm;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Author: Deean
 * Date: 2022-08-21 15:43
 * FileName: src/leetcode/editor/cn/algorithm
 * Description: 1557. 可以到达所有点的最少点数目
 */

public class P1557 {
    // code beginning
    class Solution {
        public List<Integer> findSmallestSetOfVertices(int n, List<List<Integer>> edges) {
            List<Integer> list = new ArrayList<>();
            Set<Integer> end = new HashSet<>();
            for (List<Integer> edge : edges) {
                end.add(edge.get(1));
            }
            for (int i = 0; i < n; i++) {
                if (!end.contains(i)) list.add(i);
            }
            return list;
        }
    }

    public static void main(String[] args) {
        Solution s = new P1557().new Solution();
        List<List<Integer>> vertices = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        list.add(0);
        list.add(1);
        vertices.add(list);
        list.clear();
        list.add(2);
        list.add(1);
        vertices.add(list);
        list.clear();
        list.add(3);
        list.add(1);
        vertices.add(list);
        list.clear();
        list.add(1);
        list.add(4);
        vertices.add(list);
        list.clear();
        list.add(2);
        list.add(4);
        vertices.add(list);

        Object ans = s.findSmallestSetOfVertices(5, vertices);
        System.out.println(ans);
    }
}