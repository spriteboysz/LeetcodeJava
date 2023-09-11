package leetcode.algorithm;

import java.util.*;

/**
 * Author: Deean
 * Date: 2022-08-06 22:09
 * Description: 599. 两个列表的最小索引总和
 */

public class P0599 {
    // code beginning
    class Solution {
        public String[] findRestaurant(String[] list1, String[] list2) {
            Map<String, Integer> map = new HashMap<>();
            Map<String, Integer> map1 = new HashMap<>(), map2 = new HashMap<>();
            for (int i = 0; i < list1.length; i++) map1.put(list1[i], i);
            for (int i = 0; i < list2.length; i++) map2.put(list2[i], i);
            for (String key : map1.keySet()) {
                if (map2.containsKey(key)) {
                    map.put(key, map1.get(key) + map2.get(key));
                }
            }

            int min = Integer.MAX_VALUE;
            for (int value : map.values()) {
                min = Math.min(min, value);
            }
            List<String> restaurant = new ArrayList<>();
            for (String key : map.keySet()) {
                if (map.get(key) == min) restaurant.add(key);
            }
            return restaurant.toArray(new String[0]);
        }
    }

    public static void main(String[] args) {
        Solution s = new P0599().new Solution();
        String[] ans = s.findRestaurant(new String[]{"Shogun", "Tapioca Express", "Burger King", "KFC"}, new String[]{
                "KFC", "Shogun", "Burger King"});
        System.out.println(Arrays.toString(ans));
    }
}