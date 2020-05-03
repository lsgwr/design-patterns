/***********************************************************
 * @Description : 银行账号类
 * @author      : 梁山广(Liang Shan Guang)
 * @date        : 2020/5/3 16:30
 * @email       : liangshanguang2@gmail.com
 ***********************************************************/
package 第4到27章_23大设计模式.第15章_桥接模式.银行存取款的例子;

public interface Account {
    /**
     * 打开账户
     */
    Account openAccount();

    /**
     * 显示账号类型
     */
    void showAccountType();
}
