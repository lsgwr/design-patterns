/***********************************************************
 * @Description : 用户管理的实现类
 * @author      : 梁山广(Liang Shan Guang)
 * @date        : 2020/5/3 22:22
 * @email       : liangshanguang2@gmail.com
 ***********************************************************/
package 第4到27章_23大设计模式.第16章_代理模式.静态代理;

import 第4到27章_23大设计模式.第16章_代理模式.UserManager;

public class UserManagerImpl implements UserManager {

    @Override
    public void addUser(String userId, String userName) {
        System.out.println("UserManagerImpl.addUser");
    }

    @Override
    public void delUser(String userId) {
        System.out.println("UserManagerImpl.delUser");
    }

    @Override
    public String findUser(String userId) {
        System.out.println("UserManagerImpl.findUser");
        return "张三";
    }

    @Override
    public void modifyUser(String userId, String userName) {
        System.out.println("UserManagerImpl.modifyUser");
    }
}
