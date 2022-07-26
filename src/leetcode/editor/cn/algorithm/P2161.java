package leetcode.editor.cn.algorithm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Author: Deean
 * Date: 2022-07-26 23:33
 * LastEditTime: 2022-07-26 23:33
 * Description: 2161. 根据给定数字划分数组
 */

public class P2161 {
    // code beginning
    class Solution {
        public int[] pivotArray(int[] nums, int pivot) {
            List<Integer> gt = new ArrayList<>(), eq = new ArrayList<>(), lt = new ArrayList<>();
            for (int num : nums) {
                if (num > pivot) gt.add(num);
                if (num == pivot) eq.add(num);
                if (num < pivot) lt.add(num);
            }

            int[] array = new int[nums.length];
            int index = 0;
            for (Integer integer : lt) array[index++] = integer;
            for (Integer integer : eq) array[index++] = integer;
            for (Integer integer : gt) array[index++] = integer;
            return array;
        }
    }

    public static void main(String[] args) {
        Solution s = new P2161().new Solution();
        int[] ans = s.pivotArray(new int[]{-3, 4, 3, 2}, 2);
        System.out.println(Arrays.toString(ans));
    }
}