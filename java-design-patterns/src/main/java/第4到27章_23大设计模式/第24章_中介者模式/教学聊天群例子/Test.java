package 第4到27章_23大设计模式.第24章_中介者模式.教学聊天群例子;

/**
 * Created by geely
 */
public class Test {
    public static void main(String[] args) {
        User geely = new User("Geely");
        User tom= new User("Tom");

        geely.sendMessage(" Hey! Tom! Let's learn Design Pattern");
        tom.sendMessage("OK! Geely");
    }
}
