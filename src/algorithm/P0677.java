package algorithm;

import java.util.HashMap;
import java.util.Map;

/**
 * Author: Deean
 * Date: 2022-07-23 22:48
 * LastEditTime: 2022-07-23 22:48
 * Description: 677. 键值映射
 */

public class P0677 {
    // code beginning
    class MapSum {
        Map<String, Integer> map;
        Map<String, Integer> prefixMap;

        public MapSum() {
            map = new HashMap<>();
            prefixMap = new HashMap<>();
        }

        public void insert(String key, int val) {
            int delta = val - map.getOrDefault(key, 0);
            map.put(key, val);
            for (int i = 1; i <= key.length(); i++) {
                String cur = key.substring(0, i);
                prefixMap.put(cur, prefixMap.getOrDefault(cur, 0) + delta);
            }
        }

        public int sum(String prefix) {
            return prefixMap.getOrDefault(prefix, 0);
        }
    }

    public static void main(String[] args) {
        MapSum mapSum = new P0677().new MapSum();
        mapSum.insert("apple", 3);
        System.out.println(mapSum.sum("ap"));           // 返回 3 (apple = 3)
        mapSum.insert("app", 2);
        System.out.println(mapSum.sum("ap"));           // 返回 5 (apple + app = 3 + 2 = 5)
    }
}