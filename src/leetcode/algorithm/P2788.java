package leetcode.algorithm;

import java.util.ArrayList;
import java.util.List;

/**
 * Author: Deean
 * Date: 2023-08-29 19:21
 * FileName: src/leetcode.algorithm
 * Description:2788. 按分隔符拆分字符串
 */

public class P2788 {
    // code beginning
    class Solution {
        public List<String> splitWordsBySeparator(List<String> words, char separator) {
            List<String> ss = new ArrayList<>();
            for (String word : words) {
                for (int i = 0, start = 0; i < word.length(); i++) {
                    if (word.charAt(i) == separator) {
                        if (start != i) {
                            ss.add(word.substring(start, i));
                        }
                        start = i + 1;
                    } else if (i == word.length() - 1) {
                        ss.add(word.substring(start, i + 1));
                    }
                }
            }
            return ss;
        }

    }

    public static void main(String[] args) {
        Solution s = new P2788().new Solution();
        List<String> words = List.of("one.two.three", "four.five", "six");
        Object ans = s.splitWordsBySeparator(words, '.');
        System.out.println(ans);
    }
}
