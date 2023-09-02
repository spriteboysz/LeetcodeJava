package leetcode.algorithm;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Author: Deean
 * Date: 2023-02-26 16:30
 * FileName: src/leetcode/editor/cn/leetcode.algorithm
 * Description: 2451. 差值数组不同的字符串
 */

public class P2451 {
    // code beginning
    class Solution {
        public String oddString(String[] words) {
            Map<String, List<String>> map = new HashMap<>();
            for (String word : words) {
                StringBuilder sb = new StringBuilder();
                for (int i = 1; i < word.length(); i++) {
                    sb.append(word.charAt(i) - word.charAt(i - 1)).append("#");
                }
                String key= sb.deleteCharAt(sb.length() - 1).toString();
                List<String> value = map.getOrDefault(key, new ArrayList<>());
                value.add(word);
                map.put(key, value);
            }

            for (Map.Entry<String, List<String>> entry : map.entrySet()) {
                if (entry.getValue().size() == 1) {
                    return entry.getValue().get(0);
                }
            }
            return "";

        }
    }

    public static void main(String[] args) {
        Solution s = new P2451().new Solution();
        Object ans = s.oddString(new String[]{"adc", "wzy", "abc"});
        System.out.println(ans);
    }
}
