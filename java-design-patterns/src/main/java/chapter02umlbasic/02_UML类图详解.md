# UML类图详解

## 例图详解
> ![类图例子](https://img.mukewang.com/szimg/5c1d9c4600011c4819201080.jpg)
+ 最上面的长方形：类的名字
  + 普通类 `标准字体`
  + 抽象类 `斜体`，图中标识错误，因为存在抽象方法study()，所以是抽象类，应该用斜体;
  + 接口 `<interface>`
  
+ 中间的长方形：`类的属性`
  + `加号 +`: 最大权限，public
  + `减号 -`：最小权限，private
  + `井号 #`：保护权限，protected
  + `波浪号 ~`：默认权限，default
  + `下划横线 __`： static属性
  + `冒号后的double、char、String、int等`：属性的数据类型

+ 最下面的长方形：`类的行为(方法)`
  + `加号 +`: 最大权限，public
  + `减号 -`：最小权限，private
  + `井号 #`：保护权限，protected
  + `波浪号 ~`：默认权限，default
  + `下划横线 __`： static方法
  + *斜体*：代表抽象方法
  + `冒号后的double`：函数的返回类型，没有表示默认返回值为void


