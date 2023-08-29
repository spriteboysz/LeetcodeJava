package algorithm;

/**
 * Author: Deean
 * Date: 2022-06-29 23:09
 * LastEditTime: 2022-06-29 23:09
 * Description: 1108. IP 地址无效化
 */

public class P1108 {
    // code beginning
    class Solution {
        public String defangIPaddr(String address) {
            return address.replace(".", "[.]");
        }
    }

    public static void main(String[] args) {
        Solution s = new P1108().new Solution();
        Object ans = s.defangIPaddr("255.100.50.0");
        System.out.println(ans);
    }
}