/***********************************************************
 * @Description : 抽象的银行类
 * @author      : 梁山广(Liang Shan Guang)
 * @date        : 2020/5/3 16:35
 * @email       : liangshanguang2@gmail.com
 ***********************************************************/
package 第4到27章_23大设计模式.第15章_桥接模式.银行存取款的例子;

public abstract class Bank {
    protected Account account;

    public Bank(Account account) {
        this.account = account;
    }

    /**
     * 和Account接口中声明成一样的方法名是因为Bank中的这个方法要委托给Account接口的实现类
     */
    abstract Account openAccount();
}
