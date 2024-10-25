package leetcode.LCP;

import java.util.*;

/**
 * Author: Deean
 * Date: 2023-09-29 15:21
 * FileName: src/main/java/leetcode/algorithm
 * Description:LCR 033. 字母异位词分组
 */

public class LCR0033 {
    // code beginning
    class Solution {
        public List<List<String>> groupAnagrams(String[] strs) {
            Map<String, List<String>> hash = new HashMap<>();
            for (String str : strs) {
                char[] chars = str.toCharArray();
                Arrays.sort(chars);
                String key = String.valueOf(chars);
                List<String> value = hash.getOrDefault(key, new ArrayList<>());
                value.add(str);
                hash.put(key, value);
            }
            return null;
        }
    }

    public static void main(String[] args) {
        Solution s = new LCR0033().new Solution();
        var ans = s.groupAnagrams(new String[]{"eat", "tea", "tan", "ate", "nat", "bat"});
        System.out.println(ans);
    }
}
