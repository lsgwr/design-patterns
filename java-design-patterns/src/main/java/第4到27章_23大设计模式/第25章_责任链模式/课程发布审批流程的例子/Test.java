package 第4到27章_23大设计模式.第25章_责任链模式.课程发布审批流程的例子;

/**
 * Created by geely
 */
public class Test {
    public static void main(String[] args) {
        Approver articleApprover = new ArticleApprover();
        Approver videoApprover = new VideoApprover();

        Course course = new Course();
        course.setName("Java设计模式精讲 -- By Geely");
        course.setArticle("Java设计模式精讲的手记");
        course.setVideo("Java设计模式精讲的视频");

        articleApprover.setNextApprover(videoApprover);

        articleApprover.deploy(course);
    }
}
