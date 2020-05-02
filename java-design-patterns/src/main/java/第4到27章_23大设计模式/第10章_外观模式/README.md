# 第10章 外观模式(Facade)
> 简单说就是聚合多个Service，完成复杂的业务逻辑后对外异同必要的少量接口
## 定义
+ 又叫门面模式，提供了一个统一的接口，用来访问子系统中的一群接口
+ 定义了一个高层接口，让子系统更容易使用
+ 类型：结构型

## 适用场景
+ 子系统越来越复杂，增加外观模式提供简单调用接口
+ 构建多层系统结构，利用外观对象作为每层的入口，简化层间调用

## 优点
+ 简化了调用过程，无需深入了解子系统，防止带来风险
+ 减少系统以来、松散耦合
+ 更好地划分访问层次
+ 符合迪米特法则，即最少知道原则

## 缺点
+ 增加子系统、扩展子系统行为容易引入风险
+ 不符合开闭原则

## 和外观模式相关的设计模式
+ 1、中介者模式：
  + 外观模式：外界和子系统之间的交互
  + 中介者模式：子系统内部之间的交互
+ 2、单例模式：可以把外观模式中的外观对象做成单例模式
+ 3、抽象工厂模式：外观类可以通过抽象工厂获取子系统的实例

## 外观模式在一些源码中的应用
+ spring-jdbc:`org.springframework.jdbc.support.JdbcUtils`
+ mybatis：`org.apache.ibatis.session.Configuration`
+ Tomcat：`org.apache.catalina.connector.RequestFacade/ResponseFacade/StandardSessionFacade`等，Tomcat用外观模式的地方非常多
