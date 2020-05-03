/***********************************************************
 * @Description : 课程目录类
 * @author      : 梁山广(Liang Shan Guang)
 * @date        : 2020/5/3 12:27
 * @email       : liangshanguang2@gmail.com
 ***********************************************************/
package 第4到27章_23大设计模式.第14章_组合模式.课程管理例子;

import java.util.ArrayList;
import java.util.List;

public class CourseCatalog extends CatalogComponent {
    private List<CatalogComponent> items = new ArrayList<>();
    /**
     * 目录名称
     */
    private String name;

    /**
     * 课程的层级
     */
    private Integer level;

    public CourseCatalog(String name, Integer level) {
        this.name = name;
        this.level = level;
    }

    @Override
    public void add(CatalogComponent catalogComponent) {
        items.add(catalogComponent);
    }

    @Override
    public void remove(CatalogComponent catalogComponent) {
        items.remove(catalogComponent);
    }

    @Override
    public String getName(CatalogComponent catalogComponent) {
        return name;
    }

    @Override
    public void print() {
        System.out.println(name);
        for (CatalogComponent catalogComponent : items) {
            if (this.level != null) {
                // 能打印目录层次
                for (int i = 0; i < level; i++) {
                    System.out.print(" ");
                }
            }
            System.out.print(" ");
            catalogComponent.print();
        }
    }
}
