package leetcode.algorithm;

import java.util.HashMap;
import java.util.Map;

/**
 * Author: Deean
 * Date: 2022-08-01 23:44
 * LastEditTime: 2022-08-01 23:44
 * Description: 13. 罗马数字转整数
 */

public class P0013 {
    // code beginning
    class Solution {
        public int romanToInt(String s) {
            Map<String, Integer> map = new HashMap<>();
            map.put("I", 1);
            map.put("IV", 4);
            map.put("V", 5);
            map.put("IX", 9);
            map.put("X", 10);
            map.put("XL", 40);
            map.put("L", 50);
            map.put("XC", 90);
            map.put("C", 100);
            map.put("CD", 400);
            map.put("D", 500);
            map.put("CM", 900);
            map.put("M", 1000);

            int num = 0;
            for (int i = 0; i < s.length(); i++) {
                if (i + 1 < s.length() && map.containsKey(s.substring(i, i + 2))) {
                    num += map.get(s.substring(i, i + 2));
                    i++;
                } else {
                    num += map.get(s.substring(i, i + 1));
                }
            }
            return num;
        }
    }

    public static void main(String[] args) {
        Solution s = new P0013().new Solution();
        Object ans = s.romanToInt("MCMXCIV");
        System.out.println(ans);
    }
}