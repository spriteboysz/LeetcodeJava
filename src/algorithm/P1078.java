package algorithm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Author: Deean
 * Date: 2022-07-23 16:14
 * LastEditTime: 2022-07-23 16:14
 * Description: 1078. Bigram 分词
 */

public class P1078 {
    // code beginning
    class Solution {
        public String[] findOcurrences(String text, String first, String second) {
            List<String> ocureences = new ArrayList<>();
            String[] words = text.split(" ");
            for (int i = 2; i < words.length; i++) {
                if (words[i - 2].equals(first) && words[i - 1].equals(second)) {
                    ocureences.add(words[i]);
                }
            }
            return ocureences.toArray(new String[0]);
        }
    }

    public static void main(String[] args) {
        Solution s = new P1078().new Solution();
        Object[] ans = s.findOcurrences("we will we will rock you", "we", "will");
        System.out.println(Arrays.toString(ans));
    }
}