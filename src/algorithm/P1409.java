package algorithm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Author: Deean
 * Date: 2022-07-17 14:16
 * LastEditTime: 2022-07-17 14:16
 * Description: 1409. 查询带键的排列
 */

public class P1409 {
    // code beginning
    class Solution {
        public int[] processQueries(int[] queries, int m) {
            int[] index = new int[queries.length];
            List<Integer> list = new ArrayList<>();
            for (int i = 0; i < m; i++) {
                list.add(i + 1);
            }
            for (int i = 0; i < queries.length; i++) {
                int position = -1;
                for (int j = 0; j < m; j++) {
                    if (list.get(j) == queries[i]) {
                        position = j;
                        break;
                    }
                }
                index[i] = position;
                list.remove(position);
                list.add(0, queries[i]);
            }
            return index;
        }
    }

    public static void main(String[] args) {
        Solution s = new P1409().new Solution();
        int[] ans = s.processQueries(new int[]{7, 5, 5, 8, 3}, 8);
        System.out.println(Arrays.toString(ans));
    }
}