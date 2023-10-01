package leetcode.LCP;

import java.util.Arrays;
import java.util.Comparator;

/**
 * Author: Deean
 * Date: 2023-09-30 15:14
 * FileName: src/main/java/leetcode/algorithm
 * Description:LCR 065. 单词的压缩编码
 */

public class LCR0065 {
    // code beginning
    class Solution {
        public int minimumLengthEncoding(String[] words) {
            Arrays.sort(words, Comparator.comparingInt(String::length));
            int minimum = 0;
            for (int i = 0, n = words.length; i < n; i++) {
                boolean flag = true;
                for (int j = i + 1; j < n; j++) {
                    if (words[j].endsWith(words[i])) {
                        flag = false;
                        break;
                    }
                }
                if (flag) minimum += words[i].length() + 1;
            }
            return minimum;
        }
    }

    public static void main(String[] args) {
        Solution s = new LCR0065().new Solution();
        var ans = s.minimumLengthEncoding(new String[]{"time", "me", "bell"});
        System.out.println(ans);
    }
}
