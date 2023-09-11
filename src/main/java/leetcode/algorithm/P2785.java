package leetcode.algorithm;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Author: Deean
 * Date: 2023-08-30 21:04
 * FileName: src/leetcode.common
 * Description:2785. 将字符串中的元音字母排序
 */

public class P2785 {

    class Solution {
        public String sortVowels(String s) {
            List<Character> vowelList = new ArrayList<>();
            char[] ss = s.toCharArray();
            String VOWELS = "AEIOUaeiou";
            for (char c : ss) {
                if (VOWELS.indexOf(c) >= 0) {
                    vowelList.add(c);
                }
            }
            Collections.sort(vowelList);
            for (int i = 0, j = 0; i < ss.length; i++) {
                if (VOWELS.indexOf(ss[i]) >= 0) {
                    ss[i] = vowelList.get(j++);
                }
            }
            return String.valueOf(ss);
        }
    }

    public static void main(String[] args) {
        Solution s = new P2785().new Solution();
        Object ans = s.sortVowels("lEetcOde");
        System.out.println(ans);
    }
}
