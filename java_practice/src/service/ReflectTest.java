package service;

import reflection.MethodTest;

import java.io.File;
import java.io.FileInputStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.Properties;

/*
Java的Properties类

Properties继承字Hashtable类，采用键值对应的存储方式
属性文件中的每一行都是一个键值对应，所以每一行都代表了一个属性对象，每一行都将以键和值的关系存储到Properties中
Properties类提供了getProperty(String key)方法用来通过键名读取键值
文件的内容格式是“键=值”
 */

public class ReflectTest {
    @SuppressWarnings({"rawtypes","unchecked"})
    public static void main(String[] args) throws Exception{
        //从spring.txt中获取类名称和方法名称
        File springConfigFile = new File("F:\\项目\\java项目\\practice\\src\\service\\spring.txt");
        Properties springConfig = new Properties();
        springConfig.load(new FileInputStream(springConfigFile));
        String className = (String) springConfig.get("class");
        String methodName = (String) springConfig.get("method");

        //根据类名称获取类对象
        Class clazz = Class.forName(className);
        //根据方法名称，获取方法对象
        Method m = clazz.getMethod(methodName);
        //获取构造器
        Constructor c = clazz.getConstructor();
        //根据构造器，实例化出对象class
        Object service = c.newInstance();
        //调用对象的指定方法
        m.invoke(service);

    }
}
