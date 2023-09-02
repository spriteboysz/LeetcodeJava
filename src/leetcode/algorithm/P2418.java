package leetcode.algorithm;

import java.util.Arrays;
import java.util.HashMap;

/**
 * Author: Deean
 * Date: 2023-02-26 17:56
 * FileName: src/leetcode/editor/cn/leetcode.algorithm
 * Description: 2418. 按身高排序
 */

public class P2418 {
    // code beginning
    class Solution {
        public String[] sortPeople(String[] names, int[] heights) {
            HashMap<Integer, String> map = new HashMap<>();
            int n = names.length;
            for (int i = 0; i < n; i++) {
                map.put(heights[i], names[i]);
            }
            Arrays.sort(heights);
            for (int i = 0; i < n; i++) {
                names[n - 1 - i] = map.get(heights[i]);
            }
            return names;
        }
    }

    public static void main(String[] args) {
        Solution s = new P2418().new Solution();
        Object ans = s.sortPeople(new String[]{"Mary", "John", "Emma"}, new int[]{180, 165, 170});
        System.out.println(ans.toString());
    }
}
