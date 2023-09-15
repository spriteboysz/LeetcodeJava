package leetcode.algorithm;

import java.util.ArrayList;
import java.util.List;

/**
 * Author: Deean
 * Date: 2023-09-14 23:08
 * FileName: src/main/java/leetcode/algorithm
 * Description:1324. 竖直打印单词
 */

public class P1324 {
    // code beginning
    class Solution {
        public List<String> printVertically(String s) {
            String[] words = s.split(" ");
            List<String> vertical = new ArrayList<>();
            int maximum = 0;
            for (String word : words) {
                maximum = Math.max(maximum, word.length());
            }
            for (int j = 0; j < maximum; j++) {
                StringBuilder ss = new StringBuilder();
                for (String word : words) {
                    if (j < word.length()) {
                        ss.append(word.charAt(j));
                    } else {
                        ss.append(" ");
                    }
                }
                vertical.add(ss.toString().stripTrailing());
            }
            return vertical;
        }
    }

    public static void main(String[] args) {
        Solution s = new P1324().new Solution();
        var ans = s.printVertically("CONTEST IS COMING");
        System.out.println(ans);
    }
}
