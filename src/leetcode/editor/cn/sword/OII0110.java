package leetcode.editor.cn.sword;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * Author: Deean
 * Date: 2022-08-21 23:16
 * FileName: src/leetcode/editor/cn/sword
 * Description: 剑指 Offer II 110. 所有路径
 */

public class OII0110 {
    // code beginning
    class Solution {
        public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
            List<List<Integer>> paths = new ArrayList<>();
            LinkedList<List<Integer>> queue = new LinkedList<>();
            List<Integer> start = new ArrayList<>();
            start.add(0);
            queue.add(start);
            while (!queue.isEmpty()) {
                List<Integer> path = queue.pollFirst();
                Integer lastNode = path.get(path.size() - 1);
                if (lastNode == graph.length - 1) {
                    paths.add(path);
                } else {
                    for (int next : graph[lastNode]) {
                        List<Integer> nextPath = new ArrayList<>(path);
                        nextPath.add(next);
                        queue.addLast(nextPath);
                    }
                }
            }
            return paths;
        }
    }

    public static void main(String[] args) {
        Solution s = new OII0110().new Solution();
        Object ans = s.allPathsSourceTarget(new int[][]{{4, 3, 1}, {3, 2, 4}, {3}, {4}, {}});
        System.out.println(ans);
    }
}