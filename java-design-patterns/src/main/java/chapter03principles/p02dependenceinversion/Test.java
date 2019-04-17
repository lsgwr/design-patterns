/***********************************************************
 * @Description : 依赖倒置原则测试类
 * @author      : 梁山广(Laing Shan Guang)
 * @date        : 2019/3/10 19:50
 * @email       : liangshanguang2@gmail.com
 ***********************************************************/
package chapter03principles.p02dependenceinversion;

public class Test {
    public static void main(String[] args) {

        System.out.println("******************************1.参数注入*****************************");
        Geely geely = new Geely();
        geely.studyImoocCourse(new JavaCourse());
        geely.studyImoocCourse(new FeCourse());
        geely.studyImoocCourse(new PythonCourse());

        System.out.println("******************************构造函数注入*****************************");
        new Geely2(new JavaCourse()).studyImoocCourse();
        new Geely2(new PythonCourse()).studyImoocCourse();
        new Geely2(new FeCourse()).studyImoocCourse();

        System.out.println("******************************3.set函数设置*****************************");
        Geely2 geely2 = new Geely2();
        geely2.setiCourse(new JavaCourse());
        geely2.studyImoocCourse();
        geely2.setiCourse(new FeCourse());
        geely2.studyImoocCourse();
        geely2.setiCourse(new PythonCourse());
        geely2.studyImoocCourse();
    }
}
