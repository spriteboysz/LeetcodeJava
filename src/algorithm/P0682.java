package algorithm;

import java.util.ArrayList;
import java.util.List;

/**
 * Author: Deean
 * Date: 2022-07-05 23:52
 * LastEditTime: 2022-07-05 23:52
 * Description: 682. 棒球比赛
 */

public class P0682 {
    // code beginning
    class Solution {
        public int calPoints(String[] ops) {
            int sum = 0;
            List<Integer> points = new ArrayList<>();
            for (String op : ops) {
                int n = points.size();
                switch (op) {
                    case "+" -> {
                        sum += points.get(n - 1) + points.get(n - 2);
                        points.add(points.get(n - 1) + points.get(n - 2));
                    }
                    case "D" -> {
                        sum += 2 * points.get(n - 1);
                        points.add(2 * points.get(n - 1));
                    }
                    case "C" -> {
                        sum -= points.get(n - 1);
                        points.remove(n - 1);
                    }
                    default -> {
                        sum += Integer.parseInt(op);
                        points.add(Integer.parseInt(op));
                    }
                }
            }
            return sum;
        }
    }

    public static void main(String[] args) {
        Solution s = new P0682().new Solution();
        Object ans = s.calPoints(new String[]{"5", "-2", "4", "C", "D", "9", "+", "+"});
        System.out.println(ans);
    }
}