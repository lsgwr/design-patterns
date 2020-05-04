package 第4到27章_23大设计模式.第26章_访问者模式.免费和收费课程放在一起访问的例子;

/**
 * Created by geely
 */
public abstract class Course {
    private String name;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public abstract void accept(IVisitor visitor);

}
