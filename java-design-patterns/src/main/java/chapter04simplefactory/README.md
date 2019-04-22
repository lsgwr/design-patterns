# 简单工厂模式

+ 定义：由一个工厂对象决定创建出哪一种产品类型的实例
+ 类型：创建型，但不属于GOF23种设计模式
+ 适用场景： 
  + 1、工厂类负责创建的对象比较少
  + 2、客户端(应用层)只知道传入工厂类的参数，对于如何创建对象(逻辑)不关心
+ 优点
  + 只需传入一个正确的参数，就可以获取你所需要的对象，无须知道其创建细节
  + 加上必要的判断逻辑，根据参数创建不同的对象，实现对责任的分割
+ 缺点
  + 0、工厂类的职责相对过重，增加新的产品，需要修改工厂类的判断逻辑，违背开闭原则
  + 1、增加类的个数(增加了系统的复杂度）
  + 2、无法形成基于继承的等级结构