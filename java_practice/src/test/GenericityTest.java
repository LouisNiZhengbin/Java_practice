package test;

import java.lang.reflect.Method;
import java.util.ArrayList;

public class GenericityTest {
    public static void main(String[] args) throws Exception{

        ArrayList<String> list = new ArrayList<>();
        list.add("this");
        list.add("is");

        //	strList.add(5);报错

        /********** 越过泛型检查    **************/

        //获取ArrayList的Class对象，反向的调用add()方法，添加数据
        Class listClass = list.getClass();
        //获取add()方法
        Method m = listClass.getMethod("add", Object.class);
        //调用add()方法
        m.invoke(list, 5);

        //遍历集合
        for(Object obj : list){
            System.out.println(obj);
        }
    }
}
