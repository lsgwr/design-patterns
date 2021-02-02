# 第11章 装饰者模式(decorator)
> 特点是继承类某个类+把这个继承的类作为构造器参数传入进来
## 定义
+ 在不改变原有对象的基础之上，将功能附加到对象上
+ 提供了比继承更有弹性的替代方案(扩展原有对象功能)
+ 类型：结构型

## 适用场景
+ 扩展一个类的功能或给一个类添加职责
+ 可以动态地给一个对象添加功能，这些功能可以再动态地撤销

## 优点
+ 装饰者模式是继承的有力补充，比继承灵活，不改变原有对象的情况下给一个对象扩展功能
+ 通过使用不同装饰类以及这些装饰类的排列组合，可以实现不同效果

## 缺点
+ 会出现更多的代码，更多的类，增加程序的复杂性
+ 动态装饰时，多层装饰时会更复杂，在排查错误的时候，相对困难(装饰者会继承被装饰对象，被装饰对象有具体的实体)

## 相关设计模式
+ 装饰者模式和代理模式
  + 装饰者模式关注在一个对象上动态地添加方法。通常是把`原始对象作为一个参数传给装饰者构造器`
  + 代理模式关注于控制对对象的访问，可以对客户隐藏对象的具体信息。通常是在代理类中创建一个对象的实例
+ 装饰者模式和适配器模式：都是包装模式(Wrapper)的一种
  > 二者的区别见博客：https://blog.csdn.net/m0_37771398/article/details/88855888

## 应用
+ JDK中的：`java.io.BufferedReader/BufferedInputStream/FileInputStream`等java.io中的很多类
+ Spring中：`org.springframework.cache.transaction.TransactionAwareCacheDecorator`
+ Tomcat中：`javax.servlet.http.HttpServletRequest`的几个实现类
+ MyBatis中：`org.apache.ibatis.cache.decorators`包下的所有类都是包装器类