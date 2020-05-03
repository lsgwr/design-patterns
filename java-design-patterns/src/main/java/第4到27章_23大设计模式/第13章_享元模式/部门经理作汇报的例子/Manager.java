/***********************************************************
 * @Description : 经理类
 * @author      : 梁山广(Liang Shan Guang)
 * @date        : 2020/5/3 10:50
 * @email       : liangshanguang2@gmail.com
 ***********************************************************/
package 第4到27章_23大设计模式.第13章_享元模式.部门经理作汇报的例子;

public class Manager implements Employee{
    @Override
    public void report() {
        System.out.println(reportContent);
    }

    /**
     * 所在部门
     */
    private String department;
    private String reportContent;

    public void setReportContent(String reportContent) {
        this.reportContent = reportContent;
    }

    public Manager(String department) {
        this.department = department;
    }
}
