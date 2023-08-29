package algorithm;

/**
 * Author: Deean
 * Date: 2022-08-21 23:48
 * FileName: src/leetcode/editor/cn/algorithm
 * Description: 2336. 无限集中的最小数字
 */

public class P2336 {
    // code beginning
    class SmallestInfiniteSet {
        int[] nums;

        public SmallestInfiniteSet() {
            this.nums = new int[1000];
        }

        public int popSmallest() {
            for (int i = 0; i < 1000; i++) {
                if (nums[i] == 0) {
                    nums[i] = 1;
                    return i + 1;
                }
            }
            return 1000;
        }

        public void addBack(int num) {
            nums[num - 1] = 0;
        }
    }

    public static void main(String[] args) {
        SmallestInfiniteSet smallestInfiniteSet = new P2336().new SmallestInfiniteSet();
        smallestInfiniteSet.addBack(2);
        System.out.println(smallestInfiniteSet.popSmallest()); // 返回 1
        System.out.println(smallestInfiniteSet.popSmallest()); // 返回 2
        System.out.println(smallestInfiniteSet.popSmallest()); // 返回 3
        smallestInfiniteSet.addBack(1);
        System.out.println(smallestInfiniteSet.popSmallest()); // 返回 1
        System.out.println(smallestInfiniteSet.popSmallest()); // 返回 4
        System.out.println(smallestInfiniteSet.popSmallest()); // 返回 5
    }
}