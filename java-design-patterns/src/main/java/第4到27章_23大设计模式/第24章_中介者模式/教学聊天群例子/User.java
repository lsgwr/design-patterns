package 第4到27章_23大设计模式.第24章_中介者模式.教学聊天群例子;

/**
 * Created by geely
 */
public class User {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public User(String name) {
        this.name = name;
    }

    public void sendMessage(String message) {
        StudyGroup.showMessage(this, message);
    }
}
