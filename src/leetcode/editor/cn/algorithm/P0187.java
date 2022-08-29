package leetcode.editor.cn.algorithm;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Author: Deean
 * Date: 2022-08-29 22:52
 * FileName: src/leetcode/editor/cn/algorithm
 * Description: 187. 重复的DNA序列
 */

public class P0187 {
    // code beginning
    class Solution {
        public List<String> findRepeatedDnaSequences(String s) {
            Map<String, Integer> map = new HashMap<>();
            for (int i = 0; i <= s.length() - 10; i++) {
                String sub = s.substring(i, i + 10);
                map.put(sub, map.getOrDefault(sub, 0) + 1);
            }
            List<String> repeated = new ArrayList<>();
            for (String sub : map.keySet()) {
                if (map.get(sub) > 1) repeated.add(sub);
            }
            return repeated;
        }
    }

    public static void main(String[] args) {
        Solution s = new P0187().new Solution();
        Object ans = s.findRepeatedDnaSequences("AAAAACCCCCAAAAACCCCCCAAAAAGGGTTT");
        System.out.println(ans);
    }
}