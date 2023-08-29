package algorithm;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Author: Deean
 * Date: 2022-07-17 23:24
 * LastEditTime: 2022-07-17 23:24
 * Description: 451. 根据字符出现频率排序
 */

public class P0451 {
    // code beginning
    class Solution {
        public String frequencySort(String s) {
            HashMap<Character, Integer> count = new HashMap<>();
            for (char c : s.toCharArray()) {
                count.put(c, count.getOrDefault(c, 0) + 1);
            }
            List<Character> characters = new ArrayList<>(count.keySet());
            characters.sort((a, b) -> count.get(b) - count.get(a));
            StringBuilder builder = new StringBuilder();
            for (char c : characters) {
                builder.append(String.valueOf(c).repeat(Math.max(0, count.get(c))));
            }
            return builder.toString();
        }
    }

    public static void main(String[] args) {
        Solution s = new P0451().new Solution();
        Object ans = s.frequencySort("cccaaa");
        System.out.println(ans);
        ans = s.frequencySort("Aabb");
        System.out.println(ans);
    }
}