package 第4到27章_23大设计模式.第24章_中介者模式.教学聊天群例子;

import java.util.Date;

/**
 * Created by geely
 */
public class StudyGroup {
    public static void showMessage(User user, String message){
        System.out.println(new Date().toString() + " [" + user.getName() + "] : " + message);
    }
}
