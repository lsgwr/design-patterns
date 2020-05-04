package 第4到27章_23大设计模式.第25章_责任链模式.课程发布审批流程的例子;

/**
 * Created by geely
 */
public abstract class Approver {
    protected Approver approver;

    public void setNextApprover(Approver approver) {
        this.approver = approver;
    }

    public abstract void deploy(Course course);
}
