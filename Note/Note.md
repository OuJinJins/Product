#**爆肝之路<被安排的笔记>**
***
- **2020/11/11 18:11**
##1.IDEA安装+MD语法学习get√
![IDEA](images\IDEA.png)
##2.开始学习JAVA..
###案例实现
####笔记本USB接口案例
![IDEA](images\USB.png)
###各种快捷键..
####1.对象名.fori //遍历
####2.对象名.forr//倒序遍历
####3.Alt + Enter //抽象方法快捷
![IDEA](images\抽象方法快捷键.png)
####4.Alt + ins //构造方法快捷
####5.shift + F6 //同一名字的一起改
###命令框语法：
![IDEA](images\cmd.png)
###标识符规范要求：
![IDEA](images\char.png)
***
**2020/11/12 22:00**
###数据类型
![IDEA](images\数据类型.png)
####数据类型注意事项
![IDEA](images\数据类型注意事项.png)
###**语法：**
###**1.println,print**
print不换行，
println换行。
```java
public class print()
{
public static void main(String[] args)
{
System.out.println(233);
System.out.print(233);
System.out.println(233);
}
}
```
![IDEA](images\print.png)

###**2.方法的重载**

![IDEA](images\means.png)
***
- **2020/11/13 9:26**

![IDEA0](images\means2.png)

方法无法准确定位就会报错

shift + F6 同样的一起变

###**3.数组**

(1)数据类型[] 数组名称 = new 数据类型[数组长度];

(2)数据类型[] 数组名称 = new 数据类型[] {元素1，元素2...};
 
(3)数据类型[] 数组名称 = {元素1，元素2...}

- ###**数组注意事项**
![IDEA](images\means3.png)
```java
//唉学的好慢..最近烦的事情好多
```
![IDEA](images\array2.png)

- **数组底层知识**

![IDEA](images\array4.png)

![IDEA](images\array5.png)

![IDEA](images\array6.png)

- ###数组长度获取
```java
public class array_length
{
    public static void main(String[] args)
    {
        int[] array1 = new int[5];
        System.out.println(array1.length);
    }
}
```

![IDEA](images\array7.png)

- ###**遍历数组长度快捷键**

![IDEA](images\array8.png)
***
- **2020/11/14 13:14**

艹学的好慢，今天爆肝

###**4.面向对象**
- ###面向过程与面向对象的区别
![IDEA](images\面向对象.png)

- ###类的定义
![IDEA](images\类的定义.png)

- ###对象的创建与使用
![IDEA](images\类的定义.png)

- ###**对象内存分配**
![IDEA](images\对象内存分配.png)

- ###**两个引用指向同一对象的内存**
![IDEA](images\两个引用指向同一对象的内存.png)

- ###**对象类型作为方法的参数**
![IDEA](images\对象类型作为方法的参数.png.)

- ###**对象类型作为方法的返回值**
![IDEA](images\对象类型作为方法的返回值.png)
返回的为地址值

- ###**成员变量与局部变量的区别**
```java
/*
菊部变量与成员变量的区别：

1.定义的位置不一样[重点]
  菊部变量：在方法的内部
  成员变量：在方法的外部，直接定义在类当中
2.作用范围不一样[重点]
   菊部变量：只有在方法中才能使用，出去了就不能使用
   成员变量：整个类全部都能使用
3.默认值不一样[重点]
  菊部变量：**没有默认值要使用需要赋值**
  成员变量：有默认值，规则与数组相同
4.内存的位置不一样[了解]
  菊部变量：栈内存
  成员变量：堆内存
5.生命周期不一样
*/
```
####**面向对象三大特征**
- ###封装性：
```java
/*
封装性在java中的体现：
1.方法就是一种封装
2.关键字private也是一种封装
*/
```
- ###继承性：
####继承的概述：
####继承的格式：
####继承中成员变量的访问特点：
####方法的覆盖重写：
#####使用及注意事项：
#####应用场景：
###多态性：
![IDEA](images\多态性.png)
####多态格式
![IDEA](images\多态.png)
####多态的成员变量的使用
![IDEA](images\多态2.png)
####多态的成员方法的使用
![IDEA](images\多态成员方法.png)
####多态的好处
![IDEA](images\多态作用.png)
####对象的向上转型
![IDEA](images\向上转型.png)
####对象的向下转型
![IDEA](images\向下转型.png)
####instanceof关键字(转型演示)
![IDEA](images\instanceof.png)
![IDEA](images\instanceof2.png)

### privat关键字的作用及使用

```java
/*
定义时无法阻止不合理的数值被设置进去
需要用private修饰变量
*/
```
### this关键字就的作用
![IDEA](images\this.png)
***
2020/11/16 15:15
###5.构造方法
构造方法

**! !全参数的构造方法只是省去创建对象时的定义**

**! !但是要修改时还是要使用Getter，Setter方法**
![IDEA](images\构造方法.png)
![IDEA](images\构造方法2.png)

**! !全参数的构造方法只是省去创建对象时的定义**

**! !但是要修改时还是要使用Getter，Setter方法**
###**6.定义一个标准的类**
####**标准的类即 java bean**

![IDEA](images\标准类.png)
####**快速打出一个 java bean**
  **快捷键： Alt + Ins**
###**7.API**
![IDEA](images\API.png)
1.包路径
2.构造方法
3.方法摘要
###8.Scanner的使用
**首先要创建**
![IDEA](images\emm.png)
###9.匿名对象的说明
![IDEA](images\niming.png)

