package leetcode.algorithm;

import java.util.*;

/**
 * Author: Deean
 * Date: 2023-09-17 15:08
 * FileName: src/main/java/leetcode/algorithm
 * Description:1268. 搜索推荐系统
 */

public class P1268 {
    // code beginning
    class Solution {
        public List<List<String>> suggestedProducts(String[] products, String searchWord) {
            Arrays.sort(products);
            Map<String, List<String>> hash = new HashMap<>();
            for (int i = 0, n = searchWord.length(); i < n; i++) {
                String key = searchWord.substring(0, i + 1);
                for (String product : products) {
                    if (product.startsWith(key)) {
                        List<String> values = hash.getOrDefault(key, new ArrayList<>());
                        if (values.size() >= 3) {
                            break;
                        }
                        values.add(product);
                        hash.put(key, values);
                    }
                }
            }
            List<List<String>> suggested = new ArrayList<>();
            for (int i = 0, n = searchWord.length(); i < n; i++) {
                String key = searchWord.substring(0, i + 1);
                suggested.add(hash.getOrDefault(key, new ArrayList<>()));
            }
            return suggested;
        }
    }

    public static void main(String[] args) {
        Solution s = new P1268().new Solution();
        var ans = s.suggestedProducts(new String[]{"mobile","mouse","moneypot","monitor","mousepad"}, "mouse");
        System.out.println(ans);
    }
}
