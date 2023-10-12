一种框架常用的思路，根据枚举值的不同来执行不同的方法
---

Handle

    父类接口，里面有handle方法

StringAbstractHandle

    是Handle的实现类，重写了父类handle，如果字符串不为空，那么去执行dohandle方法
    抽象方法dohandle(String str)

ChangeAStringAbstractHandle
    
    AbstractHandle的子类
    重写了dohandle(String str)方法，把传入的字符串中A改成@

EXNumStringAbstractHandle

    AbstractHandle的子类
    重写了dohandle(String str)方法，把传入的字符串中数字都去掉

HandleObjEnum

    枚举类，用来定义使用哪种处理字符串的方式

Main

    使用：
    写了handleString方法，根据传入的枚举值来执行不用的方法


