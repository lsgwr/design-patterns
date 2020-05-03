/***********************************************************
 * @Description : 用户管理接口
 * @author      : 梁山广(Liang Shan Guang)
 * @date        : 2020/5/3 22:21
 * @email       : liangshanguang2@gmail.com
 ***********************************************************/
package 第4到27章_23大设计模式.第16章_代理模式;

public interface UserManager {
    void addUser(String userId, String userName);
    void delUser(String userId);
    String findUser(String userId);
    void modifyUser(String userId, String userName);
}
