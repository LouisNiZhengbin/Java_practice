package reflection;

import charactor.Hero;

public class ObjectTest {
    public static void main(String[] args){
        String className="charactor.Hero";
        try{
           //获取类对象的第一种方式
            Class pClass1=Class.forName(className);
            //获取类对象的第二种方式
            Class pClass2=Hero.class;
            //获取类对象的第三种方式
            Class pClass3=Class.forName(className);

            System.out.println("输出Hero.class到底是什么东西:");
            System.out.println(pClass1);

            System.out.println("输出比较结果:");
            System.out.println(pClass1==pClass2);//输出true
            System.out.println(pClass1==pClass3);//输出true

        }catch (ClassNotFoundException e){
           e.printStackTrace();
        }
    }
}
