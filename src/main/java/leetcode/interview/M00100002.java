package leetcode.interview;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

/**
 * Author: Deean
 * Date: 2022-07-17 21:30
 * LastEditTime: 2022-07-17 21:30
 * Description: 面试题 10.02. 变位词组
 */

public class M00100002 {
    // code beginning
    class Solution {
        public List<List<String>> groupAnagrams(String[] strs) {
            HashMap<String, List<String>> hashMap = new HashMap<>();
            for (String word : strs) {
                char[] array = word.toCharArray();
                Arrays.sort(array);
                String key = new String(array);
                List<String> list = hashMap.getOrDefault(key, new ArrayList<>());
                list.add(word);
                hashMap.put(key, list);
            }
            return new ArrayList<>(hashMap.values());
        }
    }

    public static void main(String[] args) {
        Solution s = new M00100002().new Solution();
        Object ans = s.groupAnagrams(new String[]{"eat", "tea", "tan", "ate", "nat", "bat"});
        System.out.println(ans);
    }
}