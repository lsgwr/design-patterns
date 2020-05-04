package 第4到27章_23大设计模式.第25章_责任链模式.课程发布审批流程的例子;

import org.apache.commons.lang.StringUtils;

/**
 * Created by geely
 */
public class VideoApprover extends Approver {
    @Override
    public void deploy(Course course) {
        if (StringUtils.isNotEmpty(course.getVideo())) {
            System.out.println(course.getName() + "含有视频,批准");
            if (approver != null) {
                approver.deploy(course);
            }
        } else {
            System.out.println(course.getName() + "不含有视频,不批准,流程结束");
            return;
        }
    }
}
