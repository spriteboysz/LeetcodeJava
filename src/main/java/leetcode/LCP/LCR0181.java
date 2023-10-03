package leetcode.LCP;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Author: Deean
 * Date: 2023-09-30 21:36
 * FileName: src/main/java/leetcode/LCP
 * Description:LCR 181. 字符串中的单词反转
 */

public class LCR0181 {
    // code beginning
    class Solution {
        public String reverseMessage(String message) {
            List<String> words = new ArrayList<>(
                    Arrays.asList(message.trim().split("\\s+"))
            );
            Collections.reverse(words);
            return String.join(" ", words);
        }
    }

    public static void main(String[] args) {
        Solution s = new LCR0181().new Solution();
        var ans = s.reverseMessage("   the    sky is  blue  ");
        System.out.println(ans);
    }
}
