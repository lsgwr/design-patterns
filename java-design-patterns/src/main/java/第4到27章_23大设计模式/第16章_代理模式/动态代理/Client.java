/***********************************************************
 * @Description : 
 * @author      : 梁山广(Liang Shan Guang)
 * @date        : 2020/5/4 0:16
 * @email       : liangshanguang2@gmail.com
 ***********************************************************/
package 第4到27章_23大设计模式.第16章_代理模式.动态代理;

import 第4到27章_23大设计模式.第16章_代理模式.UserManager;

public class Client {
    public static void main(String[] args) {
        LogHandler logHandler = new LogHandler();
        UserManager userManager = (UserManager) logHandler.newProxyInstance(new UserManagerImpl());
        // UserManager userManager=new UserManagerImpl();
        userManager.addUser("1111", "张三");
    }
    /**
     * start-->>
     * 1111
     * 张三
     * satrt-->>
     * UserManagerImpl.addUser
     * success-->>
     */
}
