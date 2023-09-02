package leetcode.interview;

/**
 * Author: Deean
 * Date: 2022-08-18 23:54
 * FileName: src/leetcode/editor/cn/leetcode.interview
 * Description: 面试题 03.01. 三合一
 */

public class M00030001 {
    // code beginning
    class TripleInOne {
        int[][] stack;
        int[] top;
        int size;

        public TripleInOne(int stackSize) {
            size = stackSize;
            stack = new int[3][size];
            top = new int[3];
        }

        public void push(int stackNum, int value) {
            if (top[stackNum] < size) {
                stack[stackNum][top[stackNum]++] = value;
            }
        }

        public int pop(int stackNum) {
            return isEmpty(stackNum) ? -1 : stack[stackNum][--top[stackNum]];
        }

        public int peek(int stackNum) {
            return isEmpty(stackNum) ? -1 : stack[stackNum][top[stackNum] - 1];
        }

        public boolean isEmpty(int stackNum) {
            return top[stackNum] == 0;
        }
    }

    public static void main(String[] args) {

        TripleInOne obj = new M00030001().new TripleInOne(2);
        obj.push(0, 1);
        System.out.println(obj.pop(0));
        System.out.println(obj.peek(0));
        System.out.println(obj.isEmpty(0));
    }
}