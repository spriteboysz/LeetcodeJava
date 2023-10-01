package leetcode.LCP;

import java.util.HashMap;
import java.util.Map;

/**
 * Author: Deean
 * Date: 2023-09-29 23:06
 * FileName: src/main/java/leetcode/algorithm
 * Description:LCR 066. 键值映射
 */

public class LCR0066 {
    // code beginning
    class MapSum {
        Map<String, Integer> map;
        Map<String, Integer> prefix;

        /**
         * Initialize your data structure here.
         */
        public MapSum() {
            map = new HashMap<>();
            prefix = new HashMap<>();
        }

        public void insert(String key, int val) {
            int delta = val - map.getOrDefault(key, 0);
            map.put(key, val);
            for (int i = 1; i <= key.length(); i++) {
                String cur = key.substring(0, i);
                prefix.put(cur, prefix.getOrDefault(cur, 0) + delta);
            }
        }

        public int sum(String prefix) {
            return this.prefix.getOrDefault(prefix, 0);
        }
    }

    public static void main(String[] args) {
        MapSum s = new LCR0066().new MapSum();
        s.insert("apple", 3);
        System.out.println(s.sum("ap"));
        s.insert("app", 2);
        System.out.println(s.sum("ap"));
    }
}
