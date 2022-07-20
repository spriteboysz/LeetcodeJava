package leetcode.editor.cn.algorithm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

/**
 * Author: Deean
 * Date: 2022-07-20 23:36
 * LastEditTime: 2022-07-20 23:36
 * Description: 1337. 矩阵中战斗力最弱的 K 行
 */

public class P1337 {
    // code beginning
    class Solution {
        public int[] kWeakestRows(int[][] mat, int k) {
            int m = mat.length, n = mat[0].length;
            HashMap<Integer, Integer> hashMap = new HashMap<>();
            for (int i = 0; i < m; i++) {
                int sum = 0;
                for (int j = 0; j < n; j++) {
                    sum += mat[i][j];
                }
                hashMap.put(i, sum);
            }
            List<Integer> keys = new ArrayList<>(hashMap.keySet());
            keys.sort((o1, o2) -> {
                if (!hashMap.get(o1).equals(hashMap.get(o2))) {
                    return hashMap.get(o1) - hashMap.get(o2);
                } else {
                    return o1 - o2;
                }
            });
            int[] rows = new int[k];
            for (int i = 0; i < k; i++) {
                rows[i] = keys.get(i);
            }
            return rows;
        }
    }

    public static void main(String[] args) {
        Solution s = new P1337().new Solution();
        int[] ans = s.kWeakestRows(new int[][]{
                {1, 0, 0, 0},
                {1, 1, 1, 1},
                {1, 0, 0, 0},
                {1, 0, 0, 0}}, 2);
        System.out.println(Arrays.toString(ans));
    }
}