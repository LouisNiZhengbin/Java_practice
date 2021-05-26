package annotation;

//服务于注解的注解为元注解
/*
服务于注解的注解称之为元注解，主要用来标识你写的注解保留范围（作用范围）以及出现的位置
四种元注解
@Retention:注解的保留范围，是个枚举，有如下可选值
RetentionPolicy:SOURCE：注解存在于源文件中
RetentionPolicy:CLASS:注解存在于源字节码文件中
RetentionPolicy:RUNTIME:注解存在于运行时

@Target:注解出现的位置（比如字段上、方法上等）

@Documented:用于指定被该元Annotation修饰的Annotation类将被javadoc工具提取成文档

@Inherited:被它修饰的Annotation将具有继承性，如果某个类使用了被@Inherited修饰的Annotation，则其子类将自动具有该注解

常用的是前两种
 */

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME) //注解存在于运行时
@Target(ElementType.METHOD) //说明MyTest注解只能用在方法上

public @interface MyTest {
}
