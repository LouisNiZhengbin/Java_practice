package reflection;

import charactor.HeroPlus;

import java.lang.reflect.Field;

public class ParaTest {
    public static void main(String[] args){
        HeroPlus h= new HeroPlus();
        //使用传统的方式修改name的值为green
        h.name="garen";

        try{
            //获取类HeroPlus的名字叫做name的字段
            Field f1=h.getClass().getDeclaredField("name");
            //修改这个字段的值
            f1.set(h, "teemo");
            //打印被修改后的值
            System.out.println(h.name);

        }catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}
