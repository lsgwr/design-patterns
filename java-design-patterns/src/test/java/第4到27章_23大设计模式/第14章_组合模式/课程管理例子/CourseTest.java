package 第4到27章_23大设计模式.第14章_组合模式.课程管理例子;

import org.junit.Test;

public class CourseTest {
    @Test
    public void test() {
        CatalogComponent linuxCourse = new Course("Linux课程", 11);
        CatalogComponent windowsCourse = new Course("Windows课程", 22);
        CatalogComponent javaCourseCatalog = new CourseCatalog("Java课程目录");
        CatalogComponent mmallCours1 = new Course("Java电商一期", 55);
        CatalogComponent mmallCours2 = new Course("Java电商二期", 66);
        CatalogComponent designPattern = new Course("Java设计模式", 77);
        javaCourseCatalog.add(mmallCours1);
        javaCourseCatalog.add(mmallCours2);
        javaCourseCatalog.add(designPattern);

        CatalogComponent imoocMainCourseCatalog = new CourseCatalog("慕课网课程主目录");
        // 添加俩课程
        imoocMainCourseCatalog.add(linuxCourse);
        imoocMainCourseCatalog.add(windowsCourse);
        // 添加java课程目录
        imoocMainCourseCatalog.add(javaCourseCatalog);
        imoocMainCourseCatalog.print();
    }
}