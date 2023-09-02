package leetcode.algorithm;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;

/**
 * Author: Deean
 * Date: 2022-08-26 22:10
 * FileName: src/leetcode/editor/cn/leetcode.algorithm
 * Description: 2353. 设计食物评分系统
 */

public class P2353 {
    // code beginning
    class FoodRatings {
        Map<String, TreeMap<Integer, TreeSet<String>>> rate;// group by cuisine, key=rate, value=food name
        Map<String, Integer> r;// key=food name, value=rate
        Map<String, String> f;// key=food name, value=cuisine name

        public FoodRatings(String[] foods, String[] cuisines, int[] ratings) {
            int n = ratings.length;
            rate = new HashMap<>();
            f = new HashMap<>();
            r = new HashMap<>();
            for (int i = 0; i < n; i++) {
                f.put(foods[i], cuisines[i]);
                r.put(foods[i], ratings[i]);
                TreeMap<Integer, TreeSet<String>> t = rate.computeIfAbsent(cuisines[i], k -> new TreeMap<>((a, b) -> b - a));
                TreeSet<String> s = t.computeIfAbsent(ratings[i], k -> new TreeSet<>());
                s.add(foods[i]);
            }
        }

        public void changeRating(String food, int newRating) {
            int score = r.get(food);
            String cuisine = f.get(food);
            TreeMap<Integer, TreeSet<String>> map = rate.get(cuisine);
            TreeSet<String> s = map.get(score);
            s.remove(food);
            if (s.isEmpty()) {
                map.remove(score);
            }
            TreeSet<String> t = map.computeIfAbsent(newRating, k -> new TreeSet<>());
            t.add(food);
            r.put(food, newRating);
        }

        public String highestRated(String cuisine) {
            TreeSet<String> t = rate.get(cuisine).firstEntry().getValue();
            return t.first();
        }
    }

    public static void main(String[] args) {
        FoodRatings foodRatings = new P2353().new FoodRatings(
                new String[]{"kimchi", "miso", "sushi", "moussaka", "ramen", "bulgogi"},
                new String[]{"korean", "japanese", "japanese", "greek", "japanese", "korean"},
                new int[]{9, 12, 8, 15, 14, 7});
        System.out.println(foodRatings.highestRated("korean")); // 返回 "kimchi","kimchi" 是分数最高的韩式料理，评分为 9 。
        System.out.println(foodRatings.highestRated("japanese")); // 返回 "ramen","ramen" 是分数最高的日式料理，评分为 14 。
        foodRatings.changeRating("sushi", 16); // "sushi" 现在评分变更为 16 。
        System.out.println(foodRatings.highestRated("japanese")); // 返回 "sushi","sushi" 是分数最高的日式料理，评分为 16 。
        foodRatings.changeRating("ramen", 16); // "ramen" 现在评分变更为 16 。
        System.out.println(foodRatings.highestRated("japanese")); // 返回 "ramen",但是，"ramen" 的字典序比 "sushi" 更小。
    }
}