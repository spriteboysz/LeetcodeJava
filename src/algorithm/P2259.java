package algorithm;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Author: Deean
 * Date: 2022-07-27 21:46
 * LastEditTime: 2022-07-27 21:46
 * Description: 2259. 移除指定数字得到的最大结果
 */

public class P2259 {
    // code beginning
    class Solution {
        public String removeDigit(String number, char digit) {
            List<String> list = new ArrayList<>();
            for (int i = 0; i < number.length(); i++) {
                if (number.charAt(i) == digit) {
                    String s = number.substring(0, i) + number.substring(i + 1);
                    list.add(s);
                }
            }
            Collections.sort(list);
            return list.get(list.size() - 1);
        }
    }

    public static void main(String[] args) {
        Solution s = new P2259().new Solution();
        Object ans = s.removeDigit("1231", '1');
        System.out.println(ans);
    }
}