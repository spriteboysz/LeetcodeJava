package leetcode.editor.cn.algorithm;

/**
 * Author: Deean
 * Date: 2022-07-23 14:28
 * LastEditTime: 2022-07-23 14:28
 * Description: 2043. 简易银行系统
 */

public class P2043 {
    // code beginning
    class Bank {
        long[] balance;
        int count;

        public Bank(long[] balance) {
            this.balance = balance;
            count = balance.length;
        }

        public boolean transfer(int account1, int account2, long money) {
            if (account1 <= count && account2 <= count && balance[account1 - 1] >= money) {
                balance[account1 - 1] -= money;
                balance[account2 - 1] += money;
                return true;
            }
            return false;
        }

        public boolean deposit(int account, long money) {
            if (account <= count) {
                balance[account - 1] += money;
                return true;
            }
            return false;

        }

        public boolean withdraw(int account, long money) {
            if (account <= count && balance[account - 1] >= money) {
                balance[account - 1] -= money;
                return true;
            }
            return false;
        }
    }

    public static void main(String[] args) {
        Bank bank = new P2043().new Bank(new long[]{10, 100, 20, 50, 30});
        System.out.println(bank.withdraw(3, 10));    // 返回 true ，账户 3 的余额是 $20 ，所以可以取款 $10 。
        System.out.println(bank.transfer(5, 1, 20)); // 返回 true ，账户 5 的余额是 $30 ，所以可以转账 $20 。
        System.out.println(bank.deposit(5, 20));     // 返回 true ，可以向账户 5 存款 $20 。
        System.out.println(bank.transfer(3, 4, 15)); // 返回 false ，账户 3 的当前余额是 $10 。
        System.out.println(bank.withdraw(10, 50));   // 返回 false ，交易无效，因为账户 10 并不存在。
    }
}