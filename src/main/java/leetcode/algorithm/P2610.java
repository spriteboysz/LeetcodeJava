package leetcode.algorithm;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Author: Deean
 * Date: 2023-09-04 23:52
 * FileName: src/leetcode/algorithm
 * Description:2610. 转换二维数组
 */

public class P2610 {
    // code beginning
    class Solution {
        public List<List<Integer>> findMatrix(int[] nums) {
            HashMap<Integer, Integer> hash = new HashMap<>();
            for (int num : nums) {
                hash.put(num, hash.getOrDefault(num, 0) + 1);
            }
            List<List<Integer>> matrix = new ArrayList<>();
            for (Map.Entry<Integer, Integer> entry : hash.entrySet()) {
                int k = entry.getKey(), v = entry.getValue(), i = 0;
                for (; i < v && i < matrix.size(); i++) {
                    matrix.get(i).add(k);
                }
                for (; i < v; i++) {
                    List<Integer> row = new ArrayList<>();
                    row.add(k);
                    matrix.add(row);
                }
            }
            return matrix;
        }
    }

    public static void main(String[] args) {
        Solution s = new P2610().new Solution();
        Object ans = s.findMatrix(new int[]{1, 3, 4, 1, 2, 3, 1});
        System.out.println(ans);
    }
}
