package algorithm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Author: Deean
 * Date: 2022-07-10 22:54
 * LastEditTime: 2022-07-10 22:54
 * Description: 1089. 复写零
 */

public class P1089 {
    // code beginning
    class Solution {
        public void duplicateZeros(int[] arr) {
            List<Integer> list = new ArrayList<>();
            for (int i = 0; i < arr.length && list.size() < arr.length; i++) {
                list.add(arr[i]);
                if (arr[i] == 0) list.add(0);
            }
            for (int i = 0; i < arr.length; i++) {
                arr[i] = list.get(i);
            }
            System.out.println(Arrays.toString(arr));
        }
    }

    public static void main(String[] args) {
        Solution s = new P1089().new Solution();
        s.duplicateZeros(new int[]{1, 0, 2, 3, 0, 4, 5, 0});
    }
}