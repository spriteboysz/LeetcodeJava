/**
 * Author: Deean
 * Date: 2022-06-02 22:19:45
 * LastEditTime: 2022-06-02 22:19:45
 * Description: 0027. 移除元素
 */

package leetcode.editor.cn;

public class P0027_RemoveElement {
    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int removeElement(int[] nums, int val) {
            int count = 0;
            for (int num : nums) {
                if (num != val) {
                    nums[count] = num;
                    count += 1;
                }
            }
            return count;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)


    // Todo: testcase
    public static void main(String[] args) {
        Solution s = new P0027_RemoveElement().new Solution();
        int ans = s.removeElement(new int[]{1, 2, 3, 4, 5}, 4);
        System.out.println(ans);

    }
}