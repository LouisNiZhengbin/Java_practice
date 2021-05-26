package annotation;

/*
@Override 用在方法上，表示这个方法重写了父类的方法，如toString()
如果父类没有这个方法，那么就无法编译通过，如例所示，在fromString()方法上加上@Override注解，就会失败
因为Hero类的父类Object,并没有fromString方法

@Deprecated 表示这个方法已经过期，不建议开发者使用

@SuppressWarnings Suppress英文的意思是抑制，这个注解的用处是忽略警告信息
比如大家使用集合的时候，有时候为了偷懒，会不写泛型，像这样
 */

import java.util.ArrayList;
import java.util.List;

public class Hero {
    String name;
    @Override
    public String toString(){
        return name;
    }

    //@Override
    //public String fromString(){
    //    return name;
    //}

    @Deprecated
    //public void hackMap(){}

    //public static void main(String[] args){
    //    new Hero().hackMap();
    //}

    @SuppressWarnings({"rawtypes", "unused"})
    public static void main(String[] args){
        List heros = new ArrayList();
    }
}
