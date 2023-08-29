package algorithm;

import java.util.Arrays;

/**
 * Author: Deean
 * Date: 2022-07-10 17:18
 * LastEditTime: 2022-07-10 17:18
 * Description: 1710. 卡车上的最大单元数
 */

public class P1710 {
    // code beginning
    class Solution {
        public int maximumUnits(int[][] boxTypes, int truckSize) {
            Arrays.sort(boxTypes, (o1, o2) -> o2[1] - o1[1]);
            int count = 0;
            for (int[] box : boxTypes) {
                if (box[0] < truckSize) {
                    count += box[0] * box[1];
                    truckSize -= box[0];
                } else {
                    count += truckSize * box[1];
                    return count;
                }
            }
            return count;
        }
    }

    public static void main(String[] args) {
        Solution s = new P1710().new Solution();
        Object ans = s.maximumUnits(new int[][]{{5, 10}, {2, 5}, {4, 7}, {3, 9}}, 10);
        System.out.println(ans);
    }
}