package 第4到27章_23大设计模式.第09章_原型模式;

import org.junit.Test;

public class MailUtilTest {
    @Test
    public void mailTest() {
        Mail mail = new Mail();
        mail.setContent("初始化模板");

        for (int i = 0; i < 10; i++) {
            mail.setName("姓名" + i);
            mail.setEmail("姓名" + i + "@imooc.com");
            mail.setContent("恭喜您此次慕课网活动中奖了！");
            MailUtil.sendMail(mail);
        }
        MailUtil.saveOriginMailRecord(mail);
    }
}