/***********************************************************
 * @Description : 工具类
 * @author      : 梁山广(Liang Shan Guang)
 * @date        : 2020/5/2 21:19
 * @email       : liangshanguang2@gmail.com
 ***********************************************************/
package 第4到27章_23大设计模式.第09章_原型模式;

import java.text.MessageFormat;

public class MailUtil {
    public static void sendMail(Mail mail) {
        String contentOutput = "向{0}同学，邮件地址：{1}，邮件内容：{2} 发送邮件";
        System.out.println(MessageFormat.format(contentOutput, mail.getName(), mail.getEmail(), mail.getContent()));
    }

    public static void saveOriginMailRecord(Mail mail) {
        System.out.println("存储originalMail记录，originMail为：" + mail.getContent());
    }
}
