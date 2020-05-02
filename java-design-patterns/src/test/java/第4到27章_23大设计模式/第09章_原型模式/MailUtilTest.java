package 第4到27章_23大设计模式.第09章_原型模式;

import org.junit.Test;

public class MailUtilTest {
    @Test
    public void mailTest() throws CloneNotSupportedException {
        Mail mailInit = new Mail();
        mailInit.setContent("初始化模板");
        for (int i = 0; i < 10; i++) {
            // 如果Mail的实例化很复杂，这里的clone可以很大地提高性能地，这也是原型模式的好处
            Mail mail = (Mail) mailInit.clone();
            System.out.println("对象" + i + "的哈希码：" + mail.hashCode());
            mail.setName("姓名" + i);
            mail.setEmail("姓名" + i + "@imooc.com");
            mail.setContent("恭喜您此次慕课网活动中奖了！");
            MailUtil.sendMail(mail);
        }
        MailUtil.saveOriginMailRecord(mailInit);
    }
    /**
     * Mail Class Constructor
     * clone mail object
     * 对象0的哈希码：1915503092
     * 向姓名0同学，邮件地址：姓名0@imooc.com，邮件内容：恭喜您此次慕课网活动中奖了！ 发送邮件
     * clone mail object
     * 对象1的哈希码：1535128843
     * 向姓名1同学，邮件地址：姓名1@imooc.com，邮件内容：恭喜您此次慕课网活动中奖了！ 发送邮件
     * clone mail object
     * 对象2的哈希码：1567581361
     * 向姓名2同学，邮件地址：姓名2@imooc.com，邮件内容：恭喜您此次慕课网活动中奖了！ 发送邮件
     * clone mail object
     * 对象3的哈希码：849460928
     * 向姓名3同学，邮件地址：姓名3@imooc.com，邮件内容：恭喜您此次慕课网活动中奖了！ 发送邮件
     * clone mail object
     * 对象4的哈希码：580024961
     * 向姓名4同学，邮件地址：姓名4@imooc.com，邮件内容：恭喜您此次慕课网活动中奖了！ 发送邮件
     * clone mail object
     * 对象5的哈希码：2027961269
     * 向姓名5同学，邮件地址：姓名5@imooc.com，邮件内容：恭喜您此次慕课网活动中奖了！ 发送邮件
     * clone mail object
     * 对象6的哈希码：1586270964
     * 向姓名6同学，邮件地址：姓名6@imooc.com，邮件内容：恭喜您此次慕课网活动中奖了！ 发送邮件
     * clone mail object
     * 对象7的哈希码：1642360923
     * 向姓名7同学，邮件地址：姓名7@imooc.com，邮件内容：恭喜您此次慕课网活动中奖了！ 发送邮件
     * clone mail object
     * 对象8的哈希码：1343441044
     * 向姓名8同学，邮件地址：姓名8@imooc.com，邮件内容：恭喜您此次慕课网活动中奖了！ 发送邮件
     * clone mail object
     * 对象9的哈希码：693632176
     * 向姓名9同学，邮件地址：姓名9@imooc.com，邮件内容：恭喜您此次慕课网活动中奖了！ 发送邮件
     * 存储originalMail记录，originMail为：初始化模板
     */
}