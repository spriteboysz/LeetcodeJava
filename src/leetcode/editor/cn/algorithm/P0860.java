package leetcode.editor.cn.algorithm;

/**
 * Author: Deean
 * Date: 2022-08-17 00:04
 * FileName: src/leetcode/editor/cn/algorithm
 * Description: 860. 柠檬水找零
 */

public class P0860 {
    // code beginning
    class Solution {
        public boolean lemonadeChange(int[] bills) {
            int count05 = 0, count10 = 0;
            for (int bill : bills) {
                switch (bill) {
                    case 5 -> count05++;
                    case 10 -> {
                        if (count05 >= 1) {
                            count05--;
                            count10++;
                        } else {
                            return false;
                        }
                    }
                    case 20 -> {
                        if (count10 >= 1 && count05 >= 1) {
                            count10--;
                            count05--;
                        } else if (count05 >= 3) {
                            count05 -= 3;
                        } else {
                            return false;
                        }
                    }
                }
            }
            return true;
        }
    }

    public static void main(String[] args) {
        Solution s = new P0860().new Solution();
        Object ans = s.lemonadeChange(new int[]{5, 5, 10, 10, 20});
        System.out.println(ans);
    }
}