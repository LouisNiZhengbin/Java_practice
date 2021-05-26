package reflection;

import charactor.HeroPlus;

import java.lang.reflect.Method;

/*
1 获取HeroPlus类的对象 h
2 获取成员方法：
    public Method getMethod(String name, Class<?> ... parameterTypes)； 获取“公有方法”
    public Method getDeclaredMethods(String name, Class<?>... parameterTypes); 获取成员方法，包括私有的（不包括继承的）
    参数解释：
        name: 方法名
        Class ...: 形参的Class类型对象

3 调用方法
    Method --> public Object invoke(Object obj, Object ...args);
    参数说明:
        obj: 要调用方法的对象
        args: 调用方式时所传递的实参
 */

public class MainTest {
    public static void main(String[] args){
        try{
            //1 获取HeroPlus对象的字节码
            Class clazz = Class.forName("charactor.HeroPlus");

            //2 获取main方法，第一个参数：方法名称， 第二个参数：方法形参的类型
            Method methodMain = clazz.getMethod("main", String[].class);
            //3 调用main方法
            // methodmain.invoke(null, new String[]{"a", "b", "c"});
            //第一个参数，对象类型，因为方法是static静态的，所以为null可以，第二个参数String数组，这里要注意在jdk1.4时
            //是数组，jdk1.5之后是可变参数
            methodMain.invoke(null, (Object)new String[]{"a","b","c"}); //方式1
            //methodMain.invoke(null, new Object[]{new String[]{"a","b","c"}}); //方式2


        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}
