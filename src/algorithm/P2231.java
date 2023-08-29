package algorithm;

import java.util.ArrayList;
import java.util.List;

/**
 * Author: Deean
 * Date: 2022-08-05 23:31
 * Description: 2231. 按奇偶性交换后的最大数字
 */

public class P2231 {
    // code beginning
    class Solution {
        public int largestInteger(int num) {
            String str = String.valueOf(num);
            List<Integer> odd = new ArrayList<>(), even = new ArrayList<>();
            for (char c : str.toCharArray()) {
                if ((c - '0') % 2 == 0) {
                    even.add(c - '0');
                } else {
                    odd.add(c - '0');
                }
            }
            even.sort((o1, o2) -> o2 - o1);
            odd.sort((o1, o2) -> o2 - o1);
            int e = 0, o = 0, value = 0;
            for (int i = 0; i < str.length(); i++) {
                if ((str.toCharArray()[i] - '0') % 2 == 0) {
                    value = value * 10 + even.get(e++);
                } else {
                    value = value * 10 + odd.get(o++);
                }
            }
            return value;
        }
    }


    public static void main(String[] args) {
        Solution s = new P2231().new Solution();
        Object ans = s.largestInteger(65875);
        System.out.println(ans);
    }
}