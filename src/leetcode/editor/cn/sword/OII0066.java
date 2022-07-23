package leetcode.editor.cn.sword;

import java.util.HashMap;
import java.util.Map;

/**
 * Author: Deean
 * Date: 2022-07-23 22:33
 * LastEditTime: 2022-07-23 22:33
 * Description: 剑指 Offer II 066. 单词之和
 */

public class OII0066 {
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
        MapSum mapSum = new OII0066().new MapSum();
        mapSum.insert("apple", 3);
        System.out.println(mapSum.sum("ap"));   // return 3 (apple = 3)
        mapSum.insert("app", 2);
        System.out.println(mapSum.sum("ap"));   // return 5 (apple + app = 3 + 2 = 5)
    }
}