**使用建议：只使用一次**
####匿名对象作为方法的返回值
```java
public class  Demo02
{
    public static void main(String[] args)
{
       //普通使用方式
       Scanner sc = new Scanner(System.in);
       int num = sc.nextInt();
    
       //匿名对象的方式
       int num = new Scanner(System.in).nextInt();
       
       //使用一般写法传入参数
       Scanner sc = new Scanner(System.in);
       methodParam(sc);
       
       //使用匿名对象来进行传参
       methodParam(new Scanner(System.in));

       //使用匿名对象作为参数返回值
       Scanner sc = methodReturn();
       int num = sc.nextInt();
       System.out.println(num);
}
public  static  void methodParam(Scanner sc)
{
    int num = sc.nextInt();
    System.out.println(num);
}
public  static  void methodReturn()
{
    //Scanner sc = new Scanner(System.in);
    //return sc;
    return new Scanner(System.in);
}

}
```
****
**2020/11/17**
考核的好多大佬啊..抓紧时间冲冲冲了..
###10.对象数组
###**11.ArrayList集合**
####ArrayList
![IDEA](images\arraylist.png)
####**ArrayList常用方法**
![IDEA](images\arraylist2.png)
####ArrayList储存基本数据类型
![IDEA](images\arraylist3.png)

###12.String类
![IDEA](images\String.png)
![IDEA](images\String2.png)
####字符串的常量池
![IDEA](images\String3.png)

![IDEA](images\String4.png)

![IDEA](images\String5.png)

![IDEA](images\String6.png)\

![IDEA](images\String7.png)

![IDEA](images\String8.png) 

![IDEA](images\String9.png)

![IDEA](images\String10.png)

![IDEA](images\String11.png)

![IDEA](images\String12.png)


**字符串可以 +=**

###13.static静态关键字
####修饰成员变量
ID
![IDEA](images\id.png)
####修饰成员方法
![IDEA](images\static.png)

![IDEA](images\static2.png)
####静态代码块
![IDEA](images\staticcode.png)
###14.Arrays      
![IDEA](images\Arrays.png)

###15.Math
![IDEA](images\math.png)

###16.继承
####继承的概述
![IDEA](images\继承性.png)

####继承的格式
![IDEA](images\继承2.png)

####继承中成员变量的访问特点
![IDEA](images\继承3.png)

![IDEA](images\继承4.png)
####方法的覆盖重写
![IDEA](images\继承7.png)

####继承中的构造方法
![IDEA](images\继承10.png)

####this，super关键字的使用
![IDEA](images\继承11.png)

![IDEA](images\继承12.png)

####this，super的内存表示
![IDEA](images\继承15.png)

####java继承的三个特点
![IDEA](images\继承16.png)

####抽象
#####概念
#####使用
![IDEA](images\抽象.png)
#####注意事项
![IDEA](images\抽象2.png)
父类中的方法不确定如何以{}方法实现，那么就应该是一个抽象方法
###17.接口
####接口格式
![IDEA](images\接口.png)
####接口抽象方法的定义
![IDEA](images\接口2.png)

![IDEA](images\接口3.png)
####接口抽抽象方法的使用
![IDEA](images\接口4.png)
####接口默认方法
![IDEA](images\接口6.png)
####接口的静态方法
![IDEA](images\接口7.png)

![IDEA](images\接口8.png)
####接口的私有方法 解决接口重复代码

#####定义
![IDEA](images\接口9.png)
#####使用
![IDEA](images\接口10.png)
####接口的常量使用
![IDEA](images\接口11.png)
####**接口的内容小结**
![IDEA](images\接口总结.png)
####**继承父类并实现多个接口**
![IDEA](images\接口12.png)
####接口多继承
![IDEA](images\接口多继承.png)
###18.final
![IDEA](images\final.png)
###19.权限修饰符
![IDEA](images\权限.png)
###20.内部类
####成员内部类？
#####内部类定义使用
![IDEA](images\内部类.png)
![IDEA](images\内部类2.png)
#####内部类同名
![IDEA](images\内部类同名变量.png)
####局部内部类定义
![IDEA](images\局部内部类.png)
#####局部内部final使用
![IDEA](images\内部final.png)
####匿名内部类
#####匿名内部类定义
![IDEA](images\匿名内部类.png)
#####匿名内部类注意事项
![IDEA](images\匿名内部类注意事项.png)
###21.类作为成员变量类型
####练习代码在demo01
###Objects类
####toString方法
![IDEA](images\tostring.png)
![IDEA](images\tostring2.png)
####equals方法
#####重写object中的equals方法
![IDEA](images\obj.png)
![IDEA](images\obj2.png)
![IDEA](images\obj3.png)
#####objects中的equals方法
![IDEA](images\objs.png)

![IDEA](images\objs2.png)
#####object类总结
![IDEA](images\obj4.png)
###Stringbuilder类
![IDEA](images\stringbuilder.png)
###包装类
####
![IDEA](images\包装类.png)
####基本数据类型与字符串转换
![IDEA](images\包装类2.png)
###Collect集合
![IDEA](images\集合.png)
##3.git仓库使用 



###git语法

**git init 创建仓库**

**git add +文件名   将文件添加到监视列表当中**

**git commit -m '信息'  保存文件**

![IDEA](images\git.png)


**git remote add origin +链接  本地关联到github**

**git push -u origin master 将本地仓库推送到github上**


