/***********************************************************
 * @Description : 原型模式
 * @author      : 梁山广(Liang Shan Guang)
 * @date        : 2020/5/2 21:16
 * @email       : liangshanguang2@gmail.com
 ***********************************************************/
package 第4到27章_23大设计模式.第09章_原型模式;

public class Mail {
    private String name;
    private String email;
    private String content;

    public Mail() {
        System.out.println("Mail Class Constructor");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public String toString() {
        return "Mail{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", content='" + content + '\'' +
                '}';
    }
}
