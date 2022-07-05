package leetcode.editor.cn.algorithm;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * Author: Deean
 * Date: 2022-07-05 23:29
 * LastEditTime: 2022-07-05 23:29
 * Description: 2053. 数组中第 K 个独一无二的字符串
 */

public class P2053 {
    // code beginning
    class Solution {
        public String kthDistinct(String[] arr, int k) {
            HashMap<String, Integer> hashMap = new HashMap<>();
            for (String str : arr) {
                hashMap.put(str, hashMap.getOrDefault(str, 0) + 1);
            }

            Set<String> set = new HashSet<>();
            for (Map.Entry<String, Integer> entry : hashMap.entrySet()) {
                if (entry.getValue() == 1) set.add(entry.getKey());
            }

            for (String str : arr) {
                if (set.contains(str)) {
                    if (--k == 0) return str;
                }
            }
            return "";
        }
    }

    public static void main(String[] args) {
        Solution s = new P2053().new Solution();
        Object ans = s.kthDistinct(new String[]{"a", "aa", "aaa"}, 1);
        System.out.println(ans);
    }
}