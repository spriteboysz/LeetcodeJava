package sword;

import java.util.*;

/**
 * Author: Deean
 * Date: 2022-07-26 22:59
 * LastEditTime: 2022-07-26 22:59
 * Description: 剑指 Offer II 033. 变位词组
 */

public class OII0033 {
    // code beginning
    class Solution {
        public List<List<String>> groupAnagrams(String[] strs) {
            Map<String, List<String>> map = new HashMap<>();
            for (String str : strs) {
                char[] chars = str.toCharArray();
                Arrays.sort(chars);
                String key = String.valueOf(chars);
                List<String> value = map.getOrDefault(key, new ArrayList<>());
                value.add(str);
                map.put(key, value);
            }
            return new ArrayList<>(map.values());
        }
    }

    public static void main(String[] args) {
        Solution s = new OII0033().new Solution();
        Object ans = s.groupAnagrams(new String[]{"eat", "tea", "tan", "ate", "nat", "bat"});
        System.out.println(ans);
    }
}