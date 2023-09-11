package leetcode.algorithm;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;

/**
 * Author: Deean
 * Date: 2022-07-17 23:43
 * LastEditTime: 2022-07-17 23:43
 * Description: 791. 自定义字符串排序
 */

public class P0791 {
    // code beginning
    class Solution {
        public String customSortString(String order, String s) {
            HashMap<Character, Integer> hashMap = new HashMap<>();
            for (int i = 0; i < order.length(); i++) {
                hashMap.put(order.charAt(i), i);
            }
            List<Character> temp = new ArrayList<>();
            List<Character> list = new ArrayList<>();
            for (char c : s.toCharArray()) {
                if (hashMap.containsKey(c)) {
                    list.add(c);
                } else {
                    temp.add(c);
                }
            }
            list.sort(Comparator.comparingInt(hashMap::get));
            list.addAll(temp);
            StringBuilder builder = new StringBuilder();
            list.forEach(builder::append);
            return builder.toString();
        }
    }

    public static void main(String[] args) {
        Solution s = new P0791().new Solution();
        Object ans = s.customSortString("cbafg", "abcd");
        System.out.println(ans);
    }
}