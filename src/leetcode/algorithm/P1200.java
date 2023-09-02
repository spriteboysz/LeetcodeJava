package leetcode.algorithm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Author: Deean
 * Date: 2022-07-04 22:49
 * LastEditTime: 2022-07-04 22:49
 * Description: 1200. 最小绝对差
 */

public class P1200 {
    // code beginning
    class Solution {
        public List<List<Integer>> minimumAbsDifference(int[] arr) {
            List<List<Integer>> list = new ArrayList<>();
            Arrays.sort(arr);
            int min = Integer.MAX_VALUE;
            for (int i = 0; i < arr.length - 1; i++) {
                List<Integer> cur = new ArrayList<>();
                if (arr[i + 1] - arr[i] < min) {
                    min = arr[i + 1] - arr[i];
                    list.clear();
                    cur.add(arr[i]);
                    cur.add(arr[i + 1]);
                    list.add(cur);
                } else if (arr[i + 1] - arr[i] == min) {
                    cur.add(arr[i]);
                    cur.add(arr[i + 1]);
                    list.add(cur);
                }
            }
            return list;
        }
    }

    public static void main(String[] args) {
        Solution s = new P1200().new Solution();
        Object ans = s.minimumAbsDifference(new int[]{3, 8, -10, 23, 19, -4, -14, 27});
        System.out.println(ans);
    }
}