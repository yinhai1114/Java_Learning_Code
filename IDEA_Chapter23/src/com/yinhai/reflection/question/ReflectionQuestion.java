package com.yinhai.reflection.question;

import com.yinhai.Cat;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Properties;

/**
 * @author 银海
 * @version 1.0
 */
public class ReflectionQuestion {
    public static void main(String[] args) throws IOException, ClassNotFoundException, IllegalAccessException, InstantiationException, NoSuchMethodException, InvocationTargetException {
        //根据配置文件 re.properties类 指定信息 创建Cat对象调用方法
        //传统方法
        //Cat cat = new Cat();
        //cat.hi();

        //使用Properties类,可以读写配置文件
        Properties properties = new Properties();
        String propertiesPath = ReflectionQuestion.class.getClassLoader().getResource("re.properties").getPath();
        properties.load(new FileInputStream(propertiesPath));
        String classfullpath = properties.get("classfullpath").toString();
        String method = properties.get("method").toString();
        System.out.println("classfullpath=" + classfullpath);
        System.out.println("method=" + method);

        //也无法这样得到对象
        //new classfullpath;

        //3.使用反射机制解决
        //1)加载类
        Class aClass = Class.forName(classfullpath);//返回了Class类型的对象
        //2)通过class得到你加载的类 com.yinhai.Cat的对象实例
        Object o = aClass.newInstance();
        System.out.println(o.getClass());//得到运行类型 class com.yinhai.Cat


        //Cat cat = (Cat)o;  cat.hi; 转了也没用，我们是希望上面获得的method的方法，因为我们不确定是有这个方法
        //3)所以 通过cLs得到你加载的类com.yinhai.Cat 的methodName"hi" 的方法对象
        //即在反射中，可以吧方法视为对象(万物皆对象)
        Method method1 = aClass.getMethod(method);//获得该对象的方法对象
        //4)通过method1调用方法；即方法对象来调用方法传入对象
        method1.invoke(o);//即不修改源码 我就可以通过外部配置文件调用得到该方法

    }
}
