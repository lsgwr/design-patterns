package 第4到27章_23大设计模式.第14章_组合模式.课程管理例子;

import org.junit.Test;

public class CourseTest {
    @Test
    public void test() {
        CatalogComponent linuxCourse = new Course("Linux课程", 11);
        CatalogComponent windowsCourse = new Course("Windows课程", 22);
        CatalogComponent javaCourseCatalog = new CourseCatalog("Java课程目录", 2);
        CatalogComponent mmallCours1 = new Course("Java电商一期", 55);
        CatalogComponent mmallCours2 = new Course("Java电商二期", 66);
        CatalogComponent designPattern = new Course("Java设计模式", 77);
        javaCourseCatalog.add(mmallCours1);
        javaCourseCatalog.add(mmallCours2);
        javaCourseCatalog.add(designPattern);

        CatalogComponent imoocMainCourseCatalog = new CourseCatalog("慕课网课程主目录", 1);
        // 添加俩课程
        imoocMainCourseCatalog.add(linuxCourse);
        imoocMainCourseCatalog.add(windowsCourse);
        // 添加java课程目录
        imoocMainCourseCatalog.add(javaCourseCatalog);
        imoocMainCourseCatalog.print();
    }
    /**
     * 慕课网课程主目录
     *   Course Name:Linux课程, Price:11.0
     *   Course Name:Windows课程, Price:22.0
     *   Java课程目录
     *    Course Name:Java电商一期, Price:55.0
     *    Course Name:Java电商二期, Price:66.0
     *    Course Name:Java设计模式, Price:77.0
     */
}