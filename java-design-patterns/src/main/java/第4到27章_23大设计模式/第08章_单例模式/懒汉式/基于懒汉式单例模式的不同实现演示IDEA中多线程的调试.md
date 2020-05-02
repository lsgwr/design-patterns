# IDEA中多线程的调试
## 要点
> 1.主要是在设置断点后，要在断点上右击，选择Thread模式
![断点的Suspend模式设置为Thread](images/IDEA中调试多线程的关键_断点的Suspend模式设置为Thread.png)

> 2.并在调试的时候通过在Frames界面切换不同的线程来龙之多线程的逻辑
![IDEA在Debug时Frames的使用](images/IDEA在Debug时Frames的使用.png)

## 实战1：不安全的懒汉式单例模式演示

### 1.打好Thread模式的断点
+ [Thread断点1代码地址](../../../../../../src/test/java/第4到27章_23大设计模式/第08章_单例模式/懒汉式/线程不安全的实现/SingletonLazyTest.java)
  > ![断点1](images/断点1.png)

+ [Thread断点2代码地址](../../../../../../src/test/java/第4到27章_23大设计模式/第08章_单例模式/懒汉式/线程不安全的实现/SingletonLazyTest.java)
  > ![断点2](images/断点2.png)

+ [Thread断点3代码地址](线程不安全的实现/SingletonLazy.java)
  > ![断点3](images/断点3.png)

### 2.模拟线程不安全的场景
> 即单例模式在不同线程中返回不同的实例，违反了单例模式的要求
+ 1.开启调试
  > ![开启Debug模式](images/开启Debug模式.png)
+ 2.在Debug界面的Frames中切换到线程0
  > ![切换到线程0调试](images/切换到线程0调试.png)
+ 3.线程0`逐步调试(Step Over，F6是其快捷键)`走到判空的内部
  > ![线程0调试](images/线程0调试_1.png)
+ 4.切换到1，通线程0一样两次F6单步调试走进判空逻辑
  > ![开启线程1调试模式](images/开启线程1调试模式.png)
  > 两次单步调试走进了判空逻辑
  > ![线程1调试_1](images/线程1调试_1.png)
+ 5.切回线程0，把线程0走完，可以看到返回的singletonLazy对象是`singletonLazy@842`
  > ![线程0得到的单例对象](images/线程0得到的单例对象.png)
  > 控制台的打印输出为：
  > ![线程0得到的单例对象的哈希码](images/线程0得到的单例对象的哈希码.png)
+ 6.再切回线程1，把线程1走完，可以看到返回的singletonLazy对象是`singletonLazy@843`
  > 即单例中不同的线程得到了不同的实例对象，现在的单例实现是不可信地
  > ![线程1得到的单例对象](images/线程1得到的单例对象.png)
  > 线程1最后的哈希码
  > ![线程1得到的单例对象的哈希码](images/线程1得到的单例对象的哈希码.png)