package leetcode.algorithm;

import java.util.*;

/**
 * Author: Deean
 * Date: 2023-09-13 23:06
 * FileName: src/main/java/leetcode/algorithm
 * Description:1418. 点菜展示表
 */

public class P1418 {
    // code beginning
    class Solution {
        public List<List<String>> displayTable(List<List<String>> orders) {
            Map<Integer, Map<String, Integer>> hash = new HashMap<>();
            Set<String> foods = new HashSet<>();
            for (List<String> order : orders) {
                int id = Integer.parseInt(order.get(1));
                String food = order.get(2);
                foods.add(food);
                Map<String, Integer> hash1 = hash.getOrDefault(id, new HashMap<>());
                hash1.put(food, hash1.getOrDefault(food, 0) + 1);
                hash.put(id, hash1);
            }

            int n = foods.size(),  m = hash.size();
            List<String> names = new ArrayList<>(foods);
            Collections.sort(names);
            List<Integer> ids = new ArrayList<>(hash.keySet());
            Collections.sort(ids);

            List<List<String>> table = new ArrayList<>();
            List<String> header = new ArrayList<>();
            header.add("Table");
            header.addAll(names);
            table.add(header);
            for (int i = 0; i < m; ++i) {
                int id = ids.get(i);
                Map<String, Integer> cnt = hash.get(id);
                List<String> row = new ArrayList<>();
                row.add(Integer.toString(id));
                for (int j = 0; j < n; ++j) {
                    row.add(Integer.toString(cnt.getOrDefault(names.get(j), 0)));
                }
                table.add(row);
            }
            return table;
        }
    }

    public static void main(String[] args) {
        Solution s = new P1418().new Solution();
        List<List<String>> orders = new ArrayList<>();
        orders.add(Arrays.asList("David", "3", "Ceviche"));
        orders.add(Arrays.asList("Corina", "10", "Beef Burrito"));
        orders.add(Arrays.asList("David", "3", "Fried Chicken"));
        orders.add(Arrays.asList("David", "3", "Fried Chicken"));
        orders.add(Arrays.asList("Carla", "5", "Ceviche"));
        orders.add(Arrays.asList("Ros", "3", "Ceviche"));
        var ans = s.displayTable(orders);
        System.out.println(ans);
    }
}
