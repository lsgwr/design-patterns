/***********************************************************
 * @Description : 
 * @author      : 梁山广(Laing Shan Guang)
 * @date        : 2019/3/10 19:50
 * @email       : liangshanguang2@gmail.com
 ***********************************************************/
package chapter03principles.p02dependenceinversion;

public class Test {
    public static void main(String[] args) {
        Geely geely = new Geely();
        geely.studyFeCourse();
        geely.studyJavaCourse();
    }
}
