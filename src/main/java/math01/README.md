一种框架常用的思路
---

Handle

    父类接口，里面有handle方法

AbstractHandle

    是Handle的实现类，重写了父类handle，如果字符串不为空，那么去执行dohandle方法
    抽象方法dohandle(String str)

StringHandle
    
    AbstractHandle的子类
    重写了dohandle(String str)方法，把传入的字符串中A改成@

NumberHandle

    AbstractHandle的子类
    重写了dohandle(String str)方法，把传入的字符串中数字都去掉

Main

    使用：
    创建StringHandle和NumberHandle类，执行他们handle方法即可

