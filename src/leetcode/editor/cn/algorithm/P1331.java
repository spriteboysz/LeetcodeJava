package leetcode.editor.cn.algorithm;

import java.util.Arrays;
import java.util.HashMap;
import java.util.TreeSet;

/**
 * Author: Deean
 * Date: 2022-07-16 10:49
 * LastEditTime: 2022-07-16 10:49
 * Description: 1331. 数组序号转换
 */

public class P1331 {
    // code beginning
    class Solution {
        public int[] arrayRankTransform(int[] arr) {
            if (arr.length == 0) return new int[0];
            TreeSet<Integer> set = new TreeSet<>();
            for (int num : arr) {
                set.add(num);
            }
            HashMap<Integer, Integer> hashMap = new HashMap<>();
            int index = 1;
            for (int num : set) {
                hashMap.put(num, index);
                index++;
            }

            int[] rank = new int[arr.length];
            for (int i = 0; i < arr.length; i++) {
                rank[i] = hashMap.get(arr[i]);
            }
            return rank;
        }
    }

    public static void main(String[] args) {
        Solution s = new P1331().new Solution();
        int[] ans = s.arrayRankTransform(new int[]{37, 12, 28, 9, 100, 56, 80, 5, 12});
        System.out.println(Arrays.toString(ans));
    }
}