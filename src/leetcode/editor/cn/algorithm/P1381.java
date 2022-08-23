package leetcode.editor.cn.algorithm;

/**
 * Author: Deean
 * Date: 2022-08-23 23:23
 * FileName: src/leetcode/editor/cn/algorithm
 * Description: 1381. 设计一个支持增量操作的栈
 */

public class P1381 {
    // code beginning
    class CustomStack {
        int[] stack;
        int top;

        public CustomStack(int maxSize) {
            stack = new int[maxSize];
            top = -1;
        }

        public void push(int x) {
            if (top != stack.length - 1) {
                stack[++top] = x;
            }
        }

        public int pop() {
            if (top == -1) return -1;
            return stack[top--];
        }

        public void increment(int k, int val) {
            for (int i = 0; i < Math.min(k, top + 1); i++) {
                stack[i] += val;
            }
        }
    }

    public static void main(String[] args) {
        CustomStack customStack = new P1381().new CustomStack(3); // 栈是空的 []
        customStack.push(1);                          // 栈变为 [1]
        customStack.push(2);                          // 栈变为 [1, 2]
        System.out.println(customStack.pop());          // 返回 2 --> 返回栈顶值 2，栈变为 [1]
        customStack.push(2);                         // 栈变为 [1, 2]
        customStack.push(3);                         // 栈变为 [1, 2, 3]
        customStack.push(4);                         // 栈仍然是 [1, 2, 3]，不能添加其他元素使栈大小变为 4
        customStack.increment(5, 100);           // 栈变为 [101, 102, 103]
        customStack.increment(2, 100);           // 栈变为 [201, 202, 103]
        System.out.println(customStack.pop());         // 返回 103 --> 返回栈顶值 103，栈变为 [201, 202]
        System.out.println(customStack.pop());         // 返回 202 --> 返回栈顶值 202，栈变为 [201]
        System.out.println(customStack.pop());         // 返回 201 --> 返回栈顶值 201，栈变为 []
        System.out.println(customStack.pop());         // 返回 -1 --> 栈为空，返回 -1
    }
}