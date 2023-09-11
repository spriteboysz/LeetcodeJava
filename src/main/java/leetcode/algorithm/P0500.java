package leetcode.algorithm;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

/**
 * Author: Deean
 * Date: 2022-06-28 23:27
 * LastEditTime: 2022-06-28 23:27
 * Description: 500. 键盘行
 */

public class P0500 {
    // code beginning
    class Solution {
        public String[] findWords(String[] words) {
            String[] keyboard = new String[]{"qwertyuiop", "asdfghjkl", "zxcvbnm"};
            HashMap<Character, Integer> hashMap = new HashMap<>();
            for (int i = 0; i < keyboard.length; i++) {
                for (int j = 0; j < keyboard[i].length(); j++) {
                    hashMap.put(keyboard[i].charAt(j), i);
                }
            }

            ArrayList<String> row = new ArrayList<>();
            for (String word : words) {
                HashSet<Integer> count = new HashSet<>();
                for (int i = 0; i < word.length(); i++) {
                    count.add(hashMap.get(word.toLowerCase().charAt(i)));
                }
                if (count.size() == 1) {
                    row.add(word);
                }
            }
            return row.toArray(new String[0]);
        }
    }

    public static void main(String[] args) {
        Solution s = new P0500().new Solution();
        Object ans = s.findWords(new String[]{"Hello", "Alaska", "Dad", "Peace"});
        System.out.println(ans);
    }
}