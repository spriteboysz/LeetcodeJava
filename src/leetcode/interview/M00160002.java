package leetcode.interview;

import java.util.HashMap;

/**
 * Author: Deean
 * Date: 2022-07-17 18:01
 * LastEditTime: 2022-07-17 18:01
 * Description: 面试题 16.02. 单词频率
 */

public class M00160002 {
    // code beginning
    class WordsFrequency {
        HashMap<String, Integer> dict;

        public WordsFrequency(String[] book) {
            dict = new HashMap<>();
            for (String word : book) {
                dict.put(word, dict.getOrDefault(word, 0) + 1);
            }
        }

        public int get(String word) {
            return dict.getOrDefault(word, 0);
        }
    }

    public static void main(String[] args) {
        WordsFrequency wordsFrequency = new M00160002().new WordsFrequency(new String[]{"i", "have", "an", "apple",
                "he", "have", "a", "pen"});
        System.out.println(wordsFrequency.get("you")); //返回0，"you"没有出现过
        System.out.println(wordsFrequency.get("have")); //返回2，"have"出现2次
        System.out.println(wordsFrequency.get("an")); //返回1
        System.out.println(wordsFrequency.get("apple")); //返回1
        System.out.println(wordsFrequency.get("pen")); //返回1
    }
}