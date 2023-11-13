package com.yinhai.reflection;

import com.yinhai.reflection.question.ReflectionQuestion;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Properties;

/**
 * @author 银海
 * @version 1.0
 */
public class Reflection01 {
    public static void main(String[] args) throws  Exception {
        //3.使用反射机制解决
        //1)加载类
        Properties properties = new Properties();
        String propertiesPath = ReflectionQuestion.class.getClassLoader().getResource("re.properties").getPath();
        properties.load(new FileInputStream(propertiesPath));
        String classfullpath = properties.get("classfullpath").toString();
        String method = properties.get("method").toString();
        System.out.println("classfullpath=" + classfullpath);
        System.out.println("method=" + method);
        //java.lang.Class:代表一个类， Class对象表示某个类加载后在堆中的对象
        Class aClass = Class.forName(classfullpath);//返回了Class类型的对象
        //2)通过class得到你加载的类 com.yinhai.Cat的对象实例

        Object o = aClass.newInstance();
        System.out.println(o.getClass());//得到运行类型 class com.yinhai.Cat


        //Cat cat = (Cat)o;  cat.hi; 转了也没用，我们是希望上面获得的method的方法，因为我们不确定是有这个方法
        //3)所以 通过cLs得到你加载的类com.yinhai.Cat 的methodName"hi" 的方法对象
        //即在反射中，可以吧方法视为对象(万物皆对象)java.lang.reflect.Method:代表类的方法
        Method method1 = aClass.getMethod(method);//获得该对象的方法对象
        method1.invoke(o);//即不修改源码 我就可以通过外部配置文件调用得到该方法

        //4)通过method1调用方法；即方法对象来调用方法传入对象

        //java.lang.reflect.Field:代表类的成员变量
        //得到name字段  //getfileld不能得到私有属性
        Field ageField = aClass.getField("age");
        System.out.println(ageField.get(o));

        //java.lang.reflect.Constructor:代表类的构造方法
        Constructor constructor = aClass.getConstructor();//()中可以指定构造器参数类型返回无参构造器
        System.out.println(constructor);

        Constructor constructor1 = aClass.getConstructor(String.class);
        System.out.println(constructor1);

    }
}
