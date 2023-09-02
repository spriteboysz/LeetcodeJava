package leetcode.algorithm;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Author: Deean
 * Date: 2022-07-20 23:06
 * LastEditTime: 2022-07-20 23:06
 * Description: 1387. 将整数按权重排序
 */

public class P1387 {
    // code beginning
    class Solution {
        public int getKth(int lo, int hi, int k) {
            HashMap<Integer, Integer> hashMap = new HashMap<>();
            for (int i = lo; i <= hi; i++) {
                hashMap.put(i, weight(i));
            }
            List<Integer> keys = new ArrayList<>(hashMap.keySet());
            keys.sort((o1, o2) -> {
                if (!hashMap.get(o1).equals(hashMap.get(o2))) {
                    return hashMap.get(o1) - hashMap.get(o2);
                } else {
                    return o1 - o2;
                }
            });
            return keys.get(k - 1);
        }

        private int weight(int num) {
            int count = 0;
            while (num > 1) {
                if (num % 2 == 0) {
                    num /= 2;
                } else {
                    num = num * 3 + 1;
                }
                count++;
            }
            return count;
        }
    }

    public static void main(String[] args) {
        Solution s = new P1387().new Solution();
        Object ans = s.getKth(7, 11, 4);
        System.out.println(ans);
        ans = s.getKth(144, 163, 5);
        System.out.println(ans);
    }
}