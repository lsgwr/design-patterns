package 第4到27章_23大设计模式.第26章_访问者模式.免费和收费课程放在一起访问的例子;

/**
 * Created by geely
 */
public interface IVisitor {

    void visit(FreeCourse freeCourse);

    void visit(CodingCourse codingCourse);


}
