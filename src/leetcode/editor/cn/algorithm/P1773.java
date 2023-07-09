package leetcode.editor.cn.algorithm;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Author: Deean
 * Date: 2022-07-02 21:01
 * LastEditTime: 2022-07-02 21:01
 * Description: .
 */

public class P1773 {
    // code beginning
    class Solution {
        public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
            int count = 0;
            for (List<String> item : items) {
                String type = item.get(0), color = item.get(1), name = item.get(2);
                switch (ruleKey) {
                    case "type" -> {
                        if (type.equals(ruleValue)) count++;
                    }
                    case "color" -> {
                        if (color.equals(ruleValue)) count++;
                    }
                    case "name" -> {
                        if (name.equals(ruleValue)) count++;
                    }
                }
            }
            return count;
        }
    }

    public static void main(String[] args) {
        Solution s = new P1773().new Solution();
        List<List<String>> items = new ArrayList<>();
        String[][] arrays = {{"phone", "blue", "pixel"}, {"computer", "silver", "phone"}, {"phone", "gold", "iphone"}};
        for (String[] arr : arrays) {
            List<String> item = new ArrayList<>();
            Collections.addAll(item, arr);
            items.add(item);
        }

        Object ans = s.countMatches(items, "type", "phone");
        System.out.println(ans);
    }
}