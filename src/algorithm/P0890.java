package algorithm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Author: Deean
 * Date: 2022-07-17 17:15
 * LastEditTime: 2022-07-17 17:15
 * Description: 890. 查找和替换模式
 */

public class P0890 {
    // code beginning
    class Solution {
        public List<String> findAndReplacePattern(String[] words, String pattern) {
            List<String> match = new ArrayList<>();
            int[] map = new int[26], visited = new int[26];
            for (String word : words) {
                Arrays.fill(map, -1);
                Arrays.fill(visited, 0);
                boolean matched = true;
                for (int i = 0; i < pattern.length() && matched; i++) {
                    int c1 = word.charAt(i) - 'a', c2 = pattern.charAt(i) - 'a';
                    if (map[c1] == -1 && visited[c2] == 0) {
                        map[c1] = c2;
                        visited[c2] = 1;
                    } else if (map[c1] != c2) {
                        matched = false;
                    }
                }
                if (matched) match.add(word);
            }
            return match;
        }
    }

    public static void main(String[] args) {
        Solution s = new P0890().new Solution();
        Object ans = s.findAndReplacePattern(new String[]{"abc", "deq", "mee", "aqq", "dkd", "ccc"}, "abb");
        System.out.println(ans);
    }
}