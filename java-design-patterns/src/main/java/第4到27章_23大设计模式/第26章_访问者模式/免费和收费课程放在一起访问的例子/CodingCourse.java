package 第4到27章_23大设计模式.第26章_访问者模式.免费和收费课程放在一起访问的例子;

/**
 * Created by geely
 */
public class CodingCourse extends Course {
    private int price;

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public void accept(IVisitor visitor) {
        visitor.visit(this);
    }
}
