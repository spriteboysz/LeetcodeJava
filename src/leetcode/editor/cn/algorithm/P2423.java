package leetcode.editor.cn.algorithm;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

/**
 * Author: Deean
 * Date: 2023-02-26 17:46
 * FileName: src/leetcode/editor/cn/algorithm
 * Description: 2423. 删除字符使频率相同
 */

public class P2423 {
    // code beginning
    class Solution {
        public boolean equalFrequency(String word) {
            Map<Character, Integer> hash = new HashMap<>();
            for (char c : word.toCharArray()) {
                hash.put(c, hash.getOrDefault(c, 0) + 1);
            }

            TreeMap<Integer, Integer> tree = new TreeMap<>();
            for (char key : hash.keySet()) {
                tree.put(hash.get(key), tree.getOrDefault(hash.get(key), 0) + 1);
            }
            if (tree.size() > 2) return false;
            if (tree.size() == 1) return hash.size() == 1 || tree.containsKey(1);
            if (tree.containsKey(1) && tree.get(1) == 1) return true;
            if (tree.lastKey() - tree.firstKey() == 1) return tree.lastEntry().getValue() == 1;
            return false;
        }
    }

    public static void main(String[] args) {
        Solution s = new P2423().new Solution();
        Object ans = s.equalFrequency("abcc");
        System.out.println(ans);
    }
}
