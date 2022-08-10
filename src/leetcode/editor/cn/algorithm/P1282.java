package leetcode.editor.cn.algorithm;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Author: Deean
 * Date: 2022-08-10 22:22
 * FileName: src/leetcode/editor/cn/algorithm
 * Description: 1282. 用户分组
 */

public class P1282 {
    // code beginning
    class Solution {
        public List<List<Integer>> groupThePeople(int[] groupSizes) {
            Map<Integer, List<Integer>> map = new HashMap<>();
            for (int i = 0; i < groupSizes.length; i++) {
                List<Integer> value = new ArrayList<>();
                if (map.containsKey(groupSizes[i])) {
                    value = map.get(groupSizes[i]);
                }
                value.add(i);
                map.put(groupSizes[i], value);
            }
            // System.out.println(map);
            List<List<Integer>> group = new ArrayList<>();
            for (Map.Entry<Integer, List<Integer>> entry : map.entrySet()) {
                List<Integer> list = entry.getValue();
                int round = list.size() / entry.getKey();
                for (int i = 0; i < round; i++) {
                    List<Integer> pr = new ArrayList<>();
                    for (int j = 0; j < entry.getKey(); j++) {
                        pr.add(list.remove(0));
                    }
                    group.add(pr);
                }
            }
            return group;
        }
    }

    public static void main(String[] args) {
        Solution s = new P1282().new Solution();
        Object ans = s.groupThePeople(new int[]{2, 1, 3, 3, 3, 2});
        System.out.println(ans);
    }
}