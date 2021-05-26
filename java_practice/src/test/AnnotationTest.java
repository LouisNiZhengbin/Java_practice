package test;

import annotation.MyAnnotation;

import java.lang.reflect.Method;

public class AnnotationTest {
   //利用反射获取方法上的注解，并获取对应的值
   public static void main(String[] args) throws Exception{
       Class clazz = Class.forName("test.AnnotationTest");
       Method[] ms = clazz.getMethods();
       for(Method m : ms){
           if(m.isAnnotationPresent(MyAnnotation.class)){
               String value = m.getAnnotation(MyAnnotation.class).value();
               String name = m.getAnnotation(MyAnnotation.class).name();
               System.out.println("value:"+value);
               System.out.println("name:"+name);
           }
       }
   }

    @MyAnnotation(value="123", name="lisi")
    public static void test(){
        System.out.println("这是test");
    }
}
