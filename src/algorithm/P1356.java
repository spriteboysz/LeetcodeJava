package algorithm;

import java.util.Arrays;

/**
 * Author: Deean
 * Date: 2022-07-05 22:52
 * LastEditTime: 2022-07-05 22:52
 * Description: 1356. 根据数字二进制下 1 的数目排序
 */

public class P1356 {
    // code beginning
    class Solution {
        public int[] sortByBits(int[] arr) {
            int[] map = new int[arr.length];
            for (int i = 0; i < arr.length; i++) {
                map[i] = Integer.bitCount(arr[i]) * 10000000 + arr[i];
            }
            Arrays.sort(map);
            for (int i = 0; i < map.length; i++) {
                map[i] = map[i] % 10000000;
            }
            return map;
        }
    }

    public static void main(String[] args) {
        Solution s = new P1356().new Solution();
        int[] ans = s.sortByBits(new int[]{1024, 512, 256, 128, 64, 32, 16, 8, 4, 2, 1});
        System.out.println(Arrays.toString(ans));
    }
}