package 第4到27章_23大设计模式.第15章_桥接模式.银行存取款的例子;

import org.junit.Test;

public class BankTest {
    /**
     * 打开中国工商银行账号
     * 打开定期账号
     * 这是一个定期账号
     * 打开中国工商银行账号
     * 打开活期账号
     * 这是一个活期账号
     * 打开中国工商银行账号
     * 打开活期账号
     * 这是一个活期账号
     */
    @Test
    public void bankTest() {
        Bank icbcBank = new ICBCBank(new DepositAccount());
        icbcBank.openAccount();

        Bank icbcBank2 = new ICBCBank(new SavingAccount());
        icbcBank2.openAccount();

        Bank abcBank = new ICBCBank(new SavingAccount());
        abcBank.openAccount();
    }
}