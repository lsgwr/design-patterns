/***********************************************************
 * @Description : 活期存款账号
 * @author      : 梁山广(Liang Shan Guang)
 * @date        : 2020/5/3 16:32
 * @email       : liangshanguang2@gmail.com
 ***********************************************************/
package 第4到27章_23大设计模式.第15章_桥接模式.银行存取款的例子;

public class SavingAccount implements Account {
    @Override
    public Account openAccount() {
        System.out.println("打开活期账号");
        return new SavingAccount();
    }

    @Override
    public void showAccountType() {
        System.out.println("这是一个活期账号");
    }
}
