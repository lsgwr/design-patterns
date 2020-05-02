# IDEA中多线程的调试
## 要点
> 1.主要是在设置断点后，要在断点上右击，选择Thread模式
![断点的Suspend模式设置为Thread](images/IDEA中调试多线程的关键_断点的Suspend模式设置为Thread.png)

> 2.并在调试的时候通过在Frames界面切换不同的线程来龙之多线程的逻辑
![IDEA在Debug时Frames的使用](images/IDEA在Debug时Frames的使用.png)

## 实战1：不安全的懒汉式单例模式演示

### 1.打好Thread模式的断点
![断点1](images/断点1.png)

![断点2](images/断点2.png)

![断点3](images/断点3.png)

### 2.模拟线程不安全的场景
> 即单例模式在不同线程中返回不同的实例，违反了单例模式的要求

