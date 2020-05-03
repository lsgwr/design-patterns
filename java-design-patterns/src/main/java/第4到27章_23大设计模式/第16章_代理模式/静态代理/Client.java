/***********************************************************
 * @Description : 用代理类访问实际行为
 * @author      : 梁山广(Liang Shan Guang)
 * @date        : 2020/5/3 22:24
 * @email       : liangshanguang2@gmail.com
 ***********************************************************/
package 第4到27章_23大设计模式.第16章_代理模式.静态代理;

import 第4到27章_23大设计模式.第16章_代理模式.UserManager;

public class Client {
    public static void main(String[] args){
        // UserManager userManager=new UserManagerImpl();
        UserManager userManager=new UserManagerImplProxy(new UserManagerImpl());
        userManager.addUser("1111", "张三");
    }
}
/**
 * start-->addUser()
 * UserManagerImpl.addUser
 * success-->addUser()
 */
