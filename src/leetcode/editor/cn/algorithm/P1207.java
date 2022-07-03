package leetcode.editor.cn.algorithm;

import java.util.HashMap;
import java.util.HashSet;

/**
 * Author: Deean
 * Date: 2022-07-03 23:50
 * LastEditTime: 2022-07-03 23:50
 * Description: 1207. 独一无二的出现次数
 */

public class P1207 {
    // code beginning
    class Solution {
        public boolean uniqueOccurrences(int[] arr) {
            HashMap<Integer, Integer> hashMap = new HashMap<>();
            for (int num : arr) {
                hashMap.put(num, hashMap.getOrDefault(num, 0) + 1);
            }

            HashSet<Integer> set = new HashSet<>(hashMap.values());
            return set.size() == hashMap.values().size();
        }
    }

    public static void main(String[] args) {
        Solution s = new P1207().new Solution();
        Object ans = s.uniqueOccurrences(new int[]{-3, 0, 1, -3, 1, 1, 1, -3, 10, 0});
        System.out.println(ans);
    }
}