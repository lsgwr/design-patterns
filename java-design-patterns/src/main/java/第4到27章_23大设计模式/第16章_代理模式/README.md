# 第16章 代理模式(proxy)
> 例子代码参考博客 https://blog.csdn.net/hejingyuan6/article/details/36203505#
## 定义
+ 为其他对象提供一种代理，以控制对这个对象的访问
+ 代理对象在客户端和目标对象之间起到`中介`的作用
+ 类型：结构型

## 适用场景
+ 保护目标对象
+ 增强目标对象

## 优点
+ 将代理对象与真实被调用地目标对象分离
+ 在一定程度上降低了系统的耦合度，扩展性好
+ 保护目标对象
+ 增强目标对象

## 缺点
+ 会造成系统设计中类的数目增加
+ 在客户端和目标对象增加一个代理对象，会造成请求处理的速度变慢
+ 增加了系统的复杂度

## 扩展
+ 静态代理
+ 动态代理
+ CGLib代理：
  > 注意：如果被代理类是final修饰的，那么该类无法被cglib代理。如果类的方法是final修饰的，那么该方法也无法被cglib动态代理。

### 相关设计模式
+ 代理模式和装饰者模式
  + 实现上相似
  + 目的不同：
    + 装饰者模式是为对象加上行为；
    + 代理模式偏控制访问，更加注重通过设置代理人的方式来增强目标对象，一般是通过增强目标对象的某些行为实现地
+ 代理模式和适配器模式：
  + 适配器模式主要改变涉及对象的接口
  + 代理模式是不能改变代理类的接口地

## 应用
+  Spring中的代理选择
  + 当Bean有实现接口时，Spring就会用JDK的动态代理
  + 当Bean没有实现接口时，Spring使用CGLib
  + 强制使用CGLib：在spring的配置中加入`<aop:aspectj-autoproxy proxy-target-class="true"/>`
+ JDK：
  + `java.lang.reflect.Proxy`
+ Spring:
  + `org.springframework.aop.framework.ProxyFactoryBean/jdkDynamicAopProxy/CglibAopProxy`
+ MyBatis:
  + `org.apache.ibatis.binding.MapperProxyFactory/MapperProxy`