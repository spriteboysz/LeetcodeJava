package algorithm;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

/**
 * Author: Deean
 * Date: 2022-08-12 22:59
 * FileName: src/leetcode/editor/cn/algorithm
 * Description: 2200. 找出数组中的所有 K 近邻下标
 */

public class P2200 {
    // code beginning
    class Solution {
        public List<Integer> findKDistantIndices(int[] nums, int key, int k) {
            List<Integer> keyIndex = new ArrayList<>();
            for (int i = 0; i < nums.length; i++) {
                if (nums[i] == key) keyIndex.add(i);
            }

            Set<Integer> index = new TreeSet<>();
            for (int i : keyIndex) {
                for (int j = -k; j <= k; j++) {
                    int id = i + j;
                    if (id >= 0 && id < nums.length) index.add(id);
                }
            }
            return new ArrayList<>(index);
        }
    }

    public static void main(String[] args) {
        Solution s = new P2200().new Solution();
        Object ans = s.findKDistantIndices(new int[]{2, 2, 2, 2, 2}, 2, 2);
        System.out.println(ans);
        ans = s.findKDistantIndices(new int[]{3, 4, 9, 1, 3, 9, 5}, 9, 1);
        System.out.println(ans);
    }
}