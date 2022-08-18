package leetcode.editor.cn.algorithm;

/**
 * Author: Deean
 * Date: 2022-08-18 23:30
 * FileName: src/leetcode/editor/cn/algorithm
 * Description: 925. 长按键入
 */

public class P0925 {
    // code beginning
    class Solution {
        public boolean isLongPressedName(String name, String typed) {
            int index = 0;
            for (int i = 0; i < typed.length(); ) {
                if (index < name.length() && name.charAt(index) == typed.charAt(i)) {
                    index++;
                    i++;
                } else if (i > 0 && typed.charAt(i) == typed.charAt(i - 1)) {
                    i++;
                } else {
                    return false;
                }
            }
            return index == name.length();
        }
    }

    public static void main(String[] args) {
        Solution s = new P0925().new Solution();
        Object ans = s.isLongPressedName("saeed", "ssaaedd");
        System.out.println(ans);
    }
}