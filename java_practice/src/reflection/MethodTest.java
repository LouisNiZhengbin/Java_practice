package reflection;

import charactor.HeroPlus;
import java.lang.reflect.Method;

public class MethodTest {
    public static void main(String[] args){
        HeroPlus h = new HeroPlus();

        try{
            //获取这个名字叫做setName，参数类型是String的方法
            Method m = h.getClass().getMethod("setName", String.class);
            //对h对象，调用这个方法
            m.invoke(h, "盖伦");

        }catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}
