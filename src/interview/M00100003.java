package interview;

/**
 * Author: Deean
 * Date: 2023-08-29 17:27
 * FileName: src/interview
 * Description:面试题 10.03. 搜索旋转数组
 */

public class M00100003 {
    // code beginning
    class Solution {
        public int search(int[] arr, int target) {
            for (int i = 0, n = arr.length; i < n; i++) {
                if (arr[i] == target) {
                    return i;
                }
            }
            return -1;
        }
    }

    public static void main(String[] args) {
        Solution s = new M00100003().new Solution();
        Object ans = s.search(new int[]{15, 16, 19, 20, 25, 1, 3, 4, 5, 7, 10, 14}, 5);
        System.out.println(ans);
    }
}
