package algorithm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

/**
 * Author: Deean
 * Date: 2022-07-21 00:00
 * LastEditTime: 2022-07-21 00:00
 * Description: 49. 字母异位词分组
 */

public class P0049 {
    // code beginning
    class Solution {
        public List<List<String>> groupAnagrams(String[] strs) {
            HashMap<String, List<String>> hashMap = new HashMap<>();
            for (String str : strs) {
                char[] array = str.toCharArray();
                Arrays.sort(array);
                String key = new String(array);
                List<String> value = hashMap.getOrDefault(key, new ArrayList<>());
                value.add(str);
                hashMap.put(key, value);
            }
            return new ArrayList<>(hashMap.values());
        }
    }

    public static void main(String[] args) {
        Solution s = new P0049().new Solution();
        Object ans = s.groupAnagrams(new String[]{"eat", "tea", "tan", "ate", "nat", "bat"});
        System.out.println(ans);
    }
}